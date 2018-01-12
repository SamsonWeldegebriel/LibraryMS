<%--
  Created by IntelliJ IDEA.
  User:  Samson Weldegebriel
  Date: 1/9/2018
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>

    Welcome to my Library.

    <table>


    <c:forEach items="${books}" var="book">

        <tr>
            <td>Book Name: </td><td>${book.name}</td>
        </tr>

    </c:forEach>

    </table>
</body>
</html>
