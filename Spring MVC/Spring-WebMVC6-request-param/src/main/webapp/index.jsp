<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>

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
        color: white;
        text-align: center;
    }

    .container {
        background: rgba(255, 255, 255, 0.15);
        padding: 40px;
        border-radius: 12px;
        backdrop-filter: blur(6px);
        box-shadow: 0 0 18px rgba(0, 0, 0, 0.2);
        width: 380px;
    }

    h2 {
        margin-bottom: 20px;
        font-size: 26px;
    }

    .btn {
        display: inline-block;
        margin-top: 20px;
        padding: 12px 25px;
        background: #ffffff;
        color: #4c6ef5;
        font-size: 16px;
        font-weight: bold;
        text-decoration: none;
        border-radius: 6px;
        transition: 0.3s;
    }

    .btn:hover {
        background: #dbe4ff;
    }
</style>

</head>
<body>

    <div class="container">
        <h2>Welcome to Login Page</h2>
        <a href="login" class="btn">Go to Login</a>
    </div>

</body>
</html>
