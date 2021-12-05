<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/alteraEmpresa" var="linkServletAlteraEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${linkServletAlteraEmpresa }" method="post">
	
		Nome: <input type="text" name="nome" value="${empresa.nome}" />
		<input type="hidden" name="id" value="${empresa.id }">
		<br>
<!-- 		CNPJ: <input type="text" name="cnpj"/> -->
		<input type="submit" />
	</form>

</body>
</html>