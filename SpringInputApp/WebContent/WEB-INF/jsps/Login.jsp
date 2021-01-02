<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	<sp:form action="login" modelAttribute="log">
		Enter email:<sp:input path="email"/><sp:errors path="email"/><br/>
		Enter password:<sp:password path="pass"/><sp:errors path="pass"/><br/>
		<br/>
		<input type="submit"/>
	</sp:form>
	
</body>
</html>