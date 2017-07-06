<%@page import="com.test.ex.Adto.AADto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function myFunction() {
		alert("登録されました");
	}
</script>
<style type="text/css">
a, a:hover {
	color: #646EFF;
	text-decoration: none;
}
</style>
</head>
<body>

	<center>
		<hr width="1550" color="SKYBLUE" size="2" />
		<div style="font-family: 'Meiryo'">
			<font color="#646EFF" , size="5"> <a href="list.do">
					<h2 align="center">" AIS営業支援システムTest "</h2>
			</a>
			</font>
		</div>
		<hr width="1550" color="SKYBLUE" size="4" />
	</center>

	<table align="center" width="600" cellpadding="6" cellspacing="3" border="1">
		<form action="write.do" method="post">
			<tr>
				<td width="100" align="right">御客名</td>
				<td><input type="text" name="aName" size="55" /></td>
			</tr>

			<tr>

				<td width="100" align="right">ステータス</td>
				<td><select name="sc" />
					<option value="">選択してください</option>
					<option value="結果待ち">結果待ち</option>
					<option value="面談前">面談前</option>
					<option value="ＯＫ">ＯＫ</option>
					<option value="ＮＧ">ＮＧ</option> </select></td>
			</tr>
			<tr>
				<td width="100" align="right">案件名</td>
				<td><input type="text" name="aContentM" size="55" '/></td>
			</tr>
			<tr>
				<td width="100" align="right">案件概要</td>
				<td><input type="text" name="aContentG" size="55" '/></td>
			</tr>
			<tr>
				<td width="100" align="right">作業場所</td>
				<td><input type="text" name="aSpace" size="55" '/></td>
			</tr>
			<tr>
				<td width="100" align="right">期間</td>
				<td><input type="text" name="aDay" size="55" '/></td>
			</tr>
			<tr>
				<td width="100" align="right">募集人数</td>
				<td><input type="text" name="aNumber" size="55" '/></td>
			</tr>
			<tr>
				<td width="100" align="right">スキル</td>
				<td><input type="text" name="aSkill" size="55" '/></td>
			</tr>
			<tr>
				<td width="100" align="right">要件</td>
				<td><input type="text" name="aYoken" size="55" '/></td>
			</tr>
			<tr>
				<td width="100" align="right">商流</td>
				<td><input type="text" name="aSangryu" size="55" '/></td>
			</tr>
			<tr>
				<td width="100" align="right">その他</td>
				<td><input type="text" name="aEtc" size="55" '/></td>
			</tr>
			<tr>
				<td width="100" align="right">案件担当</td>
				<td><input type="text" name="aManager" size="55" '/></td>
			</tr>
			<tr>
				<td colspan="10" align="center"><input type="submit" value="登録"
					id="clickTxt" />&nbsp;&nbsp; <a href="list.do"> <input
						type="button" value="リスト" /></a>
			</tr>
			<script>
				var txt = document.getElementById("clickTxt");
				if (txt.addEventListener) {
					txt.addEventListener("click", myFunction);
				} else {
					txt.attachEventListener("onclick", myFunction);
				}
			</script>
		</form>
	</table>
	</center>
</body>
</html>