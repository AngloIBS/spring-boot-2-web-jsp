<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Demo SB Page</title>
</head>
<body>
<p>Demo SB Page - ${myparam}</p>
<%
    for (int i = 0; i < 10; i++) {
%>
test<br>
<%
    }
%>
</body>
</html>