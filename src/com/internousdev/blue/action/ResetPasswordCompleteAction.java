package com.internousdev.blue.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.blue.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordCompleteAction extends ActionSupport implements SessionAware{
		private Map<String, Object> session;

		public String execute(){

				String result = ERROR;
				UserInfoDAO userInfoDAO = new UserInfoDAO();
				int count = userInfoDAO.resetPassword(session.get("userIdForResetPassword").toString(),session.get("newPassword").toString()); //userInfoDAOに登録したユーザーIDと新しいパスワードをString型にしてint countに代入

				if(count > 0){
						result = SUCCESS;
				}

				//userInfoDAOにユーザーIDと新しいパスワードが保存されていたなら、sessionに格納したユーザーIDと新しいﾊﾟｽﾜｰﾄﾞを削除する

				session.remove("userIdForResetPassword");
				session.remove("newPassword");

				return result;

		}

		public Map<String, Object> getSession(){
				return session;
		}

		public void setSession(Map<String, Object> session) {
				this.session = session;
		}
}
