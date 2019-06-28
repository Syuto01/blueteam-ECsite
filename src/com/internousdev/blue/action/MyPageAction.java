package com.internousdev.blue.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.blue.dao.UserInfoDAO;
import com.internousdev.blue.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	UserInfoDTO userInfoDTO;
	private Map<String, Object> session;

	public String execute() {

		if(!session.containsKey("tempUserId") && !session.containsKey("userId")) {
			return "sessionTimeout";
		}

		UserInfoDAO userInfoDAO = new UserInfoDAO();

		userInfoDTO = userInfoDAO.getUserInfo(String.valueOf(session.get("userId")));

		if(userInfoDTO.getUserId() == null) {
			userInfoDTO = null;
		}

		return SUCCESS;
	}
	public UserInfoDTO getUserInfoDTO() {
		return userInfoDTO;
	}
	public void setUserInfoDTO(UserInfoDTO userInfoDTO) {
		this.userInfoDTO = userInfoDTO;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}

