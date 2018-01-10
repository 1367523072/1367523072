<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详细信息</title>
</head>
<body>
	<form action="">
		<table border="1">
				<tr>
					<td colspan="4" align="center">个人信息</td>
				</tr>
				<tr>
					<td>真实姓名</td>
					<td><input type="text" style="color: gray" value="${requestScope.employee.resume.name}"
						name="name" /></td>
					<td>性别</td>
					<td>男<input type="radio" value="男" name="gender" 
						<c:if test="${requestScope.employee.resume.gender=='男'}">checked="checked"</c:if>
					/>
					女<input type="radio" name="gender" value="女" 
						<c:if test="${requestScope.employee.resume.gender=='女'}">checked="checked"</c:if>
					/>
					</td>
				</tr>
				<tr>
					<td>年龄</td>
					<td><input type="text" style="color: gray" value="${requestScope.employee.resume.age}"
						name="age" /></td>
					<td>学历</td>
					<td><select name="diploma">
							<option value="高中及以下" <c:if test="${requestScope.employee.resume.diploma=='高中及以下'}">selected="selected"</c:if>>高中及以下</option>
							<option value="大学" <c:if test="${requestScope.employee.resume.diploma=='大学'}">selected="selected"</c:if>>大学</option>
							<option value="研究生" <c:if test="${requestScope.employee.resume.diploma=='研究生'}">selected="selected"</c:if>>研究生</option>
							<option value="博士及以上" <c:if test="${requestScope.employee.resume.diploma=='博士及以上'}">selected="selected"</c:if>>博士及以上</option>
					</select></td>
				</tr>
				<tr>
					<td>联系方式</td>
					<td><input type="text" style="color: gray" value="${requestScope.employee.resume.tel}"
						name="tel" /></td>
					<td>e-mail</td>
					<td><input type="text" style="color: gray" value="${requestScope.employee.resume.email}"
						name="email" /></td>
				</tr>
				<tr>
					<td>职位</td>
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
							<option value="普通群众" <c:if test="${requestScope.employee.resume.politicalStatus=='普通群众'}">selected="selected"</c:if>>普通群众</option>
							<option value="团员" <c:if test="${requestScope.employee.resume.politicalStatus=='团员'}">selected="selected"</c:if>>团员</option>
							<option value="党员" <c:if test="${requestScope.employee.resume.politicalStatus=='党员'}">selected="selected"</c:if>>党员</option>
							<option value="其他" <c:if test="${requestScope.employee.resume.politicalStatus=='其他'}">selected="selected"</c:if>>其他</option>
					</select></td>
				</tr>
				<tr>
					<td>上份工作</td>
					<td><input type="text" style="color: gray" value="${requestScope.employee.resume.lastJob}"
						name="lastJob" /></td>
					<td>工作经验</td>
					<td><input type="text" style="color: gray" value="${requestScope.employee.resume.workingExperience}"
						name="workingExperience" /></td>
				</tr>
				<tr>
					<td>薪资</td>
					<td>${requestScope.employee.salarys}</td>
					<td>兴趣爱好</td>
					<td><input type="text" style="color: gray" value="${requestScope.employee.resume.hobbies}"
						name="hobbies" /> <input type="hidden" name="userId"
						value="${sessionScope.user.id}" /></td>
				</tr>
				<tr>
					<td>入职时间</td>
					<td>
						<f:formatDate value="${requestScope.employee.date}" pattern="yyyy-MM-dd-hh-mm"/>
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="button" value="返回" class="button" /></td>
				</tr>
			</table>
	</form>
</body>
</html>