<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-1.7.2.js"></script>
<script type="text/javascript">
	function temp(){
		window.location.href="tourist.jsp";
	}
	setTimeout('temp()',2000);
</script>
<body>
	<div align="center">
		<b style="color: red;size: 20px">恭喜您，登录成功！</b><a href="tourist.jsp" style="color: blue">进入个人界面</a><br/>
		<b style="color: red;size: 20px">2秒后自动跳转......</b>
	</div>
</body>
</html>