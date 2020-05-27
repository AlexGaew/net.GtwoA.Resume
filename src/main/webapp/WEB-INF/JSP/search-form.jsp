<%--
  Created by IntelliJ IDEA.
  User: gaa
  Date: 26.05.2020
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<body>
<h2>Input name</h2>
<%
        if (request.getAttribute("invalid") == Boolean.TRUE) {


%>
<h5 style = "color:red;" > Please input correct value !! </h5 >
<%
} else {
%>


   <form action="/search" method="post">
    <input name="query"/>
    <input type="submit" value="Search" >
    </form>
<% } %>


</body>
</html>
