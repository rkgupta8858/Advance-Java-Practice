<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Dashboard</title>

<!-- FontAwesome Icons -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css"/>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Segoe UI", Tahoma, sans-serif;
        background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .dashboard {
        background: #ffffff;
        width: 80%;
        max-width: 900px;
        padding: 30px;
        border-radius: 20px;
        text-align: center;
        box-shadow: 0 5px 25px rgba(0,0,0,0.2);
    }

    h2 {
        color: #2c5364;
        margin-bottom: 20px;
    }

    .menu {
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        gap: 20px;
        margin-top: 30px;
    }

    .menu a {
        text-decoration: none;
        padding: 20px;
        background: #2c5364;
        color: white;
        font-size: 18px;
        font-weight: 600;
        border-radius: 12px;
        display: flex;
        justify-content: center;
        align-items: center;
        gap: 10px;
        transition: 0.3s;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
    }

    .menu a:hover {
        background: #0f2027;
        transform: scale(1.05);
    }
</style>
</head>

<body>

<div class="dashboard">
    <h2>Welcome to Employee Dashboard Panel</h2>

    <div class="menu">
        <a href="AddEmp"><i class="fa-solid fa-user-plus"></i> Add Employee</a>
        <a href="UpdateEmp"><i class="fa-solid fa-user-pen"></i> Update Employee</a>
        <a href="DeleteEmp"><i class="fa-solid fa-user-xmark"></i> Delete Employee</a>
        <a href="ViewEmp"><i class="fa-solid fa-users"></i> View Employees</a>
    </div>
</div>

</body>
</html>
