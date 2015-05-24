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
                <th>Tipo Catalogo</th>
            </tr>
            <c:forEach items="${tipoCatalogo}" var="tipoCatalogo">
                <tr>
                    <td><c:out value="${tipoCatalogo.idTipoCatalogo}"></c:out></td>
                    <td><c:out value="${tipoCatalogo.nombre}"></c:out></td>
                </tr>
            </c:forEach>
        </table>
        <br />
        <a href="index.htm">regresar</a>
    </body>
</html>