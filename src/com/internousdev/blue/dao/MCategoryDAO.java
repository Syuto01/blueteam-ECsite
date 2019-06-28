package com.internousdev.blue.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.blue.dto.MCategoryDTO;
import com.internousdev.blue.util.DBConnector;

public class MCategoryDAO {

//	カテゴリ情報を取得（カテゴリマスタテーブルから）
	public List<MCategoryDTO> getMCategoryList() {
		DBConnector dbc = new DBConnector();
		Connection con = dbc.getConnection();
		List<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();
		String sql = "select*from m_category";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				MCategoryDTO mCategoryDTO = new MCategoryDTO();
				mCategoryDTO.setId(rs.getInt("id"));
				mCategoryDTO.setCategoryId(rs.getInt("category_id"));
				mCategoryDTO.setCategoryName(rs.getString("category_name"));
				mCategoryDTO.setCategoryDescription(rs.getString("category_description"));
				mCategoryDTOList.add(mCategoryDTO);
			}
		}catch(SQLException e) {
				e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return mCategoryDTOList;
	}
}