<%-- 
    Document   : all
    Created on : Mar 31, 2020, 9:10:09 PM
    Author     : Dusan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User: add</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <%@include file="../template/header.jsp" %>
        <%@include file="../template/menu.jsp" %>
        <div class="container">
            <div>
                <h1>This is page add.jsp for user!</h1>
            </div>
            <form action="/njt/app/user/save" method="POST">
                ${message}
                <table>
                    <tbody>
                        <tr>
                            <td>Firstname:</td>
                            <td><input type="text" name="firstname" value="" /></td>
                        </tr>
                        <tr>
                            <td>Lastname:</td>
                            <td><input type="text" name="lastname" value="" /></td>
                        </tr>
                        <tr>
                            <td>Username:</td>
                            <td><input type="text" name="username" value="" /></td>
                        </tr>
                        <tr>
                            <td>Password:</td>
                            <td><input type="password" name="password" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Save"/></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>

            </form>
        </div>

        <%@include file="../template/footer.jsp" %>

        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.0.0/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
