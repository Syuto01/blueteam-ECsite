package com.internousdev.blue.action;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.blue.dao.CartInfoDAO;
import com.internousdev.blue.dao.DestinationInfoDAO;
import com.internousdev.blue.dao.PurchaseHistoryInfoDAO;
import com.internousdev.blue.dto.CartInfoDTO;
import com.internousdev.blue.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware{
	private String id;
	private Map<String,Object> session; //決済完了のセッション(表示している時間)内容を宣言する

	public String execute(){
		//sessionがタイムアウトのチェック
		if(!session.containsKey("tempUserId") && !session.containsKey("userId")){
			return "sessionTimeout";
		}

		String result=ERROR; //resultの初期値をERRORとする
		String userId = session.get("userId").toString(); //カートからユーザーIDの情報の初期値を宣言

		DestinationInfoDAO dao=new DestinationInfoDAO();
		DestinationInfoDTO destinationInfoDTO=dao.getDestinationInfo(id, userId);

		if(!userId.equals(destinationInfoDTO.getUserId())) {
			return ERROR;
		}

		@SuppressWarnings("unchecked") //決済確認画面でチェックをしていない時、コンパイルする度に警告が出てしまうのを抑制
		List<CartInfoDTO> cartInfoDTOList=(List<CartInfoDTO>) session.get("cartInfoDTOList");
		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO=new PurchaseHistoryInfoDAO();
		int count=0; //countの初期値を0とする
		//ログインしているユーザーIDを用いてカートに商品ID･個数･価格の情報を格納して行き、決済件数とする
		for(CartInfoDTO dto:cartInfoDTOList){
			count+=purchaseHistoryInfoDAO.regist(userId,dto.getProductId(),dto.getProductCount(),Integer.parseInt(id),dto.getPrice());
		}

		if(count>0){
			//決済件数が1件でもあるなら、cartInfoDAOクラスにインスタンス化をする
			CartInfoDAO cartInfoDAO=new CartInfoDAO();
			//ユーザーIDを用いてcartInfoDAOクラスのDelCartUserIdメソッドでカートにある送り先情報を削除する
		    cartInfoDAO.DelCartUserId(userId);
			result=SUCCESS;
		}
		return result;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id=id;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
