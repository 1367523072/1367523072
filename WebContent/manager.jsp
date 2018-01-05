<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员界面</title>
</head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		$(".div1").hide();
		$(".close").click(function(){
			var close = confirm("确认退出吗？");
			if(close==true){
				window.close();
			}
		});
		
		$(".a1").click(function(){
			$(".div1").toggle();
		});
	})
</script>


<body>
	<div>
		<b style="color: red">当前用户：${sessionScope.user.name}</b>
		<a href="ApplicationManagement" class="a1">应聘管理</a>
		<a href="#">部门职位</a>
		<a href="#">培训管理</a>
		<a href="#">员工管理</a>
		<a href="#">奖惩管理</a>
		<a href="#">薪资管理</a>
		<a href="#">工资异议</a>
		<a href="#" class="close">退出</a>
	</div>
		
	<div class="div1">
		<table>
			<tr>
				<td>序号</td>
				<td>应聘者</td>
				<td>投递时间</td>
				<td>查看状态</td>
				<td>面试状态</td>
				<td colspan="2">操作</td>
			</tr>
			<c:forEach items="${requestScope.list}" var="list">
				<tr>
					<td>${list.id }</td>
					<td>${list.uId }</td>
					<td>${list.date }</td>
					<td>${list.status }</td>
					<td>${list.interviewStatus }</td>
					<td><a href="#">查看</a></td>
					<td><a href="#">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	
	
</body>
</html>