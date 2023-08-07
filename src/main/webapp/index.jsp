<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Hello World!</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a><br/>
<h2><% out.print(LocalDateTime.now()); %></h2>
<form action="hello-servlet" method="post">
    <label for="user">Name:</label>
    <input id="user" type="text" name="username">
    <label for="age">Age:</label>
    <input id="age" type="number" name="userage">
    <input type="submit" value="Hello">
</form>
</body>
</html>