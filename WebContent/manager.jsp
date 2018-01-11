<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		$(".div4").hide();
		$(".close").click(function(){
			var close = confirm("确认退出吗？");
			if(close==true){
				window.close();
			}
		});
		$(".button").click(function(){
			$(".div4").toggle();
		});
	})
</script>


<body>
	<div>
		<b style="color: red">当前用户：${sessionScope.user.name}</b>
		<a href="${pageContext.request.contextPath}/employee.jsp">办公</a>
		<a href="${pageContext.request.contextPath}/hiringTable">招聘管理</a>
		<a href="${pageContext.request.contextPath}/ApplicationManagement">应聘管理</a>
		<a href="${pageContext.request.contextPath}/depart">部门职位</a>
		<a href="${pageContext.request.contextPath}/train">培训管理</a>
		<a href="${pageContext.request.contextPath}/allEmployee">员工管理</a>
		<a href="${pageContext.request.contextPath}/prizeInfo">奖惩管理</a>
		<a href="${pageContext.request.contextPath}/salary">薪资管理</a>
		<a href="${pageContext.request.contextPath}/viewWageDiscrepancy">工资异议</a>
		<a href="#" class="close">退出</a>
	</div>
	
</body>
</html>