package edu.zut.cs.score.fenzu.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.score.fenzu.domain.Fenzu;
import edu.zut.cs.score.fenzu.service.FenzuManager;

import edu.zut.cs.score.base.web.spring.controller.GenericController;

/**
 * web控制器，跳转Index页面
 * @author panshaoqian
 *
 */
@Controller
@RequestMapping("fenzu/fenzu")

public class FenzuTestController extends GenericController<Fenzu,Long,FenzuManager>{
	FenzuManager fenzuManager;
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/fenzu/index";
		return result;
	}
	@Autowired
	public void setFenzuManager(FenzuManager fenzuManager) {
		this.fenzuManager=fenzuManager;
		this.manager=this.fenzuManager;
		
	}
	
	
	

}
