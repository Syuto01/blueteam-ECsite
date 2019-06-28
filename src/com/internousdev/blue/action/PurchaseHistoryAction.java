package com.internousdev.blue.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.blue.dao.PurchaseHistoryInfoDAO;
import com.internousdev.blue.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware{

	private List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList;
	private Map<String, Object> session;

	public String execute() {

		if(!session.containsKey("tempUserId") && !session.containsKey("userId")) {
			return "sessionTimeout";
		}

		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		purchaseHistoryInfoDTOList = purchaseHistoryInfoDAO.getPurchaseHistoryList(String.valueOf(session.get("userId")));

		return SUCCESS;
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