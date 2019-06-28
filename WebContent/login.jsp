<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/blue.css">
<script src="./js/login.js"></script>
<title>ログイン画面</title>
</head>
<body>

	<jsp:include page="header.jsp" />

	<div id="contents">
		<h1>ログイン画面</h1>

		<s:if test="idCheckList != null && idCheckList.size() > 0 || passwordCheckList != null && passwordCheckList.size() > 0">
			<!-- エラーメッセージ -->
			<s:if test="idCheckList != null && idCheckList.size() > 0">
				<p class="info redText"><s:iterator value="idCheckList"><s:property /><br></s:iterator></p>
			</s:if>
			<s:if test="passwordCheckList != null && passwordCheckList.size() > 0">
				<p class="info redText"><s:iterator value="passwordCheckList"><s:property /><br></s:iterator></p>
			</s:if>
		</s:if>

		<s:form id="loginForm">
		<table class="list-table">
		 <colgroup>
		  <col width="20%">
		  <col width="80%">
		 </colgroup>
		<tr>
			<th scope="row">ユーザーID</th>
			<td>
				<s:if test="#session.savedUserIdFlag">
					<input type="text" name="userId" value="<s:property value='#session.savedUserId' />" class="txt bgYellow" />
				</s:if>
				<s:elseif test="#session.savedUserIdFlag == null">
					<input type="text" name="userId" value="<s:property value='userId' />" class="txt bgYellow" />
				</s:elseif>
			</td>
		</tr>
		<tr>
			<th scope="row">パスワード</th>
			<td><input type="password" name="password" class="txt bgYellow" /></td>
		</tr>
		</table>
		<p class="mt20">
			<s:if test="#session.savedUserIdFlag"><input type="checkbox" name="savedUserIdFlag" checked="checked" value="true" /></s:if>
			<s:else><input type="checkbox" name="savedUserIdFlag" value="true" /></s:else>ユーザーID保存
		</p>
		<p class="mt10 tC"><s:submit value="ログイン" onclick="login();" class="submit_btn" /></p>
		<p class="tC"><s:submit value="新規ユーザー登録" onclick="createUser();" class="submit_btn" /></p>
		<p class="tC"><s:submit value="パスワード再設定" onclick="resetPassword();" class="submit_btn" /></p>
		</s:form>
	</div>

</body>
</html>