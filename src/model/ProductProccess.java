package model;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductProccess {
	
	public ProductProccess(){
		
	}
	
	public void addToBookList(ProductBean pro ){
		try{
			Connection conn = dbConnect.connectDB();
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO bookList VALUES(null,?,?,?,?,?,?,?)");
			
			ps.setString(1, pro.getBookName());
            ps.setString(2, pro.getBookEdition());
            ps.setString(3, pro.getGener());
            ps.setInt(4, pro.getQuantity());
            ps.setDouble(5, pro.getPrice());
            ps.setString(6, pro.getImageURL());
            ps.setString(7, pro.getDetails());
            

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
	
	public List<ProductBean> getAllBook() {
		List<ProductBean> products = new ArrayList<ProductBean>();
		try {
			Connection conn = dbConnect.connectDB();

			PreparedStatement ps = conn
					.prepareStatement("SELECT * FROM bookList");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ProductBean tempProduct = new ProductBean();
				tempProduct.setBookID(rs.getInt("bookID"));
				tempProduct.setBookName(rs.getString("bookName"));
				tempProduct.setBookEdition(rs.getString("bookEdition"));
				tempProduct.setGener(rs.getString("gener"));
				tempProduct.setQuantity(rs.getInt("quantity"));
				tempProduct.setPrice(rs.getDouble("price"));
				tempProduct.setImageURL(rs.getString("imageURL"));
				tempProduct.setDetails(rs.getString("details"));
				products.add(tempProduct);
			}
			ps.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
		return products;
	}
	
	public void deleteProduct(int bID){
		
		try{
			Connection conn = dbConnect.connectDB();
			
			PreparedStatement ps = conn.prepareStatement("DELETE FROM bookList WHERE bookID=?");
			ps.setInt(1, bID);
			
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
	

}
