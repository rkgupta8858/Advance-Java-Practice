<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Re-Seller Login</title>

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
}

.login-container {
    width: 420px;
    margin: 60px auto;
    background: white;
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0 2px 8px rgba(0,0,0,0.15);
}

.login-container h2 {
    text-align: center;
    margin-bottom: 20px;
    color: #232f3e;
}

label {
    font-size: 16px;
    font-weight: bold;
    color: #111;
}

input[type="text"], input[type="password"] {
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

/* Error message */
.error-box {
    background-color: #ffdddd;
    color: #c0392b;
    border: 1px solid #c0392b;
    padding: 10px;
    margin-bottom: 20px;
    border-radius: 6px;
    font-weight: bold;
    text-align: center;
}
</style>

</head>
<body>

    <div class="header">Re-Seller Login</div>

    <div class="login-container">

        <h2>Welcome to Re-Seller Login Page</h2>

        <!-- ERROR MESSAGE USING ONLY EL -->
        <%
            String err = (String) request.getAttribute("error");
            if (err != null) {
        %>
            <div class="error-box"><%= err %></div>
        <%
            }
        %>

        <form action="reSellerDash" method="post">

            <label>Email :</label><br>
            <input type="text" name="email" required /><br>

            <label>Password :</label><br>
            <input type="password" name="password" required /><br>

            <input type="submit" value="Login">
        </form>

    </div>

</body>
</html>
