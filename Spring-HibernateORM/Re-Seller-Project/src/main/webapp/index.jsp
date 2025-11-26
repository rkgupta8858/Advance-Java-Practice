
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon Re-Seller Dashboard</title>

<style>
body {
	margin: 0;
	padding: 0;
	font-family: "Amazon Ember", Arial, sans-serif;
	background-color: #f2f2f2;
}

/* Amazon Header */
.amazon-header {
	background-color: #131921;
	color: white;
	padding: 15px 25px;
	display: flex;
	align-items: center;
	justify-content: space-between;
}

.amazon-header h2 {
	margin: 0;
	font-size: 24px;
	font-weight: 600;
}

.nav-links a {
	color: white;
	margin-left: 20px;
	text-decoration: none;
	font-size: 16px;
	padding: 6px 12px;
	border-radius: 4px;
}

.nav-links a:hover {
	background-color: #232f3e;
}

/* Main Card */
.dashboard-container {
	width: 80%;
	margin: 40px auto;
	background: white;
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
}

.btn {
	display: inline-block;
	margin-right: 15px;
	padding: 10px 20px;
	background: #ffa41c;
	color: black;
	text-decoration: none;
	font-size: 16px;
	border-radius: 6px;
	font-weight: bold;
}

.btn:hover {
	background: #f08804;
}
</style>

</head>
<body>

	<!-- Amazon Header -->
	<div class="amazon-header">
		<h2>Amazon Re-Seller Dashboard</h2>

		<div class="nav-links">
			<a href="/create">Create Account</a> <a href="/login">Login</a>
		</div>
	</div>

	<!-- Main Body Section -->
	<div class="dashboard-container">
		<h2>Welcome to Amazon Re-Seller Dashboard</h2>
		<p>Manage your seller account, check orders, and track your
			business.</p>

		<a class="btn" href="create">Create Account</a> <a class="btn"
			href="login">Login</a>
	</div>
	

</body>
</html>
