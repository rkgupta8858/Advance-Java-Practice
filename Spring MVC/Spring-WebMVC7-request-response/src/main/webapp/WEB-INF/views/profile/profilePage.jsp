<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Profile</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #4facfe, #00f2fe);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .form-container {
        background: #ffffff;
        padding: 35px;
        border-radius: 14px;
        width: 420px;
        box-shadow: 0 6px 25px rgba(0,0,0,0.18);
        animation: fadeIn 0.6s ease-in-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(-10px); }
        to { opacity: 1; transform: translateY(0); }
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #222;
        font-size: 26px;
        letter-spacing: 1px;
    }

    label {
        font-weight: bold;
        display: block;
        margin-top: 12px;
        color: #444;
        font-size: 15px;
    }

    input[type="text"], input[type="email"], input[type="tel"] {
        width: 100%;
        padding: 11px;
        margin-top: 6px;
        border: 1px solid #ccc;
        border-radius: 8px;
        font-size: 15px;
        transition: 0.3s;
    }

    input[type="text"]:focus,
    input[type="email"]:focus,
    input[type="tel"]:focus {
        border-color: #007bff;
        box-shadow: 0 0 6px rgba(0,123,255,0.3);
        outline: none;
    }

    input[type="submit"] {
        width: 100%;
        padding: 13px;
        margin-top: 25px;
        background: #007bff;
        border: none;
        border-radius: 8px;
        color: white;
        font-size: 17px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background: #0056b3;
    }

    /* For smaller screens */
    @media(max-width: 480px){
        .form-container {
            width: 90%;
            padding: 25px;
        }
    }
</style>

</head>
<body>

    <div class="form-container">
        <h2>Create Profile</h2>

        <form action="createProfilePage">

            <label>First Name</label>
            <input type="text" name="firstName" placeholder="Enter first name" required />

            <label>Last Name</label>
            <input type="text" name="lastName" placeholder="Enter last name" required />

            <label>Email</label>
            <input type="email" name="email" placeholder="Enter email address" required />

            <label>Phone</label>
            <input type="tel" name="phone" placeholder="Enter phone number" 
             pattern="[0-9]{10}" maxlength="10" required />

            <input type="submit" value="Create Profile" />
        </form>
    </div>

</body>
</html>
