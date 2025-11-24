<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Created - MakeMyTrip</title>

<!-- Google Font -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Poppins', sans-serif;
        background: linear-gradient(135deg, #005bea, #00c6fb);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .card {
        background: #ffffff;
        width: 480px;
        padding: 35px;
        border-radius: 18px;
        text-align: center;
        box-shadow: 0 10px 35px rgba(0,0,0,0.2);
        animation: fadeInUp 0.9s ease;
    }

    @keyframes fadeInUp {
        from { transform: translateY(20px); opacity: 0; }
        to   { transform: translateY(0); opacity: 1; }
    }

    /* Success Check Animation */
    .checkmark {
        width: 90px;
        height: 90px;
        border-radius: 50%;
        display: inline-block;
        border: 4px solid #28a745;
        position: relative;
        animation: pop 0.6s ease;
        margin-bottom: 15px;
    }

    @keyframes pop {
        0% { transform: scale(0.5); opacity: 0; }
        100% { transform: scale(1); opacity: 1; }
    }

    .checkmark:after {
        content: "";
        position: absolute;
        top: 22px;
        left: 28px;
        width: 22px;
        height: 45px;
        border-right: 4px solid #28a745;
        border-bottom: 4px solid #28a745;
        transform: rotate(45deg);
    }

    h1 {
        font-size: 24px;
        font-weight: 600;
        color: #333;
        margin-bottom: 10px;
    }

    .userid {
        font-size: 32px;
        color: #005bea;
        font-weight: 700;
        margin-bottom: 20px;
    }

    .subtitle {
        color: #666;
        font-size: 15px;
        margin-bottom: 25px;
    }

    .btn-box {
        margin-top: 25px;
    }

    a.button {
        display: inline-block;
        margin: 8px;
        padding: 12px 22px;
        background: #005bea;
        color: white;
        text-decoration: none;
        font-size: 15px;
        border-radius: 8px;
        transition: 0.3s;
        font-weight: 500;
        box-shadow: 0 3px 10px rgba(0,0,0,0.15);
    }

    a.button:hover {
        background: #003f9e;
        transform: translateY(-2px);
    }

    /* Small screen responsive */
    @media(max-width: 480px){
        .card { width: 90%; padding: 25px; }
        .userid { font-size: 26px; }
    }

</style>
</head>

<body>
    <div class="card">
        <div class="checkmark"></div>

        <h1>Profile Created Successfully!</h1>

        <div class="userid">User ID: ${userId}</div>

        <div class="subtitle">Your account is ready. Explore exclusive travel deals!</div>

        <div class="btn-box">
            <a class="button" href="home">Home</a>
            <a class="button" href="flights">Book Flights</a>
            <a class="button" href="hotels">Book Hotels</a>
            <a class="button" href="cabs">Book Cabs</a>
        </div>
    </div>
</body>
</html>
