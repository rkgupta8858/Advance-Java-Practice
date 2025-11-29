<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Deleted</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Segoe UI", Arial, sans-serif;
        background: linear-gradient(135deg, #2c5364, #203a43, #0f2027);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        color: #fff;
    }

    .box {
        background: rgba(255, 255, 255, 0.1);
        backdrop-filter: blur(10px);
        padding: 40px;
        width: 420px;
        border-radius: 20px;
        text-align: center;
        box-shadow: 0px 8px 30px rgba(0,0,0,0.4);
        animation: fadeIn 0.7s ease-in-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(30px); }
        to { opacity: 1; transform: translateY(0); }
    }

    h1 {
        color: #ff6961;
        font-size: 30px;
        font-weight: bold;
        margin-bottom: 15px;
    }

    p {
        font-size: 18px;
        margin-bottom: 25px;
    }

    .btn-container {
        margin-top: 20px;
    }

    .btn {
        padding: 12px 20px;
        margin: 0 10px;
        border: none;
        border-radius: 8px;
        background: #ff6961;
        color: #fff;
        text-decoration: none;
        font-weight: bold;
        transition: 0.3s ease;
        display: inline-block;
    }

    .btn:hover {
        background: #ff4747;
        transform: translateY(-2px);
    }

    .btn-secondary {
        background: #2c5364;
    }

    .btn-secondary:hover {
        background: #1a2e35;
    }

</style>

</head>
<body>

<div class="box">

    <h1>Employee Deleted</h1>

    <p><b>Deleted Employee ID:</b> ${id}</p>

    <div class="btn-container">
        <a href="DeleteEmp" class="btn">Delete Another</a>
        <a href="ViewEmp" class="btn btn-secondary">View All Employees</a>
    </div>

</div>

</body>
</html>
