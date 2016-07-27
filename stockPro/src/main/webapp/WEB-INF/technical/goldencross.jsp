<%@ page language="java" contentType="text/html; charset=EUC-KR"  pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>GoldenCross</title>
</head>
<body>
		<h1>GoldenCross</h1>
		<table align="center" border="1" width="600">
		<c:forEach var="code" items="${codelist}">
			<tr>
				<td> ${code.code} </td>
				<td> ${code.name} </td>
				<td> ${code.totalstock} </td>
			</tr>
		</c:forEach>
		</table>
</body>
</html>