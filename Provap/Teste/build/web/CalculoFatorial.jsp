<%-- 
    Document   : CalculoFatorial
    Created on : 19/01/2018, 21:12:25
    Author     : Michele
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        double num = Integer.parseInt(request.getParameter("num"));
        double fat = 1;
        for(int i=1; i<=num; i++){
           fat=fat*i; 
        }         
     out.println("<h1>O Fatorial é </h1>");
     out.println("<h3>"+fat+"</h3>");
     //out.println("<progress min="0" max="100" ></progress>");
    %>
    </body>
</html>
