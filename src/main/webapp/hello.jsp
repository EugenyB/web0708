<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 07.08.2023
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<jsp:useBean id="user" scope="request" class="com.example.web0708.beans.User"/>
<h1>${user.name}</h1>
<h2>${user.age}</h2>
</body>
</html>
