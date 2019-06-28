package com.internousdev.blue.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.blue.dao.PurchaseHistoryInfoDAO;
import com.internousdev.blue.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeletePurchaseHistoryAction extends ActionSupport implements SessionAware{

		private List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList;
		private Map<String, Object> session;

		public String execute() {

			if(!session.containsKey("tempUserId") && !session.containsKey("userId")) {
				return "sessionTimeout";
			}

			String result = ERROR;
			PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
			int count = purchaseHistoryInfoDAO.deleteAll(String.valueOf(session.get("userId")));
			if(count > 0) {
				purchaseHistoryInfoDTOList = purchaseHistoryInfoDAO.getPurchaseHistoryList(String.valueOf(session.get("userId")));
				result=SUCCESS;
			}else{

				purchaseHistoryInfoDTOList= purchaseHistoryInfoDAO.getPurchaseHistoryList(String.valueOf(session.get("userId")));
				result=SUCCESS;

			}

			return result;
		}

		public List<PurchaseHistoryInfoDTO> getPurchaseHistoryInfoDTOList() {
			return purchaseHistoryInfoDTOList;
		}

		public void setPurchaseHistoryInfoDTOList(List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList) {
			this.purchaseHistoryInfoDTOList = purchaseHistoryInfoDTOList;
		}

		public Map<String, Object> getSession() {
			return session;
		}
		public void setSession(Map<String, Object> session) {
			this.session = session;
		}
}

