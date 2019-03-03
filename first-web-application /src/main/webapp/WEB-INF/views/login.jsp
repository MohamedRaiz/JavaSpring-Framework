<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yipppeee!! From JSP</title>
</head>
<body>

	<form action="/login" method="post">
		<p><b><font color="red"> ${errorMessage}</font></b></p>
		Enter your name: <input type="text" name="name"/>
		Enter your password: <input type="password" name="password"/>
		<input type="submit" value="clickMe!"/>
	</form>


</body>
</html>