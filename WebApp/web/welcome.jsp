<%-- 
    Document   : welcome
    Created on : 16 Mar, 2020, 5:05:08 PM
    Author     : prabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>WELCOME</title>
    </head>
    <body>
        <h1>Welcome</h1>
        <p>Dear : ${username}</p>
        <p>Your password is: ${password}</p>
        <p stule ="  color:red">${errormessage}</p>
        <a href="login.jsp">Go back to login page</a>
    </body>
</html>
