<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Updated</title>

<!-- FontAwesome for Success Icon -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css"/>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Segoe UI", Arial, sans-serif;
        background: linear-gradient(135deg, #1b2735, #2c5364, #203a43);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .card {
        background: #ffffff;
        width: 480px;
        padding: 35px 30px;
        border-radius: 20px;
        text-align: center;
        box-shadow: 0px 12px 35px rgba(0,0,0,0.3);
        animation: fadeIn 0.8s ease-in-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(25px); }
        to { opacity: 1; transform: translateY(0); }
    }

    .success-icon {
        font-size: 60px;
        color: #2ecc71;
        margin-bottom: 20px;
        animation: pop 0.5s ease-in-out;
    }

    @keyframes pop {
        0% { transform: scale(0); opacity: 0; }
        70% { transform: scale(1.2); opacity: 1; }
        100% { transform: scale(1); }
    }

    h1 {
        font-size: 26px;
        color: #1f3f49;
        margin-bottom: 20px;
        font-weight: 700;
    }

    p {
        font-size: 18px;
        color: #333;
        margin: 10px 0;
    }

    span {
        font-weight: bold;
        color: #203a43;
    }

    a {
        text-decoration: none;
        background: #2c5364;
        color: white;
        padding: 12px 22px;
        font-size: 16px;
        border-radius: 10px;
        margin: 12px;
        display: inline-block;
        font-weight: 600;
        transition: 0.3s ease;
    }

    a:hover {
        background: #0f2027;
        transform: translateY(-2px);
    }

</style>

</head>
<body>

<div class="card">

    <!-- Animated Success Tick -->
    <i class="fa-solid fa-circle-check success-icon"></i>

    <h1>Employee Updated Successfully!</h1>

    <p><span>Updated Employee ID:</span> ${id}</p>
    <p><span>Updated Name:</span> ${name}</p>

    <br>

    <a href="UpdateEmp">Update Another Employee</a>
    <a href="ViewEmp">View All Employees</a>

</div>

</body>
</html>
