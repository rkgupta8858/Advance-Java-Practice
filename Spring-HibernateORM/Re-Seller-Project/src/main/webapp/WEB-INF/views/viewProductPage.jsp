<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%
    java.util.List<com.rahul.model.Product> products =
        (java.util.List<com.rahul.model.Product>) request.getAttribute("productList");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Products</title>

<style>

    body {
        margin: 0;
        padding: 0;
        background-color: #f3f3f3;
        font-family: "Amazon Ember", Arial, sans-serif;
    }

    .header {
        background-color: #131921;
        color: white;
        padding: 15px 25px;
        font-size: 22px;
        font-weight: bold;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .dashboard-btn {
        text-decoration: none;
        background-color: #ffa41c;
        padding: 8px 16px;
        border-radius: 6px;
        font-size: 15px;
        color: black;
        font-weight: bold;
    }

    .dashboard-btn:hover {
        background-color: #f08804;
    }

    .container {
        width: 90%;
        margin: 40px auto;
        background: white;
        padding: 25px;
        border-radius: 12px;
        box-shadow: 0px 3px 10px rgba(0,0,0,0.15);
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #232f3e;
        font-size: 26px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 15px;
    }

    th {
        background-color: #232f3e;
        color: white;
        padding: 12px;
        font-size: 16px;
        border-bottom: 3px solid #131921;
    }

    td {
        padding: 12px;
        text-align: center;
        font-size: 15px;
        border-bottom: 1px solid #ddd;
    }

    tr:hover {
        background-color: #f5f5f5;
    }

    .no-data {
        text-align: center;
        padding: 20px;
        font-size: 18px;
        color: #888;
    }

    /* UPDATE BUTTON */
    .update-btn {
        padding: 6px 14px;
        background: #ffa41c;
        color: black;
        border-radius: 6px;
        font-weight: bold;
        border: none;
        cursor: pointer;
        margin-right: 5px;
    }

    .update-btn:hover {
        background: #f08804;
    }

    /* DELETE BUTTON */
    .delete-btn {
        padding: 6px 14px;
        background: red;
        color: white;
        border-radius: 6px;
        font-weight: bold;
        border: none;
        cursor: pointer;
    }

    .delete-btn:hover {
        background: darkred;
    }

</style>

</head>
<body>

    <div class="header">
        <span>All Products</span>
        <a href="reSellerDashBoardContr" class="dashboard-btn">Dashboard</a>
    </div>

    <div class="container">

        <h2>All Products</h2>

        <% if (products == null || products.isEmpty()) { %>

            <div class="no-data">No Products Available</div>

        <% } else { %>

        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Category</th>
                <th>Price (₹)</th>
                <th>Quantity</th>
                <th colspan="2">Actions</th>
            </tr>

            <% for (com.rahul.model.Product p : products) { %>

            <tr>
                <td><%= p.getId() %></td>
                <td><%= p.getName() %></td>
                <td><%= p.getCategory() %></td>
                <td><%= p.getPrice() %></td>
                <td><%= p.getQuantity() %></td>

                <!-- UPDATE BUTTON -->
                <td>
                    <form action="editProduct" method="post" style="margin:0;">
                        <input type="hidden" name="id" value="<%= p.getId() %>">
                        <input type="submit" value="Update" class="update-btn">
                    </form>
                </td>

                <!-- DELETE BUTTON -->
                <td>
                    <form action="deleteProduct" method="post" style="margin:0;">
                        <input type="hidden" name="id" value="<%= p.getId() %>">
                        <input type="submit" value="Delete" class="delete-btn"
                               onclick="return confirm('Are you sure you want to delete this product?');">
                    </form>
                </td>

            </tr>

            <% } %>

        </table>

        <% } %>

    </div>

</body>
</html>
