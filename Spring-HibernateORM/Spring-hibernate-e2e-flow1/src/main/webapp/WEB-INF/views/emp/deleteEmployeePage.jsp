<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>

<style>
    body {
        margin: 0;
        padding: 0;
        background: linear-gradient(135deg, #2c5364, #203a43, #0f2027);
        font-family: Arial, sans-serif;
        display: flex;
        align-items: center;
        justify-content: center;
        height: 100vh;
    }

    .box {
        width: 350px;
        background: #fff;
        padding: 30px;
        border-radius: 15px;
        box-shadow: 0px 8px 25px rgba(0,0,0,0.3);
    }

    h1 {
        text-align: center;
        margin-bottom: 25px;
        color: #203a43;
    }

    label {
        font-weight: bold;
        color: #333;
    }

    input[type="number"] {
        width: 100%;
        padding: 10px;
        margin-top: 8px;
        margin-bottom: 20px;
        border-radius: 8px;
        border: 1px solid #ccc;
        font-size: 15px;
    }

    .btn {
        background: #203a43;
        color: #fff;
        padding: 12px;
        border: none;
        width: 100%;
        font-size: 16px;
        border-radius: 8px;
        cursor: pointer;
        font-weight: bold;
    }

    .btn:hover {
        background: #0f2027;
    }
</style>

</head>
<body>

<div class="box">
<h1>Delete Employee</h1>

<form action="deleteEmpPage" method="post">

    <label>Employee ID:</label>
    <input type="number" name="empId" required>

    <input type="submit" value="Delete Employee" class="btn">

</form>

</div>

</body>
</html>
