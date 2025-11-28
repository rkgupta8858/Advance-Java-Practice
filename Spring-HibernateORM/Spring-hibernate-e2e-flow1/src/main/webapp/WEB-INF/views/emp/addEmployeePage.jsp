<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #1c92d2, #f2fcfe);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background: white;
        width: 420px;
        padding: 30px;
        border-radius: 12px;
        box-shadow: 0 4px 20px rgba(0, 0, 0, 0.2);
        animation: fadeIn 0.8s ease;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    h1 {
        text-align: center;
        color: #1c4e80;
        margin-bottom: 25px;
        font-size: 24px;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        font-size: 15px;
        margin-top: 5px;
        margin-bottom: 18px;
        border: 1px solid #ccc;
        border-radius: 8px;
        outline: none;
        transition: 0.3s;
    }

    input[type="text"]:focus {
        border-color: #1c92d2;
        box-shadow: 0 0 5px rgba(28,146,210,0.4);
    }

    label {
        font-size: 16px;
        font-weight: bold;
        color: #333;
    }

    .submit-btn {
        width: 100%;
        background: #1c4e80;
        color: white;
        padding: 12px;
        border: none;
        border-radius: 8px;
        font-size: 17px;
        cursor: pointer;
        transition: 0.3s;
        font-weight: bold;
    }

    .submit-btn:hover {
        background: #163b5a;
        transform: scale(1.03);
    }
</style>

</head>
<body>

<div class="container">
    <h1>Add Employee</h1>

    <form action="addEmpPage" method="post">

        <label>Employee Name :</label>
        <input type="text" name="empName" required>

        <label>Employee Email :</label>
        <input type="text" name="empEmail" required>

        <label>Employee Salary :</label>
        <input type="text" name="empSalary" required>

        <label>Employee Address :</label>
        <input type="text" name="empAddress" required>

        <input type="submit" value="Add Employee" class="submit-btn">

    </form>
</div>

</body>
</html>
