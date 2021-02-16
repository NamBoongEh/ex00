<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/loginAction">
	ID : <input type="text" placeholder="id를 입력하세요." value="${cookie.c.value}" name="id"><br>
	PW : <input type="password" placeholder="pw를 입력하세요." name="pw"><br>
	<input type="checkbox" name="checkbox" ${cookie.c==null ? null : "checked"}> 쿠키를 생성하시겠습니까?<br>
	<input type="submit" value="Login">
</form>

</body>
</html>