<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome | MakeMyTrip</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #005bea, #00c6fb);
        height: 100vh;
        display: flex;
        align-items: center;
        justify-content: center;
    }

    .container {
        background: #ffffff;
        padding: 40px 50px;
        border-radius: 12px;
        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.15);
        text-align: center;
        max-width: 450px;
        width: 100%;
    }

    .logo {
        font-size: 26px;
        font-weight: bold;
        color: #005bea;
        margin-bottom: 5px;
    }

    .tagline {
        font-size: 14px;
        color: #666;
        margin-bottom: 25px;
    }

    h2 {
        margin: 0 0 15px 0;
        color: #333;
    }

    p {
        font-size: 14px;
        color: #555;
        margin-bottom: 30px;
    }

    .btn-primary {
        display: inline-block;
        padding: 12px 30px;
        background: #ff6b00;
        color: #fff;
        text-decoration: none;
        font-size: 14px;
        font-weight: bold;
        border-radius: 50px;
        border: none;
        cursor: pointer;
        transition: transform 0.15s ease, box-shadow 0.15s ease, background 0.15s ease;
    }

    .btn-primary:hover {
        background: #e35f00;
        box-shadow: 0 6px 15px rgba(0, 0, 0, 0.2);
        transform: translateY(-1px);
    }

    .small-text {
        margin-top: 15px;
        font-size: 12px;
        color: #888;
    }
</style>
</head>
<body>

<div class="container">
    <div class="logo">MakeMyTrip</div>
    <div class="tagline">Plan. Book. Travel. Repeat.</div>

    <h2>Welcome to MakeMyTrip!</h2>
    <p>
        Create your account to easily book flights, hotels, and holiday packages,
        and manage all your trips in one place.
    </p>

    <a href="create" class="btn-primary">Create Account</a>

    <div class="small-text">
        Already have an account? <a href="login" style="color:#005bea; text-decoration:none; font-weight:bold;">Login</a>
    </div>
</div>

</body>
</html>
