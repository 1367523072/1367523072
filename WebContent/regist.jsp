<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
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
		$(".exist").hide();
		$(".judge").hide();
		$(".button").click(function() {
		var name = $(".name").val();
		var password1 = $(".password1").val();
		var password2 = $(".password2").val();
			if(name.length==0){
				alert("姓名不能为空");
			}else if(password1==0){
				alert("密码不能为空");
			}else if (password1 != password2) {
				$(".judge").show();
			}else {
				$.ajax({
					url : "${pageContext.request.contextPath}/regist",
					type : "post",
					dataType : "text",
					data : {
						name : name,password:password1
					},
					success : function(data) {
						if(data==1){
							$(".exist").show();
						}else{
						window.location.href="temp.jsp";
						}
					}
				});
			}
		});
	})
</script>
</head>
<body>
	<div align="center">
		<form >
			用&nbsp户&nbsp名<input type="text" name="name" class="name" /><span
				class="exist" style="color: gray">用户名已存在</span><br /> 密&nbsp&nbsp&nbsp码<input
				type="password" name="password" class="password1" /><br /> 确认&nbsp密码<input
				type="password" name="name" class="password2" /><span class="judge" style="color: gray">两次密码不一致</span><br />
			<input type="button" class="button" value="注册"
				style="background: pink; margin: center; width: 100px" /><br /> <input
				type="reset" value="取消"
				style="background: pink; margin: center; width: 100px" />
		</form>
	</div>
</body>
</html>