package com.internousdev.blue.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.blue.dao.CartInfoDAO;
import com.internousdev.blue.dao.UserInfoDAO;
import com.internousdev.blue.dto.CartInfoDTO;
import com.internousdev.blue.dto.UserInfoDTO;
import com.internousdev.blue.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private List<String> idCheckList = new ArrayList<String>();
	private List<String> passwordCheckList = new ArrayList<String>();
	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
	private UserInfoDAO userDAO = new UserInfoDAO();
	private UserInfoDTO userDTO = new UserInfoDTO();
	private CartInfoDAO cartDAO = new CartInfoDAO();
	private String userId;
	private String password;
	private boolean savedUserIdFlag;
	private int cartgoukeiprice;
	private String message="";

	public String execute() throws SQLException {

		if(!session.containsKey("tempUserId") && !session.containsKey("userId")) {
			return "sessionTimeout";
		}

		String result = ERROR;

		/* ======== ユーザーID保存有無の確認 ======== */
		if(savedUserIdFlag) {
			session.put("savedUserIdFlag", true);
			session.put("savedUserId", userId);  //ユーザーID保存チェックでエラーをしてもinputで表示させるため必要
		} else {
			session.remove("savedUserIdFlag");
			session.remove("savedUserId");
		}

		/* ======== inputの確認 ======== */
		InputChecker checker = new InputChecker();
		idCheckList = checker.doCheck("ユーザーID", userId, 1, 8, true, false, false, true, false, false, false);
		passwordCheckList = checker.doCheck("パスワード", password, 1, 16, true, false, false, true, false, false, false);
		if(idCheckList.size() > 0 || passwordCheckList.size() > 0) {  //エラー
			return result;
		}

		/* ======== ユーザーID、パスワード認証  ======== */
		userDTO = userDAO.getUserInfo(userId, password);
		if(userId.equals(userDTO.getUserId()) && password.equals(userDTO.getPassword())) {
			result = SUCCESS;
			String tempUserId = session.get("tempUserId").toString();

			/* ==== ランダムIDのカートあり ==== */
			List<CartInfoDTO> cartListRandomUserId = new ArrayList<CartInfoDTO>();
			cartListRandomUserId = cartDAO.getCartInfo(tempUserId);
			if(cartListRandomUserId.size() > 0) {
				//カートの紐付け
				int num;
				num = cartDAO.UpdateCartItemUserId(userId, tempUserId);
				if(num > 0) {  //紐付けできたら
					List<String> getSameProductIdList = new ArrayList<>();
					getSameProductIdList = cartDAO.getchouhukuProId(userId);  //重複した商品IDをList型で取得
					if(getSameProductIdList.size() > 0) {  //重複があったら
						for(String p:getSameProductIdList) {
							List<String> getSameCartIdList = new ArrayList<>();
							getSameCartIdList = cartDAO.getCartIdbyProId(userId, p);  //重複した商品IDを持っているカートIDをList型で取得
							String firstitem=getSameCartIdList.get(0);
							cartDAO.omatomecart(userId, p, firstitem);  //重複している最初のカートに全ておまとめ。
							for(int i=1; i<getSameCartIdList.size(); i++) {
					            String deleteitem=getSameCartIdList.get(i);
								cartDAO.DeleteCartItem(deleteitem);  //重複しているカートIDの最初以外を削除。
							}
						}
					}
				} else {  //エラー
					result = "DBError";
					return result;
				}
			}

			/* ==== userIdのカートあり ==== */
			cartList = cartDAO.getCartInfo(userId);
			if (session.containsKey("cartFlag")) {
				session.remove("cartFlag");
				cartgoukeiprice = cartDAO.CartGoukeiPrice(userId);
				result = "cart";
			}

		} else {  //エラー
			idCheckList.add("ユーザーIDまたはパスワードが異なります。");
			return result;
		}

		/* ======== ログインフラグの変更  ======== */
		userDAO.login(userId, password);

		/* ======== sessionに入れる  ======== */
		session.put("userId", userId);
		session.put("password", password);
		session.put("logined", 1);
		if(savedUserIdFlag) {
			session.put("savedUserId", userId);
		} else {
			session.remove("savedUserId");
		}

		return result;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getSavedUserIdFlag() {
		return savedUserIdFlag;
	}

	public void setSavedUserIdFlag(boolean savedUserIdFlag) {
		this.savedUserIdFlag = savedUserIdFlag;
	}

	public List<String> getIdCheckList() {
		return idCheckList;
	}

	public void setIdCheckList(List<String> idCheckList) {
		this.idCheckList = idCheckList;
	}

	public List<String> getPasswordCheckList() {
		return passwordCheckList;
	}

	public void setPasswordCheckList(List<String> passwordCheckList) {
		this.passwordCheckList = passwordCheckList;
	}

	public ArrayList<CartInfoDTO> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<CartInfoDTO> cartList) {
		this.cartList = cartList;
	}

	public int getCartgoukeiprice() {
		return cartgoukeiprice;
	}

	public void setCartgoukeiprice(int cartgoukeiprice) {
		this.cartgoukeiprice = cartgoukeiprice;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}