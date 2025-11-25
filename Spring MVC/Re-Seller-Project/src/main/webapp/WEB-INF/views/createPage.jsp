<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Account - Re-Seller</title>

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
        padding: 15px 25px;
        font-size: 22px;
        font-weight: bold;
    }

    /* Form container */
    .form-container {
        width: 450px;
        margin: 40px auto;
        background: white;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 2px 8px rgba(0,0,0,0.1);
    }

    h2 {
        text-align: center;
        color: #232f3e;
        margin-bottom: 20px;
    }

    label {
        font-size: 16px;
        display: block;
        margin-bottom: 6px;
        font-weight: bold;
        color: #111;
    }

    input[type="text"],
    input[type="password"] {
        width: 96%;
        padding: 10px;
        border: 1px solid #a6a6a6;
        border-radius: 6px;
        margin-bottom: 15px;
        font-size: 14px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background-color: #ffa41c;
        border: none;
        font-size: 16px;
        border-radius: 6px;
        font-weight: bold;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #f08804;
    }
</style>

</head>
<body>

    <div class="header">Re-Seller Create Account</div>

    <div class="form-container">
        <h2>Create Your Account</h2>

        <form action="createAccount" method="post">
            <label>Name:</label>
            <input type="text" name="name" required/>

            <label>Email:</label>
            <input type="text" name="Email" required/>

            <label>Phone:</label>
            <input type="text" name="phone" required/>

            <label>Password:</label>
            <input type="password" name="password" required/>

            <input type="submit" value="Create"/>
        </form>
    </div>

</body>
</html>
