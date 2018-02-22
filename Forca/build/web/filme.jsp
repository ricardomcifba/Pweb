<%-- 
    Document   : Filme
    Created on : 30/01/2018, 17:58:18
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Filme</title>
    </head>
    <body>
        <h2>/a opção escolhida foi Filme</h2>
        <jsp:useBean id="jogo" class="Negocio.Forca" scope="session" />
        <input type="text" name="numero"/>
        <input type="submit" name="bt" value="OK"/>

    </body>
</html>
