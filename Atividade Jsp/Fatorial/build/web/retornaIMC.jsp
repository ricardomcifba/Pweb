<%-- 
    Document   : retornaIMC
    Created on : 22/01/2018, 21:38:47
    Author     : Michele
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IMC</title>
    </head>
    <body>
        <jsp:useBean id="calcular" class="calculo.IMC" scope="page"/>
        <jsp:setProperty name="calcular" property="peso"></jsp:setProperty>
        <jsp:setProperty name="calcular" property="altura"></jsp:setProperty>
        
        <h1>
            <jsp:getProperty name="calcular" property="IMC"></jsp:getProperty>
        </h1>
    </body>
</html>
