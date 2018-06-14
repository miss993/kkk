package edu.zut.cs.score.assignments.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.score.assignments.domain.Assignments;
import edu.zut.cs.score.assignments.service.AssignmentsManager;
import edu.zut.cs.score.base.web.spring.controller.GenericController;
/**
 * 
 * @author zhoutong
 *
 * index跳转
 */
@Controller
@RequestMapping("/assignments/assignments")
public class AssignmentsController extends GenericController<Assignments,Long,AssignmentsManager>{
	
	AssignmentsManager assignmentsManager;
	
	@RequestMapping(method = RequestMethod.GET,value="/index.html")
	public String index() {
		System.out.println("???????");
		String result = "/assignments/index";
		return result;
	}
	
	@Autowired
	public void setAssignmentsManager(AssignmentsManager assignmentsManager) {
		this.assignmentsManager = assignmentsManager;
		this.manager = this.assignmentsManager;
	}
}
