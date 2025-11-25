<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reseller Dashboard</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Amazon Ember", Arial, sans-serif;
        background-color: #f3f3f3;
    }

    /* Header */
    .header {
        background-color: #131921;
        color: white;
        padding: 18px 30px;
        font-size: 26px;
        font-weight: bold;
        text-align: center;
    }

    /* Dashboard container */
    .dashboard-box {
        width: 80%;
        margin: 40px auto;
        text-align: center;
    }

    .dashboard-box h1 {
        color: #232f3e;
        margin-bottom: 30px;
        font-size: 28px;
    }

    /* Grid layout */
    .grid {
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        gap: 25px;
        margin-top: 20px;
    }

    /* Card design */
    .card {
        background: white;
        padding: 30px;
        border-radius: 12px;
        box-shadow: 0px 3px 10px rgba(0,0,0,0.15);
        text-decoration: none;
        color: #111;
        font-size: 20px;
        font-weight: bold;
        transition: 0.3s;
        border-top: 5px solid #ffa41c;
    }

    .card:hover {
        transform: translateY(-6px);
        box-shadow: 0px 6px 14px rgba(0,0,0,0.20);
        background: #fff3df;
    }

    /* Icon style */
    .icon {
        font-size: 40px;
        margin-bottom: 12px;
        display: block;
        color: #ffa41c;
    }

</style>

</head>
<body>

    <div class="header">Amazon Re-Seller Dashboard</div>

    <div class="dashboard-box">
        <h1>Welcome to Reseller Dashboard</h1>

        <div class="grid">

            <a href="addProduct" class="card">
                <span class="icon">➕</span>
                Add Product
            </a>

            <a href="viewProducts" class="card">
                <span class="icon">✏️</span>
                Update Product
            </a>

            <a href="viewProducts" class="card">
                <span class="icon">🗑️</span>
                Delete Product
            </a>

            <a href="viewProducts" class="card">
                <span class="icon">📦</span>
                View All Products
            </a>

        </div>
    </div>

</body>
</html>
