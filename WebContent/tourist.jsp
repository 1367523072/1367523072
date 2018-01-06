<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>游客界面</title>
</head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		$(".div1").hide();
		$(".div2").hide();
		var FeedbackForms = $(".FeedbackForms").val();
		if(FeedbackForms.length!=2){
			alert("您有未查看的反馈信息");
		}
		$(".change").click(function(){
			$(".div1").toggle();
		});
		$(".submit").click(function(){
			var old = $(".old").val();
			var new1 = $(".new1").val();
			var new2 = $(".new2").val();
			$.ajax({
				url:"${pageContext.request.contextPath}/checkPassword",
				type:"post",
				dataType:"text",
				data:{password:old},
				success:function(data){
					alert(data);
					if(data==0){
						alert("原密码填写错误请重新输入");
					}else{
						if(new1.length==0||new1!=new2){
							alert("两次输入的新密码不同请检查");
						}else{
							$.ajax({
								url:"${pageContext.request.contextPath}/changePaaword",
								type:"post",
								dataType:"text",
								data:{password:new1},
								success:function(data){
									alert(data);
									if(data==1){
										alert("修改成功");
										$(".div1").hide();
									}else{
										alert("修改失败");
									}
								}
							});
						}
					}
				}
			});
		});
		
		$(".applicationForm").click(function(){
			$(".div2").toggle();
		});
		
		$(".close").click(function(){
			var close = confirm("确认退出吗？");
			if(close==true){
				window.close();
			}
		});
	})
</script>
<body>
	<div>
		<b style="color: red">当前用户：${sessionScope.user.name}</b>
		<a href="#" class="applicationForm">反馈</a>
		<a href="${pageContext.request.contextPath}/watchResume">查看简历</a>
		<a href="#" class="change">修改密码</a>
		<a href="#">其他</a>
		<a href="#" class="close">退出</a>
	</div>
	
	<div class="div1">
		<form>
			<table border="1">
			<caption>修改密码</caption>
				<tr>
					<td>原密码</td>
					<td><input type="text" class="old"/></td>
				</tr>
				<tr>
					<td>新密码</td>
					<td><input type="text" name="password" class="new1"/></td>
				</tr>
				<tr>
					<td>确认密码</td>
					<td><input type="text" class="new2"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type="button" value="确认修改" style="color: red" class="submit"/></td>
				</tr>
			</table>
		</form>
	</div>
	
	<div class="div2">
		<input class="FeedbackForms" type="hidden" value="${sessionScope.noFeedbackForms}">
		<c:if test="${!empty sessionScope.noFeedbackForms}">
			<table border="1">
				<tr>
					<td colspan="5"></td>
				</tr>
				<tr>
					<td>投递时间</td>
					<td>是否查看</td>
					<td>是否面试</td>
					<td>面试时间</td>
					<td>是否录用</td>
				</tr>
				<c:forEach items="${sessionScope.noFeedbackForms}" var="FeedbackForm">
					<tr>
						<td>
							<f:formatDate value="${FeedbackForm.date }" pattern="yyyy-MM-dd"/>
						</td>
						<td>${FeedbackForm.status }</td>
						<td>${FeedbackForm.interviewStatus }</td>
						<td>
							<f:formatDate value="${FeedbackForm.interviewTime }" pattern="yyyy-MM-dd"/>
						</td>
						<td>${FeedbackForm.hiring }</td>
				</tr>			
				</c:forEach>
			</table>
			</c:if>
			
			<c:if test="${!empty sessionScope.query}">
			<table border="1">
				<tr>
					<td colspan="5"></td>
				</tr>
				<tr>
					<td>投递时间</td>
					<td>是否查看</td>
					<td>是否面试</td>
					<td>面试时间</td>
					<td>是否录用</td>
				</tr>
				<c:forEach items="${sessionScope.query}" var="query">
					<tr>
						<td>
							<f:formatDate value="${query.date }" pattern="yyyy-MM-dd"/>
						</td>
						<td>${query.status }</td>
						<td>${query.interviewStatus }</td>
						<td>${query.date }</td>
						<td>${query.date }</td>
				</tr>			
				</c:forEach>
			</table>
			</c:if>
			<c:if test="${empty sessionScope.query}">
				<b style="color: red">还没有反馈哦</b>
			</c:if>
	</div>
	
	
</body>
</html>