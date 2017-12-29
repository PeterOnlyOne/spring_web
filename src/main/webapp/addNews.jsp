<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="${pageContext.request.contextPath }/newsList" method="post">
	<h1>标题:</h1>
	<input type="text" name="title" />
	<h1>内容：</h1>
	<textarea rows="25" cols="25" name="contents"></textarea><br/>
	<input type="submit" value="添加" />
  </form>
</body>
</html>