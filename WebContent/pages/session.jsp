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

		<title>My JSP 'session.jsp' starting page</title>

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
		<%
			String sessionID = session.getId();
		%><H3>
			会话标识 Sessionid :<%=sessionID%></H3>
		<p>
			建立时间Created time
			<%=new Date(session.getCreationTime())%>
		</p>
		<H3>
			<p>
				原设置一次会话持续的时间OldMaxInactiveInterval =
				<%=session.getMaxInactiveInterval()%>
			</p>
		</H3>
		<p>
			最近访问的时间LastAccessedtime=
			<%=new Date(session.getLastAccessedTime())%>
		</p>
		<p>
			设置会话共享的属性 content =" session example "
			<%
			session.setAttribute("content", "session example");
		%>
		</p>
		<p>
			显示原会话共享的属性 content=
			<%=session.getAttribute("content")%></p>
		<p>
			设置会话新的持续的时间 New MaxInactiveInterval=10
			<%
			session.setMaxInactiveInterval(10);
		%>
		
	</body>
</html>
