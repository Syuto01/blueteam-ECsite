<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/blue.css">
<script src="./js/resetPassword.js"></script>
<title>パスワード再設定確認</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
	<h1>パスワード再設定確認画面</h1>
	<s:form id="resetPasswordForm">
		<table class="list-table">
		<colgroup>
		  <col width="20%">
		  <col width="80%">
		 </colgroup>
			<tr>
				<th scope="row"><s:label value="ユーザーID"/>
				</th>
				<td><s:property value="userId"/></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="新しいパスワード"/></th>
				<td><s:property value="concealedPassword"/>
				</td>
			</tr>
		</table>
		<div class="tC mt20">
			<s:submit value="パスワード再設定" class="submit_btn" onclick="goResetPasswordCompleteAction()"/>
		</div>
		<div class="tC mt20">
			<s:submit value="戻る" class="submit_btn" onclick="goResetPasswordAction()"/>
		</div>
		<s:hidden id="backFlag" name="backFlag" value=""/>
	</s:form>
</div>
</body>
</html>