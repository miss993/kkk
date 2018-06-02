package edu.zut.cs.score.finalscore.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.score.base.web.spring.controller.GenericController;
import edu.zut.cs.score.finalscore.domain.Student;
import edu.zut.cs.score.finalscore.service.StudentManager;

@Controller
@RequestMapping("/teach/student")
public class StudentController extends GenericController<Student, Long, StudentManager>{

	StudentManager studentManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/student/index";
		return result;
	}

	@Autowired
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
		this.manager = this.studentManager;
	}

	
}
