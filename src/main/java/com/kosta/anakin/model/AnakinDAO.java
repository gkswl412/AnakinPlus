package com.kosta.anakin.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnakinDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	static final String namespace = "org.kosta.anakin.";
	
	public List<SearchResultVO> searchCottageBySCVO(SearchConditionVO scVO){
		return sqlSession.selectList(namespace + "searchCottageBySCVO");
	}
}
