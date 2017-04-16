<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'login.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		<FORM action="${pageContext.request.contextPath}/login" method=post
			name=form>
			用户:
			<INPUT type="text" name="user" >
			密码:
			<INPUT type="password" name="password" >
			<INPUT TYPE="submit" value="enter" name="submit">
			<a href="${pageContext.request.contextPath}/pages/register.jsp">Register</a>

			<br>
			<p style="color:red;">${msg}</p>
		</FORM>
	</body>
</html>
