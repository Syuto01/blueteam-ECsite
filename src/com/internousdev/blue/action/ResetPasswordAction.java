package com.internousdev.blue.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordAction extends ActionSupport implements SessionAware {
		private int backFlag;
		private Map<String, Object> session;

		//次の画面に遷移した場合、sessionに格納された仮のユーザーIDを削除する
		public String execute(){
				if (backFlag !=1) {
				         session.remove("userIdForResetPassword");
				}
				 return SUCCESS;
		}
		public int getBackFlag(){
				return backFlag;
		}
		public void setBackFlag(int backFlag){
				this.backFlag = backFlag;
		}
		public Map<String, Object> getSession(){
				return session;
		}
		public void setSession(Map<String, Object> session){
				this.session = session;
		}
}
