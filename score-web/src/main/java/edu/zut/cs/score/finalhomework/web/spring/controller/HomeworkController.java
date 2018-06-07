package edu.zut.cs.score.finalhomework.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.score.base.web.spring.controller.GenericController;
import edu.zut.cs.score.finalhomework.domain.Homework;
import edu.zut.cs.score.finalhomework.service.HomeworkManager;

@Controller
@RequestMapping("/finalhomework/homework")
public class HomeworkController extends GenericController<Homework, Long, HomeworkManager>{
	
	HomeworkManager homeworkManager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		System.out.println("-----------?");
		String result = "/homework/index";
		return result;
	}
	
	@Autowired
	public void setHomeworkManager(HomeworkManager homeworkManager) {
		this.homeworkManager = homeworkManager;
		this.manager = this.homeworkManager;
	}
	
	@RequestMapping(value=".json")
	@ResponseBody
	public Homework show() {
		Homework h = new Homework();
		h.setName("12222");
		return h;
		
	}
}
