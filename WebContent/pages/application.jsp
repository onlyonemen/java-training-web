<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'application.jsp' starting page</title>

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
		服务器信息：
		<%=application.getServerInfo()%>
		<br />
		服务器支持的servlet的版本：
		<%=application.getMajorVersion()%>.<%=application.getMajorVersion()%>
		<br />
		web应用名称:
		<%=application.getServletContextName()%>
		<br />
		当前文件的实际路径：
		<%=application.getRealPath("/application.jsp")%>
		<br />
		当前文件类型：
		<%=application.getMimeType("application.jsp")%>
		<br />

	</body>
</html>
