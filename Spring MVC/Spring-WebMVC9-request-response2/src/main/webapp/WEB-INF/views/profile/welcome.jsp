<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #0083b0, #00b4db);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .card {
        background: #fff;
        padding: 40px 50px;
        border-radius: 14px;
        width: 450px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.15);
        text-align: center;
    }

    h1 {
        margin-bottom: 20px;
        color: #333;
        font-size: 28px;
    }

    .info {
        font-size: 15px;
        color: #444;
        text-align: left;
        margin-top: 20px;
        line-height: 1.7;
    }

    .back-btn {
        margin-top: 25px;
        display: inline-block;
        padding: 10px 25px;
        background: #ff7b00;
        color: white;
        font-size: 14px;
        font-weight: bold;
        border-radius: 6px;
        text-decoration: none;
        transition: 0.2s ease;
    }

    .back-btn:hover {
        background: #e46f00;
        box-shadow: 0 6px 15px rgba(0,0,0,0.2);
        transform: translateY(-2px);
    }
</style>

</head>
<body>

<div class="card">
    <h1>Welcome, ${user.firstName}!</h1>

    <div class="info">
        <p><strong>First Name:</strong> ${user.firstName}</p>
        <p><strong>Last Name :</strong> ${user.lastName}</p>
        <p><strong>Email     :</strong> ${user.email}</p>
        <p><strong>Phone     :</strong> ${user.phone}</p>
    </div>

    <a href="create" class="back-btn">Create Another</a>
</div>

</body>
</html>
