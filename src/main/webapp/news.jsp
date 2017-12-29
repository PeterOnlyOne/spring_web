<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="${pageContext.request.contextPath }/newsList" method="get" style="display: inline-block;">
    内容:<input type="text" name="content" value="${param.content }" />
    <input type="submit" value="查询" />
  </form>
  <a href="addNews.jsp"><input type="button" value="添加" /></a>
  <table border="1px" style="border-collapse:collapse">
  	<tr>
  	  <th style="width:5%">新闻编号</th>
  	  <th style="width:25%">新闻标题</th>
  	  <th style="width:60%">新闻内容</th>
  	  <th style="width:10%">创作时间</th>
  	</tr>
  	<c:forEach var="list" items="${requestScope.newsListByContent }">
  	  <tr>
	  	<td>${pageScope.list.newsid }</td>
	  	<td>${pageScope.list.title }</td>
	  	<td>${pageScope.list.content }</td>
	  	<td>${pageScope.list.createtime }</td>
  	  </tr>
  	</c:forEach>

  </table>
</body>
</html>