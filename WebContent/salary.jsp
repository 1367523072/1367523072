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
		$(".wageDiscrepancy").click(function(){
			var id = $(this).attr("href").split("=")[1];
			var date = $(this).attr("href").split("=")[2];
			alert(id);
			alert(date);
			var reason = prompt("请输入异议缘由");
			if(reason){
				$.ajax({
					url:"${pageContext.request.contextPath}/wageDiscrepancy",
					type:"post",
					dataType:"text",
					data:{id:id,reason:reason,date:date},
					success:function(data){
						if(data==1){
							alert("申诉已提交");
						}else if(data==0){
							alert("申诉提交失败");
						}else{
							alert("已经提交过，请勿一个工资条提交多次");
						}
					}
				});
			}
		});
	})
</script>
<body>
<c:if test="${!empty requestScope.employee.salarys}">
	<table border="1">
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
				<td>${salary.eName}</td>
				<td>${salary.total}</td>
				<td>${salary.basePay}</td>
				<td>${salary.meritPay}</td>
				<td>${salary.overtimeWage}</td>
				<td>${salary.rewardsPunishmentsWages}</td>
				<td>${salary.socialSecurity}</td>
				<td>
					<f:formatDate value="${salary.date}" pattern="yyyy-MM-dd"/>
				</td>
				<td><a href="#?id=${requestScope.employee.id}=${salary.date}" class="wageDiscrepancy">异议</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
<c:if test="${empty requestScope.employee.salarys}">
还没有你的工资发放记录！！
</c:if>

</body>
</html>