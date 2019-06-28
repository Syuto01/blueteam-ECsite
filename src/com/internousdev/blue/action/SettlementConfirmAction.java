package com.internousdev.blue.action;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.blue.dao.CartInfoDAO;
import com.internousdev.blue.dao.DestinationInfoDAO;
import com.internousdev.blue.dto.CartInfoDTO;
import com.internousdev.blue.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementConfirmAction extends ActionSupport implements SessionAware{
	private List<DestinationInfoDTO> destinationInfoDTOList; //DestinationInfoDTOクラスのリストを宣言
	private Map<String,Object> session; //カートのセッション状態を宣言する

	public String execute() {
		String result=ERROR; //ログインしていない状態で初期値をERRORと宣言する
		CartInfoDAO cartInfoDAO=new CartInfoDAO();
		List<CartInfoDTO> cartInfoDTOList=new ArrayList<CartInfoDTO>();
		String userId=null; //ログインしていない状態のユーザーIDをnull値(空の値)と宣言する
		int logined=Integer.parseInt(String.valueOf(session.get("logined"))); //カート内でログイン状態を宣言する

		if(logined==1){
			//ログインをしている場合はユーザーIDを取得する
			userId=session.get("userId").toString();
			//ユーザーに紐づくカート情報を取得する
			cartInfoDTOList=cartInfoDAO.getCartInfo(userId);
			session.put("cartInfoDTOList",cartInfoDTOList);
			//ユーザーに紐づく
			DestinationInfoDAO destinationInfoDAO=new DestinationInfoDAO();
			destinationInfoDTOList=destinationInfoDAO.getDestinationInfo(String.valueOf(session.get("userId")));
			result=SUCCESS;
		}else{
			//ログイン後、何も動作がないような状態の場合は自動的にログアウトをして再度ログインを求める
			session.put("cartFlag","1");
			result="login"; //ログインをする
		}
		return result;
	}

	public List<DestinationInfoDTO> getDestinationInfoDTOList(){
		return destinationInfoDTOList;
	}

	public void setDestinationInfoDTOList(List<DestinationInfoDTO> destinationInfoDTOList){
		this.destinationInfoDTOList=destinationInfoDTOList;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
