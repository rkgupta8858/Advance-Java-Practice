<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<h1>Add Employee Page</h1>
	<form action="addEmpPage" method="post">
	 Employee Name : <input  type="text" name="empName" required/> <br><br>
	 Employee Email : <input  type="text" name="empEmail" required/> <br><br>
	 Employee Salary : <input  type="text" name="empSalary" required/> <br><br>
	 Employee Address : <input  type="text" name="empAddress" required/><br><br>
	 <input type="submit" value="Add Employee"/>
	
	</form>
</body>
</html>