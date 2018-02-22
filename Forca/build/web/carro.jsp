<%-- 
    Document   : Carro
    Created on : 30/01/2018, 17:58:08
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carro</title>
    </head>
    <body>
        <h2>/a opção escolhida foi Carro</h2>
        <jsp:useBean id="jogo" class="Negocio.Forca" scope="session" />
         <form>
        <br> <input type="text" name="letra" SIZE=1 />
        <input type="submit" value="Verificar" />
        </form>
    </body>
</html>
