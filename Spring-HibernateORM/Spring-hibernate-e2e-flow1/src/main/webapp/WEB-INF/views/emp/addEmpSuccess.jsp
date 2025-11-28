<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Added</title>

<!-- FontAwesome for Success Icon -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css"/>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Segoe UI", Arial, sans-serif;
        background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .card {
        background: #ffffff;
        width: 520px;
        padding: 40px 35px;
        border-radius: 22px;
        text-align: center;
        box-shadow: 0px 12px 40px rgba(0,0,0,0.28);
        animation: fadeIn 0.8s ease-in-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(30px); }
        to { opacity: 1; transform: translateY(0); }
    }

    .success-icon {
        font-size: 60px;
        color: #28a745;
        margin-bottom: 15px;
        animation: pop 0.5s ease-in-out;
    }

    @keyframes pop {
        0% { transform: scale(0); opacity: 0; }
        70% { transform: scale(1.2); opacity: 1; }
        100% { transform: scale(1); }
    }

    h1 {
        font-size: 28px;
        margin-bottom: 10px;
        color: #1f3f49;
        font-weight: 700;
    }

    h3 {
        font-size: 18px;
        color: #444;
        margin-top: 5px;
        margin-bottom: 35px;
        font-weight: 500;
    }

    .info {
        font-size: 18px;
        color: #333;
        margin-bottom: 25px;
        line-height: 1.7;
    }

    .info span {
        font-weight: 600;
        color: #203a43;
    }

    .btn-group {
        margin-top: 25px;
    }

    a {
        text-decoration: none;
        background: #2c5364;
        color: white;
        padding: 12px 28px;
        font-size: 16px;
        font-weight: 600;
        border-radius: 10px;
        margin: 0 10px;
        display: inline-block;
        transition: 0.3s ease;
    }

    a:hover {
        background: #0f2027;
        transform: translateY(-3px);
    }
</style>
</head>

<body>

<div class="card">

    <!-- Premium Success Icon -->
    <i class="fa-solid fa-circle-check success-icon"></i>

    <h1>Employee Added Successfully!</h1>

    <h3>Total Records Added: 1</h3>

    <div class="info">
        <div><span>Employee ID:</span> ${id}</div>
        <div><span>Employee Name:</span> ${name}</div>
    </div>

    <div class="btn-group">
        <a href="AddEmp">Add Another Employee</a>
        <a href="ViewEmp">View All Employees</a>
    </div>

</div>

</body>
</html>
