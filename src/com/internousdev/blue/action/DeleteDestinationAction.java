package com.internousdev.blue.action;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.blue.dao.DestinationInfoDAO;
import com.internousdev.blue.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteDestinationAction extends ActionSupport implements SessionAware{

	private String id;
	private List<DestinationInfoDTO> destinationInfoDTOList; //destinationInfoDTOのリストを宣言
	private Map<String,Object> session; //決済確認画面のセッション情報を宣言する

	public String execute(){
		//sessionがタイムアウトであるかのチェック
		if(!session.containsKey("tempUserId") && !session.containsKey("userId")){
			return "sessionTimeout";
		}

		String result=ERROR; //resultの初期値をERRORと宣言する
		DestinationInfoDAO destinationInfoDAO=new DestinationInfoDAO();
		int count=destinationInfoDAO.deleteDestination(id); //削除したユーザーIDの件数を宣言する

		//1件以上でも選択されて削除をするなら、実行する
		if(count>0){
			destinationInfoDTOList=destinationInfoDAO.getDestinationInfo(session.get("userId").toString());
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
