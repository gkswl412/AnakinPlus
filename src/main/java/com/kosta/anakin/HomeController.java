package com.kosta.anakin;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kosta.anakin.model.AnakinService;
import com.kosta.anakin.model.SearchConditionVO;
import com.kosta.anakin.model.SearchResultVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	AnakinService anakinService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "jsp/home";
	}
	
	@RequestMapping(value = "/search/byArea", method = RequestMethod.POST)
	public String searchResult(SearchConditionVO scVO, Model model, HttpSession session) {
		//home.jsp에서 입력정보 왔는지 확인
		logger.info(scVO.toString());
		//받은정보 세션에 저장
		session.setAttribute("scVO", scVO);
		List<SearchResultVO> result = anakinService.searchCottageBySCVO(scVO);
		session.setAttribute("result", result);
		return "jsp/searchResult";
	}
	
}
