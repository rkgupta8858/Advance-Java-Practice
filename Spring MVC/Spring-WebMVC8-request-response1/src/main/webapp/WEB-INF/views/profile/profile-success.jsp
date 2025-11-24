<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Created</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #11998e, #38ef7d);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .box {
        background: #ffffff;
        padding: 40px 35px;
        border-radius: 14px;
        text-align: center;
        width: 450px;
        box-shadow: 0 6px 20px rgba(0,0,0,0.22);
        animation: pop 0.5s ease-out;
    }

    @keyframes pop {
        from { transform: scale(0.9); opacity: 0; }
        to   { transform: scale(1); opacity: 1; }
    }

    h1 {
        color: #333;
        font-size: 26px;
        margin-bottom: 20px;
    }

    .highlight {
        font-size: 30px;
        color: #007bff;
        font-weight: bold;
    }

    a {
        display: inline-block;
        margin-top: 25px;
        padding: 12px 25px;
        background: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 8px;
        font-weight: bold;
        font-size: 16px;
        transition: 0.3s;
    }

    a:hover {
        background: #0056b3;
    }

</style>

</head>
<body>

    <div class="box">
        <h1>Profile has been created successfully!</h1>

        <h1>Your User ID is: <span class="highlight">${userId}</span></h1>

        <a href="home">Go to Home</a>
    </div>

</body>
</html>
