<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>奖惩</title>
</head>
<body>
<c:if test="${!empty requestScope.employee.prizeInfos}">
	<table>
		<tr>
			<td>姓名</td>
			<td>原因</td>
			<td>时间</td>
			<td>金额</td>
			<td>类型</td>
		</tr>
		<c:forEach items="${requestScope.employee.prizeInfos}" var="prizeInfo">
			<tr>
				<td>${prizeInfo.uName}</td>
				<td>${prizeInfo.reason}</td>
				<td>
					<f:formatDate value="${prizeInfo.date}" pattern="yyyy-MM-dd"/>
				</td>
				<td>${prizeInfo.amount}</td>
				<td>${prizeInfo.type}</td>
			</tr>
		</c:forEach>
	</table>
</c:if>
<c:if test="${empty requestScope.employee.prizeInfos}">
	你还没有奖惩信息！！
</c:if>
</body>
</html>