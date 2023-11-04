<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String scheme=request.getScheme();
	String serverName=request.getServerName();
	int serverPort=request.getServerPort();
	String contextPath=request.getContextPath();
	String basePath=scheme+"://"+serverName+":"+serverPort+contextPath+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
body{
	margin: 0px;
}
.main_div{
	width: 100%;
	background-color: #f9f9f9;
	padding: 1px;
}
.title_div{
	width: 1200px;
	height:46px;
	line-height:46px;
	margin:50px auto 0;
	text-align:center;
	background-color: #fff;
	font-family:"宋体","Arial Narrow",HELVETICA; 
}
.title_div h2{
  color: #666;
  font-size: 19px;
}
.content_div{
	width: 1200px;
	height:500px;
	margin:10px auto;
	background-color: #fff;
	font-family:"宋体","Arial Narrow",HELVETICA; 
}
.content_div ul{
	width: 100%;
}
.content_div ul li{
	width:31%;
	height:40px;
	line-height:40px;
	font-size: 16px;
	float: left;
	list-style-type:none;
	border-bottom: 1px dashed #ddd;
}
.content_div ul li a{
	text-decoration: none;
}
</style>
</head>
<body>
<div class="main_div">
	<div class="title_div">
		<h2>没有岁月可回头目录</h2>
	</div>
	<div class="content_div">
		<ul>
			<c:forEach items="${requestScope.titleList}" var="title" varStatus="status">
			<li>
				<a href="<%=basePath%>main/goPage?page=chapter&num=${status.index+1 }" target="blank">${title }</a>
			</li>
			</c:forEach>
		</ul>
	</div>
</div>
</body>
</html>