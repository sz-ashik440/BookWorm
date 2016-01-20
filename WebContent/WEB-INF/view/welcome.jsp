<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href='<c:url value="/css/bootstrap.min.css"/>'>
<link rel="stylesheet" href='<c:url value="/css/style.css"/>'>
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

				<div class="nav navbar-nav navbar-right">
					<a href="logout"><button type="button"
							class="btn btn-default navbar-btn ">Log out</button></a>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
		
		<div class="table-responsive tab-back">
			<table class="table table-hover">
				<thead>
					<th>BookID</th>
					<th>Book Name</th>
					<th>Book Edition</th>
					<th>Gener</th>
					<th>Quantity</th>					
					<th>Price</th>
					<th>Cart</th>					
				</thead>
				

				<tbody>
					<c:forEach var="pro" items="${products}">
						<tr>
							<td><c:out value="${pro.bookID}"></c:out></td>
							<td><c:out value="${pro.bookName}"></c:out></td>
							<td><c:out value="${pro.bookEdition }"></c:out></td>
							<td><c:out value="${pro.gener }"></c:out></td>
							<td><c:out value="${pro.quantity }"></c:out></td>
							<td>$<c:out value="${pro.price }"></c:out></td>							
							<td><a href="#">Add CART</a></td>
							
														
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<script type="text/javascript" src="<c:url value="/js/jquery.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js"/>"></script>
</body>
</html>