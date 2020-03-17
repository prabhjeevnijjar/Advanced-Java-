<%-- 
    Document   : login.jsp
    Created on : 16 Mar, 2020, 3:06:41 PM
    Author     : prabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action ="login" method="post">
           name: <input type ="text" name ="loginname" width ="30"/>
           password: <input type ="password" name ="loginpassword" width ="30"/>
           submit:<input type = "submit" name ="login submit" width ="30"/>
        </form>
    </body>
</html>
