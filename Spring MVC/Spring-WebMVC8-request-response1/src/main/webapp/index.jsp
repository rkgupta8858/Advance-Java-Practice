<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MakeMyTrip - Home</title>

<!-- Google Font -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">

<style>

    /* Full Page Background */
    body {
        margin: 0;
        padding: 0;
        font-family: 'Poppins', sans-serif;
        background-image: url('https://images.pexels.com/photos/1450353/pexels-photo-1450353.jpeg');
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        height: 100vh;

        /* Blue overlay like MakeMyTrip */
        position: relative;
    }

    /* Overlay Layer */
    body::before {
        content: "";
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        background: rgba(0, 90, 255, 0.55);
        backdrop-filter: blur(1px);
    }

    .content {
        position: relative;
        text-align: center;
        color: white;
        top: 40%;
        transform: translateY(-50%);
    }

    h2 {
        font-size: 40px;
        font-weight: 600;
        letter-spacing: 1px;
        margin-bottom: 20px;
    }

    a.button {
        display: inline-block;
        padding: 12px 28px;
        font-size: 18px;
        text-decoration: none;
        color: white;
        background: #ff6f00;
        font-weight: bold;
        border-radius: 8px;
        transition: 0.3s;
        box-shadow: 0 4px 12px rgba(0,0,0,0.3);
    }

    a.button:hover {
        background: #e85d00;
        transform: translateY(-3px);
    }

</style>
</head>

<body>
    <div class="content">
        <h2>Welcome to MakeMyTrip!</h2>
        <a class="button" href="create">Create Account</a>
    </div>
</body>
</html>
