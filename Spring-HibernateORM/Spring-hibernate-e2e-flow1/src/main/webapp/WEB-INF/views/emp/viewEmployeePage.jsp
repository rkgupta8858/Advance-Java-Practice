<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Employees</title>

<style>
    body {
        font-family: "Segoe UI", Arial, sans-serif;
        margin: 0;
        padding: 20px;
        background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
        min-height: 100vh;
        color: #fff;
    }

    .container {
        width: 85%;
        margin: auto;
        background: #ffffff;
        padding: 30px;
        border-radius: 18px;
        box-shadow: 0px 8px 30px rgba(0,0,0,0.25);
        margin-top: 40px;
        animation: fadeIn 0.7s ease;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    h1 {
        text-align: center;
        color: #1f3f49;
        font-size: 30px;
        margin-bottom: 25px;
    }

    .back-btn {
        display: inline-block;
        background: #2c5364;
        color: white;
        padding: 12px 22px;
        font-size: 16px;
        font-weight: 600;
        border-radius: 10px;
        text-decoration: none;
        margin-bottom: 20px;
        transition: 0.3s ease;
    }

    .back-btn:hover {
        background: #0f2027;
        transform: translateY(-2px);
    }

    table {
        width: 100%;
        border-collapse: collapse;
        font-size: 16px;
        border-radius: 10px;
        overflow: hidden;
    }

    th {
        background: #2c5364;
        color: white;
        padding: 14px;
        text-align: left;
        font-size: 17px;
    }

    td {
        padding: 12px;
        color: #333;
        background: #f9f9f9;
    }

    tr:nth-child(even) td {
        background: #eef3f5;
    }

    tr:hover td {
        background: #dbe9f1;
        transition: 0.2s;
    }

    .no-data {
        text-align: center;
        padding: 25px;
        font-size: 20px;
        color: #203a43;
        font-weight: bold;
    }

</style>

</head>
<body>

<div class="container">

    <!-- Back Button -->
    <a href="index.jsp" class="back-btn">⬅ Back to Dashboard</a>

    <h1>All Employees</h1>

    <%
        java.util.List<com.rahul.emp.entity.Employee> empList =
            (java.util.List<com.rahul.emp.entity.Employee>) request.getAttribute("list");
    %>

    <% if (empList == null || empList.size() == 0) { %>

        <div class="no-data">No Employees Found</div>

    <% } else { %>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Salary</th>
            <th>Address</th>
        </tr>

        <%
            for (int i = 0; i < empList.size(); i++) {
                request.setAttribute("emp", empList.get(i));
        %>
        <tr>
            <td>${emp.empId}</td>
            <td>${emp.empName}</td>
            <td>${emp.empEmail}</td>
            <td>${emp.empSalary}</td>
            <td>${emp.empAddress}</td>
        </tr>
        <% } %>

    </table>

    <% } %>

</div>

</body>
</html>
