<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
 <html>
 <head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="./css/blue.css">
  <title>決済確認</title>
 </head>
 <body>

  <!--  「header.jsp」を呼び出してロゴや機能を上に表示する -->
  <jsp:include page="header.jsp" />
  <script type="text/javascript" src="./js/settlementConfirm.js"></script>

  <div id="contents">
    <h1>決済確認画面</h1>

<!--   送り先情報が1件でもある場合は送り先情報を選択して下さいと画面に表示をする -->
    <s:if test="destinationInfoDTOList!=null&&destinationInfoDTOList.size()>0">

	<div class="info blueText">
         宛先情報を選択してください。
	</div>

<!-- 個人情報を表示する。1行目に項目を表示する。 -->
     <s:form id="settlementConfirmForm">
     <table class="list-table historytable th">
     <!-- 縦の列の幅を変える (7列の幅が合計100%にする)-->
	 <colgroup>
 	  <col width="2%">
 	  <col width="9%">
 	  <col width="9%">
 	  <col width="20%">
 	  <col width="20%">
 	  <col width="20%">
 	  <col width="20%">
	 </colgroup>
      <tr>
       <th><s:label value="#"/></th>
       <th><s:label value="姓"/></th>
       <th><s:label value="名"/></th>
       <th><s:label value="ふりがな"/></th>
       <th><s:label value="住所"/></th>
       <th><s:label value="電話番号"/></th>
       <th><s:label value="メールアドレス"/></th>
      </tr>

<!-- 2行目以降に登録した送り先情報を表示する。 -->
     <s:iterator value="destinationInfoDTOList" status="st">
      <tr>
       <td>
<!--  ラジオボタンをチェックしていない -->
        <s:if test="#st.index==0">
        <input type="radio" name="id" checked="checked" value="<s:property value='id' />"/>
        </s:if>
        <s:else>
<!--  ラジオボタンをチェックしている -->
         <input type="radio" name="id" value="<s:property value='id'/>"/>
        </s:else>
       </td>
       <td><s:property value="familyName"/></td>
       <td><s:property value="firstName"/></td>
       <td>
<!--  スパンタグを用いて姓と名のかなを繋げる -->
        <s:property value="familyNameKana"/><span>　</span><s:property value="firstNameKana"/><br>
       </td>
       <td><s:property value="userAddress"/></td>
       <td><s:property value="telNumber"/></td>
       <td><s:property value="email"/></td>
      </tr>
      </s:iterator>
    </table>

<!-- 決済ボタンを表示 -->
   <div class="tC mt10">
    <s:submit value="決済" class="submit_btn" onClick="goSettlementCompleteAction()"/>
   </div>

<!-- 削除ボタンを表示 -->
   <div class="tC mt10">
    <s:submit value="削除" class="submit_btn" onClick="goDeleteDestinationAction()"/>
   </div>
  </s:form>
  </s:if>

  <s:else>
   <div class="info blueText">
    宛先情報がありません。
   </div>
  </s:else>

<!-- 新規宛先登録ボタンは宛先情報の有無で表示切替はないが、決済ボタンは宛先情報の有の場合のみ表示するため、コードの可読性を考慮してformを2つにする -->
  <div class="tC mt10">
   <s:form action="CreateDestinationAction">
    <s:submit value="新規宛先登録" class="submit_btn"/>
   </s:form>
  </div>

 </div>

 </body>

</html>
