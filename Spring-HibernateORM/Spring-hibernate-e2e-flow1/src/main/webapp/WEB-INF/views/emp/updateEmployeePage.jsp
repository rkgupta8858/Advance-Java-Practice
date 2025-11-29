<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>

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

    .box {
        background: #ffffff;
        width: 420px;
        padding: 35px;
        border-radius: 20px;
        box-shadow: 0px 10px 30px rgba(0,0,0,0.3);
        animation: fadeIn 0.7s ease-in-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(25px); }
        to { opacity: 1; transform: translateY(0); }
    }

    h1 {
        text-align: center;
        color: #1f3f49;
        font-size: 26px;
        margin-bottom: 25px;
    }

    label {
        font-size: 15px;
        font-weight: 600;
        color: #1f3f49;
    }

    input[type="text"],
    input[type="number"] {
        width: 100%;
        padding: 10px;
        margin-top: 8px;
        margin-bottom: 18px;
        border: 1px solid #ccc;
        border-radius: 8px;
        font-size: 15px;
        outline: none;
        transition: 0.3s;
    }

    input[type="text"]:focus,
    input[type="number"]:focus {
        border-color: #2c5364;
        box-shadow: 0 0 5px rgba(44,83,100,0.4);
    }

    .submit-btn {
        width: 100%;
        background: #2c5364;
        color: white;
        padding: 12px;
        border: none;
        border-radius: 10px;
        font-size: 16px;
        font-weight: 600;
        cursor: pointer;
        margin-top: 10px;
        transition: 0.3s ease;
    }

    .submit-btn:hover {
        background: #0f2027;
        transform: translateY(-2px);
    }

</style>

</head>
<body>

<div class="box">

    <h1>Update Employee Details</h1>

    <form action="updateEmpPage" method="post">

        <label>Employee ID:</label>
        <input type="number" name="empId" required>

        <label>New Name:</label>
        <input type="text" name="empName" required>

        <label>New Email:</label>
        <input type="text" name="empEmail" required>

        <label>New Salary:</label>
        <input type="text" name="empSalary" required>

        <label>New Address:</label>
        <input type="text" name="empAddress" required>

        <input type="submit" value="Update Employee" class="submit-btn">

    </form>

</div>

</body>
</html>
