<%-- 
    Document   : all
    Created on : Mar 31, 2020, 9:10:09 PM
    Author     : Dusan
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User: all</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <%@include file="../template/header.jsp" %>
        <%@include file="../template/menu.jsp" %>
        <div class="container">
            <div>
                <h1>This is page all.jsp for user!</h1>
            </div>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Username</th>
                        <th>Delete</th>
                        <th>Edit</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${applicationScope.users}">
                        <tr>
                            <td>${user.firstname}</td>
                            <td>${user.lastname}</td>
                            <td>${user.username}</td>
                            <td>
                                <a href="#">Delete</a>
                            </td>
                            <td>
                                <a href="#">Edit</a>
                            </td>
                        </tr>
                    </c:forEach>

                </tbody>
            </table>
        </div>

        <%@include file="../template/footer.jsp" %>

        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.0.0/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
