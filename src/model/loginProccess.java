package model;

import java.sql.*;

public class loginProccess {
	public void storeToDB(UserBean usr) {
		try {
			Connection conn = dbConnect.connectDB();

			PreparedStatement ps = conn.prepareStatement("INSERT INTO userInfo VALUES(null,?,?,\"user\")");

			ps.setString(1, usr.getUserName());
			ps.setString(2, usr.getPassword());

			ps.executeUpdate();

			ps.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}

	}
	
	public UserBean resetUserType(UserBean usr){
		UserBean ui = new UserBean();
		try {
			Connection conn = dbConnect.connectDB();

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM userInfo WHERE userName = ? AND password = ?");

			ps.setString(1, usr.getUserName());
			ps.setString(2, usr.getPassword());

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				ui.setUserType(rs.getString("userType"));				
			}

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
		
		return ui;
	}

	public boolean varifyFromDB(UserBean usr) {
		try {
			Connection conn = dbConnect.connectDB();

			PreparedStatement ps = conn
					.prepareStatement("SELECT * FROM userInfo WHERE userName = ? AND password = ?");

			ps.setString(1, usr.getUserName());
			ps.setString(2, usr.getPassword());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
		return false;
	}

//	public boolean isRegFeildEmpty(UserBean usr) {
//		if (usr.getUserName().isEmpty() || usr.getPassword().isEmpty()
//				|| usr.getRePassword().isEmpty()) {
//			return true;
//		} else
//			return false;
//	}

//	public boolean isloginFeildEmpty(UserBean usr) {
//		if (usr.getUserName().isEmpty() || usr.getPassword().isEmpty()) {
//			return true;
//		} else
//			return false;
//	}

	public boolean isRegPassMissMatch(UserBean usr) {
		if (!usr.getPassword().equals(usr.getRePassword())) {
			return true;
		} else
			return false;
	}

	public boolean checkAvailableFromDB(UserBean usr) {
		try {
			Connection conn = dbConnect.connectDB();

			PreparedStatement ps = conn
					.prepareStatement("SELECT * FROM userInfo WHERE userName = ?");

			ps.setString(1, usr.getUserName());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return false;
			} else {
				return true;
			}

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
		return true;
	}

}
