<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #38a169, #2f855a);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .success-box {
        background: #ffffff;
        padding: 40px;
        width: 380px;
        text-align: center;
        border-radius: 12px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.25);
        animation: fadeIn 0.7s ease-in-out;
    }

    .success-box h2 {
        color: #2f855a;
        margin-bottom: 20px;
        font-size: 26px;
    }

    .checkmark {
        font-size: 60px;
        color: #38a169;
        margin-bottom: 15px;
    }

    .btn {
        display: inline-block;
        margin-top: 20px;
        padding: 12px 25px;
        background: #38a169;
        color: white;
        border: none;
        border-radius: 6px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        text-decoration: none;
        transition: 0.3s;
    }

    .btn:hover {
        background: #2f855a;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: scale(0.9); }
        to { opacity: 1; transform: scale(1); }
    }
</style>

</head>
<body>

    <div class="success-box">
        <div class="checkmark">✔</div>
        <h2>Login Successful!</h2>

        <a href="home" class="btn">Go to Dashboard</a>
    </div>

</body>
</html>
