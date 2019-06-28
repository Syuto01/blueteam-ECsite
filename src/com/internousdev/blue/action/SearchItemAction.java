package com.internousdev.blue.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.blue.dao.MCategoryDAO;
import com.internousdev.blue.dao.ProductInfoDAO;
import com.internousdev.blue.dto.MCategoryDTO;
import com.internousdev.blue.dto.ProductInfoDTO;
import com.internousdev.blue.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class SearchItemAction extends ActionSupport implements SessionAware {
	private String categoryId;
	private String keywords;
//	変数keywordsErrorMessageListはdoCheckメソッドから値を受け取るためList
	private List<String> keywordsErrorMessageList;
	private List<ProductInfoDTO> productInfoDTOList;
	private Map<String,Object> session;

	public String execute() {

//		カテゴリーの選択肢が存在しない場合は、すべてのカテゴリーを設定する
		if (categoryId ==null) {
			categoryId ="1";
		}

//		検索ワードの入力チェックを行う準備
		InputChecker inputChecker = new InputChecker();

//		検索ワードに様々な種類のスペースがはいっていたりnullの場合に変換処理をしている、入力チェック（未入力）
		if(StringUtils.isBlank(keywords)) {
			//検索ワードが null,""," ","　"の時に空文字に設定する
			keywords = "";
		}else {
//			検索ワードが空でなければ、以下の処理を行う
//			（キーワードの"　"を" "に変換して" "2個以上を" "に変換処理をしている）
			keywords = keywords.replaceAll("　"," ").replaceAll("\\s{2,}"," ");
		}

//		keywordsが空文字でない場合、入力チェックを行う（桁数、文字種）
		if(!(keywords.equals(""))) {
			keywordsErrorMessageList = inputChecker.doCheck("検索ワード",keywords,0,50, true,true,true,true,false,true,true);
//			doCheckメソッドで確認した結果1件以上エラーがあれば、エラーメッセージを表示する
			if(keywordsErrorMessageList.size()>0) {
				return SUCCESS;
			}
		}

//		検索ワードの入力チェックが完了したので、これから検索条件（検索ワード、カテゴリー）に合わせて商品情報をとってくる
		ProductInfoDAO productInfoDAO = new ProductInfoDAO();

//		検索ワードがスペースで区切られている場合、splitメソッドを使ってスペースで区切って文字列を分割して検索できるようにしてから渡し、
//		データベースから商品情報をとってくる。その後productInfoDTOListにとってきた商品情報を格納している。
		switch(categoryId) {
//		categoryIdの"1"は、全てのカテゴリー
		case"1":
			productInfoDTOList = productInfoDAO.getProductInfoListByKeyword(keywords.split(" "));
			break;
//		全てのカテゴリー以外のカテゴリーが選択されている場合、その条件も踏まえて商品情報を取ってくる
		default:
			productInfoDTOList = productInfoDAO.getProductInfoListByCategoryIdANDKeyword(keywords.split(" "),categoryId);
			break;
		}

//		 カテゴリーのリストが表示されていなければ、作成する
//		（カテゴリーをセッションに入れていてセッション切れした場合）
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

		return SUCCESS;
	}

	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public List<String> getKeywordsErrorMessageList() {
		return keywordsErrorMessageList;
	}
	public void setKeywordsErrorMessageList(List<String> keywordsErrorMessageList) {
		this.keywordsErrorMessageList = keywordsErrorMessageList;
	}

	public List<ProductInfoDTO> getProductInfoDTOList() {
		return productInfoDTOList;
	}
	public void setProductInfoDTOList(List<ProductInfoDTO> productInfoDTOList) {
		this.productInfoDTOList = productInfoDTOList;
	}

	public Map<String,Object> getSession() {
		return session;
	}
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
}