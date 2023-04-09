<%--
  Created by IntelliJ IDEA.
  User: Shaik Ameer Suhail
  Date: 08-04-2023
  Time: 07:19 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>list-todos</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.2.3/css/bootstrap.min.css">
</head>
<body>
<h1><b>the todos of ${name} are</b>
    <table class="table table-hover">
        <thead>
            <tr>
                <th>Description</th>
                <th>Target Date</th>
                <th>Is Completed</th>

            </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.desc}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
                <td><a class="btn btn-danger" href="del-todos?id=${todo.id}">delete</a></td>
            </tr>

        </c:forEach>
        </tbody>
    </table>



</h1>
<a class="btn btn-success" href="add-todos">add</a>
<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>
