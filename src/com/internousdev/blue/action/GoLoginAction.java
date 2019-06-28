package com.internousdev.blue.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoLoginAction extends ActionSupport implements SessionAware {

	Map<String, Object> session;

	public String execute() {
		if(!session.containsKey("tempUserId") && !session.containsKey("userId")) {
			return "sessionTimeout";
		}
		session.remove("cartFlag");
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}