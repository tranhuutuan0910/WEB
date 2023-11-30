<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Confirmation</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%@ page import="com.java.be.user" %>
<div class="container">
    <div class="jumbotron">   
    	<% 
    	user user = (user) session.getAttribute("user");
    	%>
        <h1>Confirm</h1>
        <p>${user.firstName}</p>
        <p>${user.lastName}</p>
        <p>${user.doB}</p>
        <p>${user.poB}</p>
        <p>${user.sex}</p>      
    </div>
	<input type="submit" class="btn btn-primary" value="Edit" onclick="location.href='Edit.jsp'">
</div>

</body>
</html>