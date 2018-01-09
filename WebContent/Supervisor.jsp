<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主管界面</title>
</head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		$(".div3").hide();
		$(".div1").click(function(){
			$(".div3").toggle();		
		});
		$(".div2").click(function(){
			
		});
	})
</script>
<body>
	<div>
		<a href="#" class="div1">通知管理</a>
		<a href="#" class="div2">绩效管理</a>
	</div>
	<div class="div3">
		<a href="${pageContext.request.contextPath}/interView">面试通知</a>
		<a href="#">培训通知</a>
	</div>
</body>
</html>