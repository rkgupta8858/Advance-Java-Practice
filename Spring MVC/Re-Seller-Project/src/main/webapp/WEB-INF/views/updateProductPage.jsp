<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>

<style>
    body { margin:0; padding:0; background:#f3f3f3; font-family:"Amazon Ember", Arial; }
    .header { background:#131921; color:white; padding:15px 25px; font-size:22px; font-weight:bold; display:flex; justify-content:space-between; align-items:center; }
    .dash-btn { background:#ffa41c; padding:8px 16px; border-radius:6px; text-decoration:none; color:black; font-weight:bold; }
    .container { width:450px; margin:50px auto; background:white; padding:30px; border-radius:12px; box-shadow:0 3px 10px rgba(0,0,0,0.15); }
    input[type="text"], input[type="number"] { width:95%; padding:10px; border:1px solid #a6a6a6; border-radius:6px; margin-bottom:15px; }
    input[type="submit"] { width:100%; padding:12px; background:#ffa41c; border:none; cursor:pointer; }
</style>

</head>
<body>

    <div class="header">
        <span>Update Product</span>
        <a href="reSellerDashBoard" class="dash-btn">Dashboard</a>
    </div>

    <div class="container">

        <h2>Update Product</h2>

        <form action="updateProduct" method="post">

            <input type="hidden" name="id" value="${prod.id}">

            Product Name:<br>
            <input type="text" name="name" value="${prod.name}" required><br>

            Category:<br>
            <input type="text" name="category" value="${prod.category}" required><br>

            Price:<br>
            <input type="number" step="0.01" name="price" value="${prod.price}" required><br>

            Quantity:<br>
            <input type="number" name="quantity" value="${prod.quantity}" required><br>

            <input type="submit" value="Update Product">

        </form>

    </div>

</body>
</html>
