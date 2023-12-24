<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<c:if test="${param.num eq 12 }">
<div class="paragraph_div">
前面有条大河，河水是红色的，冒着热气。对岸离这边大约有好几百米，用肉眼就可以望见对岸是片树林。那边就是黑枫林的深处，很多人就是在那边迷路的。西蒙走到河边，刚要跳下水游到对岸却发现这哪是什么河水，分明是岩浆。有只耗子无意中失足跌落到岩浆里，几秒钟后白骨浮出水面。正当西蒙犯愁如何渡过时，对面飘来了一块和草地差不多，方圆一米左右的东西，可以当作小船带你到对岸。西蒙便跳了上去，那块草地似的小船载着他去往对岸。几位猎户以为还会有其他那种漂浮物来接他们过河，结果只有西蒙坐的那唯一一块而已。西蒙站在漂浮物上，不一会就到了对岸，朝树林深处去了，消失在这边岸上几位猎户的视线里。他们后悔刚才应该出来跟他打声招呼，大家一起去对岸或许会安全些。
</div>
<div class="paragraph_div">
漂浮物虽然可以载着他们过河，但行驶速度特别缓慢。来回要十来分钟，比划船都慢，而且载重多了还会往下沉，一次只能载着两人过河。猎户两位两位的坐着它往对岸飘去，途中从岩浆里时不时的泛出一串串红色的水泡，但都是在漂浮物周围半米以外的范围，好像是让着漂浮物似的。终于几位猎户都抵达了对岸，已经过去了将近一小时，还不知道西蒙现在走到哪里，会不会迷路。几位猎户感觉眼皮直跳，有种不详的预感。他们继续穿着盔甲保证自身安全，朝黑枫林深处去了。虽然没有再看见西蒙的身影，不知其身处何处，还好他们穿着盔甲行走，没有再遇到新的麻烦。
</div>
<div class="paragraph_div">
走了一个多时辰，一条大河又出现在他们眼前，原来他们又绕回到了刚才的地方。现在他们有两个选择，要么放弃继续寻找西蒙，坐着漂浮物原路回去；要么想办法继续往前走，走出这片迷林。几位猎户继续缓慢的摸索着前行，感觉一直超前行走，但花了三个多时辰，却迂回了三次都绕回了原地。太阳慢慢的从地平线升起，天快亮了，有位猎户建议先休息一会再想办法，这样继续走下去只能白白的消耗体力。
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
<div class="paragraph_div">
</div>
</c:if>
</body>
</html>