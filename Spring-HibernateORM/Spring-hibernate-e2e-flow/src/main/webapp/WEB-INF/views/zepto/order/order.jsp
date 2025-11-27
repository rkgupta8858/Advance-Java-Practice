<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Zepto Order Page...</h1>
	<form action="placeOrder" method="post">
		Item Name : <input type="text" name="item" /> <br><br>
		Quantity : <input type="text" name="qty" /> <br><br>
		Item Price : <input type="text" name="price" /> <br><br>
		Address : <input type="text" name="address" /> <br><br>
		<input type="submit" value="Order" />
	</form>
</body>
</html>