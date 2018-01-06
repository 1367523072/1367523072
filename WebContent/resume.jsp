<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function() {
		$(".button").click(function() {
			window.history.back();
		});
	})
</script>
<body>
	<c:if test="${empty requestScope.resume}">
		<form action="${pageContext.request.contextPath}/resume" method="get">
			<table border="1">
				<tr>
					<td colspan="4" align="center">简历</td>
				</tr>
				<tr>
					<td>真实姓名</td>
					<td><input type="text" style="color: gray" value="请输入真实姓名"
						name="name" /></td>
					<td>性别</td>
					<td>男<input type="radio" value="男" name="gender" />女<input
						type="radio" name="gender" value="女" />
					</td>
				</tr>
				<tr>
					<td>年龄</td>
					<td><input type="text" style="color: gray" value="请输入:"
						name="age" /></td>
					<td>学历</td>
					<td><select name="diploma">
							<option value="高中及以下">高中及以下</option>
							<option value="大学">大学</option>
							<option value="研究生">研究生</option>
							<option value="博士及以上">博士及以上</option>
					</select></td>
				</tr>
				<tr>
					<td>联系方式</td>
					<td><input type="text" style="color: gray" value="请输入联系方式"
						name="tel" /></td>
					<td>e-mail</td>
					<td><input type="text" style="color: gray" value="请输入e-mail"
						name="email" /></td>
				</tr>
				<tr>
					<td>应聘职位</td>
					<td><select name="department">
							<option value="部门">部门</option>
					</select> <select name="position">
							<option value="职位">职位</option>
					</select></td>
					<td>政治面貌</td>
					<td><select name="politicalStatus">
							<option value="普通群众">普通群众</option>
							<option value="团员">团员</option>
							<option value="党员">党员</option>
							<option value="其他">其他</option>
					</select></td>
				</tr>
				<tr>
					<td>上份工作</td>
					<td><input type="text" style="color: gray" value="请输入工作名称"
						name="lastJob" /></td>
					<td>工作经验</td>
					<td><input type="text" style="color: gray" value="请输入几年工作经验"
						name="workingExperience" /></td>
				</tr>
				<tr>
					<td>期望薪资</td>
					<td><select name="expectedSalary">
							<option value="3000-4000">3000-4000</option>
							<option value="4000-5000">4000-5000</option>
							<option value="5000-6000">5000-6000</option>
							<option value="6000-7000">6000-7000</option>
					</select></td>
					<td>兴趣爱好</td>
					<td><input type="text" style="color: gray" value="请输入兴趣爱好"
						name="hobbies" /> <input type="hidden" name="userId"
						value="${sessionScope.user.id}" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="保存" /></td>
					<td colspan="2"><input type="button" value="返回" class="button" /></td>
				</tr>
			</table>
		</form>
	</c:if>
	
	<c:if test="${!empty requestScope.resume}">
		<form action="${pageContext.request.contextPath}/resume" method="get">
			<table border="1">
				<tr>
					<td colspan="4" align="center">简历</td>
				</tr>
				<tr>
					<td>真实姓名</td>
					<td><input type="text" style="color: gray" value="${requestScope.resume.name}"
						name="name" /></td>
					<td>性别</td>
					<td>男<input type="radio" value="男" name="gender" 
						<c:if test="${requestScope.resume.gender=='男'}">checked="checked"</c:if>
					/>
					女<input type="radio" name="gender" value="女" 
						<c:if test="${requestScope.resume.gender=='女'}">checked="checked"</c:if>
					/>
					</td>
				</tr>
				<tr>
					<td>年龄</td>
					<td><input type="text" style="color: gray" value="${requestScope.resume.age}"
						name="age" /></td>
					<td>学历</td>
					<td><select name="diploma">
							<option value="高中及以下" <c:if test="${requestScope.resume.diploma=='高中及以下'}">selected="selected"</c:if>>高中及以下</option>
							<option value="大学" <c:if test="${requestScope.resume.diploma=='大学'}">selected="selected"</c:if>>大学</option>
							<option value="研究生" <c:if test="${requestScope.resume.diploma=='研究生'}">selected="selected"</c:if>>研究生</option>
							<option value="博士及以上" <c:if test="${requestScope.resume.diploma=='博士及以上'}">selected="selected"</c:if>>博士及以上</option>
					</select></td>
				</tr>
				<tr>
					<td>联系方式</td>
					<td><input type="text" style="color: gray" value="${requestScope.resume.tel}"
						name="tel" /></td>
					<td>e-mail</td>
					<td><input type="text" style="color: gray" value="${requestScope.resume.email}"
						name="email" /></td>
				</tr>
				<tr>
					<td>应聘职位</td>
					<td><select name="department" class="department">
					<c:if test="${!empty requestScope.departments}">
						<c:forEach items="${requestScope.departments}" var="department">
							<option value="${department.name}">${department.name}</option>
						</c:forEach>
					</c:if>
					</select> <select name="position">
					<%-- <c:if test="${!empty requestScope.positions}">
						<c:forEach items="${positions}" var="position" >
							<c:forEach items="${position.departments}" var="department">
								<c:if test="${position.depName==department.name}">
									<option value="${position.name}">${position.name}</option>
								</c:if>
							</c:forEach>
						</c:forEach>
					</c:if> --%>
					</select></td>
					<td>政治面貌</td>
					<td><select name="politicalStatus">
							<option value="普通群众" <c:if test="${requestScope.resume.politicalStatus=='普通群众'}">selected="selected"</c:if>>普通群众</option>
							<option value="团员" <c:if test="${requestScope.resume.politicalStatus=='团员'}">selected="selected"</c:if>>团员</option>
							<option value="党员" <c:if test="${requestScope.resume.politicalStatus=='党员'}">selected="selected"</c:if>>党员</option>
							<option value="其他" <c:if test="${requestScope.resume.politicalStatus=='其他'}">selected="selected"</c:if>>其他</option>
					</select></td>
				</tr>
				<tr>
					<td>上份工作</td>
					<td><input type="text" style="color: gray" value="${requestScope.resume.lastJob}"
						name="lastJob" /></td>
					<td>工作经验</td>
					<td><input type="text" style="color: gray" value="${requestScope.resume.workingExperience}"
						name="workingExperience" /></td>
				</tr>
				<tr>
					<td>期望薪资</td>
					<td><select name="expectedSalary">
							<option value="3000-4000" <c:if test="${requestScope.resume.expectedSalary=='3000-4000'}">selected="selected"</c:if>>3000-4000</option>
							<option value="4000-5000" <c:if test="${requestScope.resume.expectedSalary=='4000-5000'}">selected="selected"</c:if>>4000-5000</option>
							<option value="5000-6000" <c:if test="${requestScope.resume.expectedSalary=='5000-6000'}">selected="selected"</c:if>>5000-6000</option>
							<option value="6000-7000" <c:if test="${requestScope.resume.expectedSalary=='6000-7000'}">selected="selected"</c:if>>6000-7000</option>
					</select></td>
					<td>兴趣爱好</td>
					<td><input type="text" style="color: gray" value="${requestScope.resume.hobbies}"
						name="hobbies" /> <input type="hidden" name="userId"
						value="${sessionScope.user.id}" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="保存" /></td>
					<td colspan="2"><input type="button" value="返回" class="button" /></td>
				</tr>
			</table>
		</form>
	</c:if>
	
	
</body>
</html>
