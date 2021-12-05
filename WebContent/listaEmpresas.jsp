<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>

    <c:if test="${not empty empresa}">
            Empresa ${ empresa } cadastrada com sucesso!
    </c:if>


    Lista de empresas: <br />

    <ul>
        <c:forEach items="${empresas}" var="empresa">

            <li>${empresa.nome }
            <a href="/gerenciador/removeEmpresa?id=${empresa.id}">remove</a>
            <a href="/gerenciador/mostraEmpresa?id=${empresa.id}">editar</a>
             </li> 
        </c:forEach>
    </ul>

</body>
</html>