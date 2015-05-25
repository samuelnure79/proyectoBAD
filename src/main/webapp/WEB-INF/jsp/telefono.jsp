<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Telefono</title>
    </head>
    <body>
        <br/>
        <table>
            <tr>
                <th>ID_Telefono</th>
                
            </tr>
            <c:forEach items="${telefono}" var="telefono">
                <tr>
                    <td><c:out value="${telefono.idTelefono}"></c:out></td>
                    
                </tr>
            </c:forEach>
        </table>
        <br />
        <a href="index.htm">regresar</a>
    </body>
</html>