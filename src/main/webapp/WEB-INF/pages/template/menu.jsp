<%-- 
    Document   : menu
    Created on : Apr 16, 2020, 7:10:31 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Login as:${sessionScope.loginUser.username}, <a href="#">Logout</a>
        <div>
            <a href="/njt/app/user/all"> All users</a>
        </div>
        <div>
            <a href="/njt/app/user/add"> Add user</a>
        </div>
        <div>
            <a href="/njt/app/user/login"> Current users on system</a>
        </div>
            
    </body>
</html>
