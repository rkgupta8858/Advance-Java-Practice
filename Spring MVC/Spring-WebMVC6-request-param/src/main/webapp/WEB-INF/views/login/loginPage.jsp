<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, Helvetica, sans-serif;
        background: linear-gradient(135deg, #4c6ef5, #15aabf);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .login-container {
        background: #ffffff;
        width: 350px;
        padding: 30px;
        border-radius: 12px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
        text-align: center;
    }

    .login-container h2 {
        margin-bottom: 20px;
        color: #333333;
    }

    .input-box {
        width: 100%;
        padding: 12px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 15px;
    }

    .btn {
        width: 100%;
        padding: 12px;
        background: #4c6ef5;
        color: white;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        font-size: 16px;
        font-weight: bold;
        transition: 0.3s;
    }

    .btn:hover {
        background: #364fc7;
    }

</style>

</head>
<body>

    <div class="login-container">
        <h2>Login</h2>
        
        <form action="validateLogin">
            <input type="text" name="userName" placeholder="Enter User Name" class="input-box" required />
            <input type="password" name="password" placeholder="Enter Password" class="input-box" required />
            <input type="submit" value="Login" class="btn"/>
        </form>
    </div>

</body>
</html>
