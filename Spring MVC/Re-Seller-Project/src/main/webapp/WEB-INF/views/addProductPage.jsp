<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>

<style>
    body {
        margin: 0;
        padding: 0;
        background-color: #f3f3f3;
        font-family: "Amazon Ember", Arial, sans-serif;
    }

    .header {
        background-color: #131921;
        color: white;
        padding: 15px 25px;
        font-size: 22px;
        font-weight: bold;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .dash-btn {
        text-decoration: none;
        background-color: #ffa41c;
        padding: 8px 16px;
        border-radius: 6px;
        font-size: 15px;
        color: black;
        font-weight: bold;
    }

    .dash-btn:hover {
        background-color: #f08804;
    }

    .container {
        width: 450px;
        margin: 50px auto;
        background: white;
        padding: 30px;
        border-radius: 12px;
        box-shadow: 0px 3px 10px rgba(0,0,0,0.15);
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #232f3e;
        font-size: 24px;
    }

    label {
        font-size: 16px;
        font-weight: bold;
        color: #111;
    }

    input[type="text"],
    input[type="number"] {
        width: 95%;
        padding: 10px;
        border: 1px solid #a6a6a6;
        border-radius: 6px;
        margin-bottom: 15px;
        font-size: 14px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        border: none;
        background-color: #ffa41c;
        font-size: 16px;
        border-radius: 6px;
        font-weight: bold;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #f08804;
    }
</style>

</head>
<body>

    <!-- HEADER WITH DASHBOARD BUTTON -->
    <div class="header">
        <span>Add Product</span>
        <a href="reSellerDashBoardContr" class="dash-btn">Dashboard</a>
    </div>

    <div class="container">
        <h2>Add Product</h2>

        <form action="saveProduct" method="post">

            <label>Product Name:</label><br>
            <input type="text" name="name" required><br>

            <label>Category:</label><br>
            <input type="text" name="category" required><br>

            <label>Price:</label><br>
            <input type="number" step="0.01" name="price" required><br>

            <label>Quantity:</label><br>
            <input type="number" name="quantity" required><br>

            <input type="submit" value="Add Product">

        </form>
    </div>

</body>
</html>
