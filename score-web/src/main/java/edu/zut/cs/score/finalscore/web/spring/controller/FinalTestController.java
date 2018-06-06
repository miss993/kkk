package edu.zut.cs.score.finalscore.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.zut.cs.score.base.web.spring.controller.GenericController;
import edu.zut.cs.score.finalscore.domain.FinalTest;
import edu.zut.cs.score.finalscore.service.FinalTestManager;

@Controller
@RequestMapping("/finalscore/finalscore")
public class FinalTestController extends GenericController<FinalTest, Long, FinalTestManager>{

	FinalTestManager finaltestManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/finalscore/index";
		return result;
	}

	@Autowired
	public void setStudentManager(FinalTestManager finaltestManager) {
		this.finaltestManager = finaltestManager;
		this.manager = this.finaltestManager;
	}

}
