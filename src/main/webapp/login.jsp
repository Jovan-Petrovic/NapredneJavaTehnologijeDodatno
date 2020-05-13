<%-- 
    Document   : login.jsp
    Created on : Mar 31, 2020, 8:21:45 PM
    Author     : Dusan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div>
                    <a href="?Locale=en_US">en_US</a>|<a href="?Locale=sr_RS">sr_RS</a>
                    <fmt:setLocale value="${param.Locale}"/>
                    <div>
                        Locale: ${param.Locale}
                    </div>
                    <fmt:bundle basename="i18n/config">
                        <h1>
                            <fmt:message key="login.message.info"></fmt:message>
                        </h1>
                        ${message} <%-- Prvo trazi message u stranici, pa u request scope-u, pa u session scope-u, pa u application scope-u
                                    Mogli smo da kazemo i ${requestScope.message} --%>
                        <form action="/njt/app/login" method="post">
                            <!-- Username: -->
                            <fmt:message key="label.username"></fmt:message>
                                <div>
                                    <input type="text" id="username" name="username"/>
                                </div>
                                <p/>
                                <!-- Password -->
                            <fmt:message key="label.password"></fmt:message>
                                <div>
                                    <input type="password" id="password" name="password"/>
                                </div>
                                <p/>
                                <input class="btn btn-outline-success" type="submit" id="Login" value="<fmt:message key="button.login"></fmt:message>"/>
                            </form>
                    </fmt:bundle>
                </div>
            </div>
        </div>


        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.0.0/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
