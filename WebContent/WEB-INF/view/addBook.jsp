<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href='<c:url value="/css/bootstrap.min.css"/>'>
</head>
<body>
	<form class="form-horizontal" align="center" method="post" action="addBook">
		<div class="form-group">
			<label for="inputBookName" class="col-sm-2 control-label">Book Name</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" 
					placeholder="Book Name" name="bookName" required>
			</div>
		</div>
		
		<div class="form-group">
			<label for="inputBookEdition" class="col-sm-2 control-label">Book Edition</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" 
					placeholder="Book Edition" name="bookEdition" required>
			</div>
		</div>
		
		<div class="form-group">
			<label for="inputGener" class="col-sm-2 control-label">Gener</label>
			<div class="col-sm-4">
				<select name="bookGener">
					<option value="none" selected>-NONE-</option>
					<option value="sci-fi">Science fiction</option>
					<option value="drama">Drama</option>
					<option value="mystery">Mystery</option>
					<option value="scienece">Science</option>
					<option value="math">Math</option>
					<option value="encyclopedias">Encyclopedias</option>
					<option value="art">Art</option>
				</select>
			</div>
		</div>
		
		<div class="form-group">
			<label for="inputQuantity" class="col-sm-2 control-label">Book Quantity</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" 
					placeholder="Quantity" name="quantity" required>
			</div>
		</div>
		<div class="form-group">
			<label for="inputPrice" class="col-sm-2 control-label">Price</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" 
					placeholder="Price" name="price" required>
			</div>
		</div>
		
		
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-4">
				<button type="submit" class="btn btn-default">Add to List</button>
			</div>
		</div>
		
	</form>


	<script type="text/javascript" src="<c:url value="/js/jquery.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js"/>"></script>
</body>
</html>