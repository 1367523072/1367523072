<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主管界面</title>
</head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function() {
		$(".div3").hide();
		$(".div1").click(function() {
			$(".div3").toggle();
			$("table").toggle();
		});
		$(".number").blur(function(){
			var number = $(this).val();
			var userId = $(this).next().val();
			$(this).attr("disabled",true);
			$.ajax({
				url:"${pageContext.request.contextPath}/addPerfor",
				type:"post",
				dataType:"text",
				data:{number:number,userId:userId},
				success:function(data){
					alert(data);
				}
			});
		});
	})
</script>
<body>
	<div>
		<a href="#" class="div1">通知管理</a> <a
			href="${pageContext.request.contextPath}/performance" class="div2">绩效管理</a>
	</div>
	<div class="div3">
		<a href="${pageContext.request.contextPath}/interView">面试通知</a> <a
			href="${pageContext.request.contextPath}/alltrain">培训通知</a>
	</div>
	<c:if test="${!empty requestScope.trains}">
		<table border="1" class="table">
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>PERTMENT</td>
				<td>DATE</td>
			</tr>
			<c:forEach items="${requestScope.trains}" var="train">
				<tr>
					<td>${train.id}</td>
					<td>${train.name}</td>
					<td>${train.dept}</td>
					<td>${train.date}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${!empty requestScope.employees}">
		<form action="">
			<table border="1">
				<tr>
					<td>USERID</td>
					<td>NUMBER</td>
				</tr>
				<c:forEach items="${requestScope.employees}" var="employee">
					<tr>
						<td>${employee.userId}</td>
						<td>
							<input type="text" name="number" class="number"/>
							<input type="hidden" name="userId" value="${employee.userId}"/>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</c:if>
</body>
</html>