<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>培训</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(function(){
	$(".add2").hide();
	$(".add1").click(function(){
		$(".add2").toggle();
	});
	$(".submit").click(function(){
		$(".add2").toggle();
	});
})
</script>
</head>
<body>
	<c:if test="${empty trains}">
		还没有培训计划，<a href="#" class="add1">点我添加</a>
	</c:if>
	<c:if test="${!empty trains}">
	<table>
		<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>DATE</td>
			<td>DEPARTMENT</td>
			<td>DELETE</td>
		</tr>
		<c:forEach items="${trains}" var="train">
			<tr>
				<td>${train.id}</td>
				<td>${train.name}</td>
				<td>${train.date}</td>
				<td>${train.dept}</td>
				<td><a href="${pageContext.request.contextPath}/delTrains?id=${train.id}">删除</a></td>
		</tr>
		</c:forEach>
		<tr><td colspan="5"><input type="button" class="add1" value="添加"/></td></tr>
		
	</table>
	</c:if>
	<div class="add2">
		<form action="${pageContext.request.contextPath}/addTrains" >
			<table border="1">
				<tr>
					<td>NAME</td>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td>DEPARTMENT</td>
					<td>
						<select name="dept">
							<c:forEach items="${requestScope.departments}" var="department">
								<option value="${department.name}">${department.name}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="确认"/></td>
					<td><input type="submit" name="submit" value="取消"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>