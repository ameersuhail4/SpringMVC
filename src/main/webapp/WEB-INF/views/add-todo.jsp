<%--
  Created by IntelliJ IDEA.
  User: Shaik Ameer Suhail
  Date: 08-04-2023
  Time: 08:03 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Add</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.2.3/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Add a todo</h1>

        <form:form modelAttribute="todo" action="add-todos" method="post" >
            <fieldset class="form-">
                <form:label  path="desc" class="form-label" >Description</form:label>
                <form:input path="desc" class="form-control" type="text" ></form:input>
                <form:errors path="desc" cssClass="text-bg-warning"></form:errors>
            </fieldset>


            <br>
            <input class="btn btn-success" type="submit" value="Add">
        </form:form>

    </div>
<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>
