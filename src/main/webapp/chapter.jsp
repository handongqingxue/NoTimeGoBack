<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE>
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
.chapter_div{
	width: 1200px;
	margin:50px auto;
	background-color: #fff;
	font-family:"宋体","Arial Narrow",HELVETICA; 
}
.title_div{
	width: 960px;
	height: 100px;
	line-height: 100px;
	font-size: 26px;
	text-align: center;
    margin: 15px auto;
	border-bottom: 1px dashed #CECECE;
}
.content_div{
	width: 960px;
	margin:auto;
}
.paragraph_div{
	line-height: 40px;
	color:#333;
	text-indent:2em;
	font-size: 20px;
}
.img_a{
	text-decoration: none;
}
.next_chap_nav_div{
	line-height: 60px;
	color:#333;
	font-size: 20px;
	text-align: center;
}
</style>
</head>
<body>
${requestScope.content }
<div class="paragraph_div">
</div>
</body>
</html>