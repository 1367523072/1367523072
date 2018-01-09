<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>面试通知</title>
</head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-1.7.2.js"></script>
<script type="text/javascript">

</script>
<body>
	<table>
		<tr>
			<td>序号</td>
			<td>应聘者</td>
			<td>面试时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.feedbackForms}" var="feedbackForm">
			<tr>
				<td>${feedbackForm.id}</td>
				<td>${feedbackForm.uId}</td>
				<td>${feedbackForm.interviewTime}</td>
				<td><a>面试</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>