<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Added</title>

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
        text-align: center;
    }

    .box {
        width: 450px;
        margin: 80px auto;
        background: white;
        padding: 35px;
        border-radius: 12px;
        text-align: center;
        box-shadow: 0px 4px 12px rgba(0,0,0,0.15);
        border-top: 5px solid #28a745;
    }

    .box h2 {
        color: #28a745;
        font-size: 24px;
        margin-bottom: 10px;
    }

    .msg {
        font-size: 18px;
        font-weight: bold;
        margin-bottom: 25px;
        color: #111;
    }

    a.btn {
        display: inline-block;
        text-decoration: none;
        padding: 12px 20px;
        background-color: #ffa41c;
        font-size: 16px;
        border-radius: 6px;
        color: black;
        font-weight: bold;
        margin: 8px;
    }

    a.btn:hover {
        background-color: #f08804;
    }
</style>

</head>
<body>

    <div class="header">Re-Seller Product Status</div>

    <div class="box">

        <h2>Success!</h2>

        <div class="msg">
            Product Added Successfully!
        </div>

        <a href="addProduct" class="btn">Add Another Product</a>
        <a href="viewProducts" class="btn">View All Products</a>
        <a href="reSellerDashBoardContr" class="btn">Back to Dashboard</a>

    </div>

</body>
</html>
