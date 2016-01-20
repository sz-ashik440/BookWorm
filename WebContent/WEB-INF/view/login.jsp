<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Join US</title>
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

		<form class="form-signin" action="login" method="post">

			<h2 class="form-signin-heading">Login</h2>

			<input type="text" class="form-control" placeholder="User Name"
				name="userName" required autofocus> <input type="password"
				class="form-control" placeholder="Password" name="password" required>


			<button class="btn btn-lg btn-primary btn-block" type="submit">Log
				in</button>
			<span>Not a Member? join us here: </span> <a href="register"><button
					type="button" class="btn btn-link navButton">Registration</button></a>
		</form>

	</div>

	<script type="text/javascript" src="<c:url value="/js/jquery.min.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/js/bootstrap.min.js"/>"></script>
</body>
</html>