<%@ page import="org.slf4j.LoggerFactory" %><%--
  Created by IntelliJ IDEA.
  User: gaa
  Date: 26.05.2020
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page  pageEncoding="UTF-8"  contentType="text/html; charset=UTF-8" language="java" %>
<%
    LoggerFactory.getLogger("search-form.jsp").debug("Display search-form.jsp");
%>
<html>
<head>
    <title>Title search-result</title>
</head>
<body>
<h2>Your name:<%=request.getAttribute("name")%></h2>
<br/>
<a href="/search">Try again</a>

</body>
</html>
