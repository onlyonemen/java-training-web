<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'showUser.jsp' starting page</title>

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
		<h1>
			Show All User.
			<fmt:formatDate value="<%=new Date()%>" pattern="yyyy-MM-dd hh:mm:ss" />
		</h1>

		<table border="1">
			<tr>
				<td>
					index
				</td>
				<td>
					id
				</td>
				<td>
					userName
				</td>
				<td>
					sex
				</td>
				<td>
					salary
				</td>
				<td>
					password
				</td>
			</tr>
			<c:forEach items="${userList}" var="user" varStatus="index">
				<tr>
					<td>
						${index.index}
					</td>
					<td>
						${user.id}
					</td>
					<td>
						${user.userName}
					</td>
					<td>
						${user.sex}
					</td>
					<td>
						<fmt:formatNumber value="${user.salary }" type="currency"
							pattern="$.00" />
					</td>
					<td>
						${user.password}
					</td>
				</tr>
			</c:forEach>
		</table>

	</body>
</html>
