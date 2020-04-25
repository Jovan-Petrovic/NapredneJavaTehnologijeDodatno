<%-- 
    Document   : login.jsp
    Created on : Mar 31, 2020, 8:21:45 PM
    Author     : Dusan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>This is login page!</h1>
        ${message} <%-- Prvo trazi message u stranici, pa u request scope-u, pa u session scope-u, pa u application scope-u
                    Mogli smo da kazemo i ${requestScope.message} --%>
        <form action="/njt/app/login" method="post">
            Username:
            <div>
                <input type="text" id="username" name="username"/>
            </div>
            <p/>
            Password:
            <div>
                <input type="password" id="password" name="password"/>
            </div>
            <p/>
            <input type="submit" id="Login" value="Log in"/>
        </form>
    </body>
</html>
