<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<style type="text/css">
body {
	background-image: url(photo/picture.jpg);
	background-repeat: no-repeat;
	width: 100%;
	height: 100%;
}
</style>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function() {
		$(".span1").hide();
		$(".span2").hide();
		$(".name").blur(function(){
			$(".span1").hide();
			$(".span2").hide();
			var name = $(".name").val();
			var password = $(".password").val();
			$(".span2").show();
			$.ajax({
				url : "${pageContext.request.contextPath}/check",
				type : "post",
				dataType : "text",
				data : {name : name},
				success:function(data){
					if(data==0){
						$(".span2").hide();
						$(".span1").show();
					}else{
						$(".span1").hide();
						$(".span2").hide();
					}
				}
			});
		});
		
		$(".button").click(function() {
			var name = $(".name").val();
			var password = $(".password").val();
			if(name.length==0){
				alert("姓名不能为空");
			}else if(password==0){
				alert("密码不能为空");
			}else {
				$.ajax({
					url : "${pageContext.request.contextPath}/login",
					type : "post",
					dataType : "text",
					data : {
						name : name,password:password
					},
					success : function(data) {
						if(data==0){
							alert("用户名与密码不匹配");
						}else if(data==1){
							window.location.href="skip.jsp";
						}else if(data==3){
							window.location.href="employee.jsp";
						}else if(data==4){
							window.location.href="Supervisor.jsp";
						}else{
							window.location.href="manager.jsp";
						}
					}
				});
			}
		});
	})
</script>
<body>
	<div align="center">
		<h4>登录</h4>
		<form action="">
			用&nbsp户&nbsp名<input type="text" name="name" class="name" />
			<span class="span1" style="color: gray">用户名不存在</span><span class="span2" style="color: gray">检测中...</span><br /> 
			密&nbsp&nbsp&nbsp码<input type="password" name="password" class="password" /><br />
			<input type="button" class="button" value="登录" style="background: pink; margin: center; width: 100px" /><br/>
			<input type="reset" value="取消" style="background: pink; margin: center; width: 100px" /><br />
			<span style="color: red;font-style: italic;">没有账号快去注册吧</span>
			<a href="regist.jsp"><span style="color: blue">注册</span></a>			
		</form>
	</div>
</body>
</html>