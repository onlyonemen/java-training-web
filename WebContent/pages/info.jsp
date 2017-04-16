<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'info.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    <BR>
		客户使用的协议是:
		<%
			String protocol = request.getProtocol();
			out.println(protocol);
		%>
		<BR>
		获取接受客户提交信息的页面：
		<%=path%>
		<BR>
		客户提交信息的方式：
		<%
			String method = request.getMethod();
			out.println(method);
		%>
		<BR>
		获取HTTP头文件中Host的值：
		<%
			String header3 = request.getHeader("Host");
			out.println(header3);
		%>
		<BR>
		获取HTTP头文件中Content-type的值：
		<%
			String header_Content_type = response.getContentType();
			out.println(header_Content_type);
		%>
		<BR>
		获取客户的IP地址：
		<%
			String IP = request.getRemoteAddr();
			out.println(IP);
		%>
		<BR>
		获取客户机的名称：
		<%
			String clientName = request.getRemoteHost();
			out.println(clientName);
		%>
		<BR>
		获取服务器的名称：
		<%
			String serverName = request.getServerName();
			out.println(serverName);
		%>
		<BR>
		获取服务器的端口号：
		<%
			int serverPort = request.getServerPort();
			out.println(serverPort);
		%>
		<BR>
		获取客户端提交的所有参数的名字：
		<%
			Enumeration e = request.getParameterNames();
			while (e.hasMoreElements()) {
				String s = (String) e.nextElement();
				out.println(s);
			}
		%>
		<BR>
  </body>
</html>
