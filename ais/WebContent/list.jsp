<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.awt.*, java.awt.* "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
	text-decoration: none;
	font-family: "맑은 고딕";
}

button {
	padding: 4px 15px;
	font-family: "Meiryo";
	background: orage;
	color: black;
	border: 1;
	cursor: pointer;
	border-radius: 5px;
	-webkit-border-radius: 5px;
}
button2 {
	font-size: 9pt ;
	padding: 5px 10px;
	font-family: "Meiryo";
	background: skyblue;
	color: #fff;
	border: none;
	cursor: pointer;
	border-radius: 5px;
	-webkit-border-radius: 5px;
	border: 1px solid #CCCCCC;
}
button3 {
	font-size: 9pt ;
	padding: 5px 10px;
	font-family: "Meiryo";
	background: pink;
	color: #fff;
	border: none;
	cursor: pointer;
	border-radius: 5px;
	-webkit-border-radius: 5px;
	border: 2px solid #red;
}
button4 {
	padding: 5px 15px;
	font-family: "맑은 고딕";
	background: #FF7A7A;
	color: #fff;
	border: none;
	cursor: pointer;
	border-radius: 5px;
	-webkit-border-radius: 5px;
}
table{
	font-family: "맑은 고딕";
	background: white;
	color: black;
		border: 1;
}
div2{
	font-family: "맑은 고딕";
	background: pink;
	color: #fff;
	border: none;
}
#box{
	position : absolute;
	left : 10px;
	right : 60px;
	width: 20px;
	height: 0px;
	border : 2px solid #f60;
}
</style>
<style type="text/css">
a, a:hover {
	color: #FF5A5A;
	text-decoration: none;
}
</style>

<style type="text/css">
#board, #pageForm, #searchForm {
	text-align: center;
}

#bList {
	text-align: center;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	<script type="text/javascript">
	function writeForm() {
		location.href = "BoardWriteForm.do";
	}
</script>
</head>
<body>
<div id="box"></div>
<script>
var $box=$("#box");
var x_var = 10;
var y_var = 10;
var num = 10;
var timer = setInterval("moving_fn()",100);

function moving_fn(){
	x_var +=10;
	if(x_var >1500){
		clearInterval(timer);
		return;
	}
	$box.css({left:x_var +"px"});
}
</script>
	<center>
		<hr width="1550" color="orange" size="2" />
		<font color="#FF5A5A"> </font>
		<div style="font-family: 'Meiryo'">
			<font color="#FF5A5A" , size="5"> <a href="list.do"><h2
						align="center">" AIS営業支援システム "</h2></a>
			</font>
		</div>
		<hr width="1550" color="orange" size="4" />
	</center>

	<br />
	<center>
		<table width="1500" cellpadding="2" cellspacing="1" border="0">
			<tr>
				</div>
				<td align="left"><a href="write_view.do">
						<button4>新規作成</button4>
				</a></td>

				<!--  검색 부분 -->
				<div id="searchForm">

					<form>

						<td align="right" valign="middle"><select name="opt">
								<option value="0">選択</option>
								<option value="1">御客</option>
								<option value="2">ステータス</option>
								<option value="3">案件名</option>
								<option value="4">案件概要</option>
								<option value="5">作業場所</option>
								<option value="6">期間</option>
								<option value="7">募集人数</option>
								<option value="8">スキル</option>
								<option value="9">要件</option>
								<option value="10">上流</option>
								<option value="11">その他</option>
								<option value="12">案件担当</option>
								<option value="13">作成日</option>

						</select> <input type="text" size="20" name="condition" />&nbsp;
						<button id= "submit">検索</button></td>
			</tr>
			</form>
		</table>
		<br />
		<tr>
			<table width="1500" cellpadding="8" cellspacing="1" border="1">

				<td align="center" width="40">no</td>
				<td align="center" width="80">顧客名</td>
				<td align="center" width="90">ステータス</td>
				<td align="center" width="80">案件名</td>
				<td align="center" width="80">案件概要</td>
				<td align="center" width="80">作業場所</td>
				<td align="center" width="100">期間</td>
				<td align="center" width="80">募集人数</td>
				<td align="center" width="100">スキル</td>
				<td align="center" width="80">要件</td>
				<td align="center" width="80">商流</td>
				<td align="center" width="100">その他</td>
				<td align="center" width="80">案件担当</td>
				<td align="center" width="100">作成日</td>
				<td align="center" width="50">更新</td>
				<td align="center" width="50">削除</td>

				</tr>
				<tr>
					<c:forEach items="${list}" var="dto">
						<tr>
							<td align="center">${dto.aId}</td>
							<td align="center">${dto.aName}</td>
							<td align="center">${dto.aStetas}</td>
							<td align="center">${dto.aContentM}</td>
							<td align="center">${dto.aContentG}</td>
							<td align="center">${dto.aSpace}</td>
							<td align="center">${dto.aDay}</td>
							<td align="center">${dto.aNumber}</td>
							<td align="center">${dto.aSkill}</td>
							<td align="center">${dto.aYoken}</td>
							<td align="center">${dto.aSangryu}</td>
							<td align="center">${dto.aEtc}</td>
							<td align="center">${dto.aManager}</td>
							<td align="center">${dto.aDate}</td>
							<td align="center"><a href="view.do?aId=${dto.aId}">
							<button2 id = "button">更新</button2></a></td>
							<td align="center"><a href="delete.do?aId=${dto.aId}">
							<button3 id = "button">削除</button3></a></td>
						</tr>
					</c:forEach>
				</tr>

			</table>


			<!-- 페이지 넘버 부분 -->
			<br>
			<div id="pageForm">
				<c:if test="${startPage != 1}">
					<a href='BoardListAction.bo?page=${startPage-1}'>[ 前画面 ]</a>
				</c:if>

				<c:forEach var="pageNum" begin="${startPage}" end="${endPage}">
					<c:if test="${pageNum == spage}">
				${pageNum}&nbsp;
			</c:if>
					<c:if test="${pageNum != spage}">
						<a href='BoardListAction.bo?page=${pageNum}'>${pageNum}&nbsp;</a>
					</c:if>
				</c:forEach>

				<c:if test="${endPage != maxPage }">
					<a href='BoardListAction.bo?page=${endPage+1 }'>[次画面]</a>
				</c:if>
			</div>
	<br/>

			<button2 id="fn1" onclick="call_fn1()">fn1</button2>
			<button3 id="fn2" onclick="call_fn2('두번째 함수')">fn2</button3>
			<button2 id="fn3">fn3</button2>
			<button3 id="fn4">fn4</button3>
	</center>
</body>
</html>