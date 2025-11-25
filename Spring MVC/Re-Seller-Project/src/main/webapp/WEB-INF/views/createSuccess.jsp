<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Created</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Amazon Ember", Arial, sans-serif;
        background-color: #f3f3f3;
    }

    /* Center Box */
    .success-box {
        width: 450px;
        margin: 80px auto;
        background: white;
        padding: 30px;
        border-radius: 12px;
        text-align: center;
        box-shadow: 0 2px 10px rgba(0,0,0,0.15);
        border-top: 4px solid #28a745;
    }

    .success-box h2 {
        color: #28a745;
        margin-bottom: 15px;
        font-size: 24px;
        font-weight: bold;
    }

    .success-text {
        font-size: 18px;
        margin-bottom: 25px;
        color: #111;
    }

    .home-btn {
        display: inline-block;
        padding: 12px 25px;
        background-color: #ffa41c;
        color: black;
        text-decoration: none;
        font-size: 16px;
        font-weight: bold;
        border-radius: 6px;
        transition: 0.2s;
    }

    .home-btn:hover {
        background-color: #f08804;
    }
</style>

</head>
<body>

    <div class="success-box">
        <h2>Success!</h2>
        <div class="success-text">
            Your Account has been created Successfully..
        </div>

        <a href="index.jsp" class="home-btn">Go to Home Page</a>
    </div>

</body>
</html>
