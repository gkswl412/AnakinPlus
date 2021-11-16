package com.kosta.anakin.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnakinService {
	
	@Autowired
	AnakinDAO dao;
	
	public List<SearchResultVO> searchCottageBySCVO(SearchConditionVO scVO) {
		return dao.searchCottageBySCVO(scVO);
	}
}
