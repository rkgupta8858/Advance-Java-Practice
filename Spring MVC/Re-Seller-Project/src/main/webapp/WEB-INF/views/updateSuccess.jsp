<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>

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

    .success-box {
        width: 450px;
        margin: 80px auto;
        background: white;
        padding: 35px;
        border-radius: 12px;
        text-align: center;
        box-shadow: 0px 4px 12px rgba(0,0,0,0.15);
        border-top: 5px solid #28a745;
    }

    h2 {
        color: #28a745;
        font-size: 24px;
        margin-bottom: 15px;
    }

    .btn {
        display: inline-block;
        text-decoration: none;
        padding: 12px 20px;
        background-color: #ffa41c;
        font-size: 16px;
        border-radius: 6px;
        color: black;
        font-weight: bold;
        margin: 10px;
    }

    .btn:hover {
        background-color: #f08804;
    }
</style>

</head>
<body>

    <div class="header">Product Status</div>

    <div class="success-box">

        <h2>Product Updated Successfully!</h2>

        <a href="viewProducts" class="btn">View All Products</a>
        <a href="reSellerDashBoardContr" class="btn">Dashboard</a>

    </div>

</body>
</html>
