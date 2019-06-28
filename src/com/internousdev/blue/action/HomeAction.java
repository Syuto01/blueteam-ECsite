package com.internousdev.blue.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.blue.dao.MCategoryDAO;
import com.internousdev.blue.dto.MCategoryDTO;
import com.internousdev.blue.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {

	private Map<String,Object> session;

	public String execute() {

//	 1)カテゴリを取得する
		if(!session.containsKey("mCategoryDTOList")) {
			List<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();
			MCategoryDAO mCategoryDAO = new MCategoryDAO();
			try {
				mCategoryDTOList = mCategoryDAO.getMCategoryList();
			}catch(NullPointerException e) {
				mCategoryDTOList = null;
			}
			session.put("mCategoryDTOList", mCategoryDTOList);
		}

//	 2)仮ユーザーID(16桁のランダムな数字)を作成する
		if(!(session.containsKey("tempUserId"))) {
			CommonUtility commonUtility = new CommonUtility();
			session.put("tempUserId", commonUtility.getRamdomValue());
		}

//	セッション切れでログインフラグが無い場合、ログインフラグを未ログイン状態(0)でセッションに入れる
		if(!session.containsKey("logined")) {
			session.put("logined", 0);
		}
	return  SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}