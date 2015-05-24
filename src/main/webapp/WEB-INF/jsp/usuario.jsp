<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>
        <br/>
        <table>
            <tr>
                <th>ID</th>
                
            </tr>
            <c:forEach items="${usuario}" var="usuario">
                <tr>
                    <td><c:out value="${usuario.idUsuario}"></c:out></td>
                    
                </tr>
            </c:forEach>
        </table>
        <br />
        <a href="index.htm">regresar</a>
    </body>
</html>