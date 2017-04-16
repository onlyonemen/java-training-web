<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
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
		<FORM action="${pageContext.request.contextPath}/register" method=post
			name=form>
			用户:
			<INPUT type="text" name="username"><br/>
			密码:
			<INPUT type="password" name="password"><br/>
			性别:
			<INPUT type="text" name="sex"><br/>
			薪水:
			<INPUT type="text" name="salary"><br/>
			<INPUT TYPE="submit" value="enter" name="submit">
			<br>
		</FORM>
		<a href="${pageContext.request.contextPath}">Cancel</a>
	</body>
</html>
