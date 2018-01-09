<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>薪资</title>
</head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		$(".href").click(function(){
			var id = $(this).href.splite()[0];
			alert(id);
			var a = prompt();
			if(a){
				$.ajax({
					url:"${pageContext.request.contextPath}/wageDiscrepancy",
					type:"post",
					dataType:"text",
					data:{id:id,reason:a},
					success:function(data){
						if(data==1){
							alert("投诉成功");
						}else{
							alert("投诉失败");
						}
					}
				});
			}
		});
	})
</script>
<body>
	<table>
		<tr>
			<td>姓名</td>
			<td>总工资</td>
			<td>基本工资</td>
			<td>绩效工资</td>
			<td>加班工资</td>
			<td>奖惩工资</td>
			<td>社保</td>
			<td>时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.employee.salarys}" var="salary">
			<tr>
				<td>${salary.uName}</td>
				<td>${salary.total}</td>
				<td>${salary.basePay}</td>
				<td>${salary.meritPay}</td>
				<td>${salary.overtimeWage}</td>
				<td>${salary.RewardsPunishmentsWages}</td>
				<td>${salary.socialSecurity}</td>
				<td>
					<f:formatDate value="${salary.date}" pattern="yyyy-MM-dd"/>
				</td>
				<td><a href="#?id=${salary.id}" class="href">异议</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>