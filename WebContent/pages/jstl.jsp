<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'jstl.jsp' starting page</title>
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
			JSTL
		</h1>
		<img alt="jstl"
			src="${pageContext.request.contextPath}/public/img/JSP Standard Tag Library.png">
		<br />
		<hr/>
		<h2>
			Example 1
		</h2>
		<img alt="jstl"
			src="${pageContext.request.contextPath}/public/img/jstl-forEach.png">
		<br />
		<c:forEach var="i" begin="1" end="10" step="1">
            ${i}
        </c:forEach>
		<hr/>
		<h2>
			c:set
		</h2>
		<img alt="jstl"
			src="${pageContext.request.contextPath}/public/img/jstl-set.png">
		<br />
		<c:set value="this is andy" var="oneString" />
		${oneString}
		<hr/>
		
	</body>
</html>
