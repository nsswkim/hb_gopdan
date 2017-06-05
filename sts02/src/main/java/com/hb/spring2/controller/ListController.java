package com.hb.spring2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hb.spirng2.model.SimpleDao;

public class ListController implements Controller {
	private SimpleDao dao;
	
	public void setDao(SimpleDao dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		System.out.println("list doa"+dao);
		/*SimpleDao dao = new SimpleDao();*/		
		mav.addObject("alist", dao.selectAll());		
		mav.setViewName("list");		
		return mav;
	}

}
