<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href='<c:url value="/css/bootstrap.min.css"/>'>
<link rel="stylesheet" href='<c:url value="/css/signin.css"/>'>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="/BookWorm/index">BookWorm</a>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
		
		<form class="form-signin" action="register" method="post">

			<h2 class="form-signin-heading">Registration</h2>

			<input type="text" id="inputEmail" class="form-control"
				placeholder="User Name" name="userName" required autofocus>
				
			<input type="password" id="inputEmail" class="form-control"
				placeholder="Password" name="passWord" required autofocus>
			
			<input type="password" id="inputPassword" class="form-control"
				placeholder="Re-Type Password" name="rePassword" required>

			<button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
			<span>Already a member?</span> 
			<a href="login"><button type="button" class="btn btn-link navButton">Login</button></a>
		</form>
	</div>
	
	<script type="text/javascript" src="<c:url value="/js/jquery.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js"/>"></script>

</body>
</html>