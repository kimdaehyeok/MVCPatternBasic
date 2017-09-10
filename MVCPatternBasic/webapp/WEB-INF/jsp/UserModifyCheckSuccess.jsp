<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	UserModifyCheckSuccess.jsp!!</br></br>
	
	<c:out value="${User.empNO}"></c:out></br>
	<c:out value="${User.eName}"></c:out></br>
	<c:out value="${User.job}"></c:out></br>
	<c:out value="${User.mgr}"></c:out></br>
	<c:out value="${User.hiredate}"></c:out></br>
	<c:out value="${User.sal}"></c:out></br>
	<c:out value="${User.comm}"></c:out></br>
	<c:out value="${User.deptno}"></c:out></br>
	<c:out value="${User.id}"></c:out></br>
	<c:out value="${User.password}"></c:out></br></br>
	
	<form action="/UserInfoModify.do" method="POST">
		empNO : <input type = "text" name="empNO" value=<c:out value="${User.empNO}"></c:out> style="background-color:#a9a9a9" readonly><br>
		eName : <input type = "text" name="eName" value=<c:out value="${User.eName}"></c:out>><br>
		job : <input type = "text" name="job" value=<c:out value="${User.job}"></c:out>><br>
		hirerdate : <input type = "text" name="job" value=<c:out value="${User.hiredate}" ></c:out> style="background-color:#a9a9a9" readonly><br>
		mgr : <input type = "text" name="mgr" value=<c:out value="${User.mgr}"></c:out> style="background-color:#a9a9a9" readonly><br>
		sal : <input type = "text" name="sal" value=<c:out value="${User.sal}"></c:out>><br>
		comm : <input type = "text" name="comm" value=<c:out value="${User.comm}"></c:out> style="background-color:#a9a9a9" readonly><br>
		deptno : <input type = "text" name="deptno" value=<c:out value="${User.deptno}"></c:out>><br>
		id : <input type = "text" name="id" value=<c:out value="${User.id}"></c:out> style="background-color:#a9a9a9" readonly><br>
		password : <input type = "password" name="password" value=<c:out value="${User.password}"></c:out>><br>
		<input type = "submit" value="submit"/>
	</form>
</body>
</html>