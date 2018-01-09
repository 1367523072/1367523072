<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人考勤</title>
</head>
<body>
	<table>
		<tr>
			<td>姓名</td>
			<td>上班时间</td>
			<td>下班时间</td>
			<td>是否迟到</td>
			<td>是否早退</td>
		</tr>
		<c:forEach items="${requestScope.employee.attendances}" var="attendance">
			<tr>
				<td>${attendance.uName}</td>
				<td>${attendance.officeHours}</td>
				<td>${attendance.closingTime}</td>
				<td>${attendance.late}</td>
				<td>${attendance.leaveEarly}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>