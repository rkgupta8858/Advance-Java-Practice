<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Account</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #00b4db, #0083b0);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .form-container {
        background: #ffffff;
        padding: 35px 45px;
        border-radius: 12px;
        width: 400px;
        box-shadow: 0px 10px 25px rgba(0, 0, 0, 0.15);
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    label {
        display: block;
        margin-bottom: 6px;
        font-size: 14px;
        color: #444;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 18px;
        border-radius: 6px;
        border: 1px solid #aaa;
        font-size: 14px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        border: none;
        background: #ff7b00;
        color: white;
        font-size: 16px;
        font-weight: bold;
        border-radius: 6px;
        cursor: pointer;
        transition: 0.2s ease;
    }

    input[type="submit"]:hover {
        background: #e46f00;
        transform: translateY(-2px);
        box-shadow: 0 6px 15px rgba(0, 0, 0, 0.2);
    }

    .back-link {
        text-align: center;
        margin-top: 12px;
        font-size: 13px;
    }

    .back-link a {
        color: #0083b0;
        text-decoration: none;
        font-weight: bold;
    }

    .back-link a:hover {
        text-decoration: underline;
    }
</style>

</head>
<body>

<div class="form-container">
    <h2>Create Account</h2>

    <form action="create-success">
        <label>First Name:</label>
        <input type="text" name="firstName" required>

        <label>Last Name:</label>
        <input type="text" name="lastName" required>

        <label>Email:</label>
        <input type="text" name="email" required>

        <label>Phone:</label>
        <input type="text" name="phone" required>

        <input type="submit" value="Create">
    </form>

    <div class="back-link">
        <a href="home">← Back to Home</a>
    </div>
</div>

</body>
</html>
