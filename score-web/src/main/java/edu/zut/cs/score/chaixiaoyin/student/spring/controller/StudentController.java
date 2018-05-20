package edu.zut.cs.score.chaixiaoyin.student.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.score.base.web.spring.controller.GenericController;
import edu.zut.cs.score.finalhomework.domain.Student;
import edu.zut.cs.score.finalhomework.service.StudentManager;

@Controller
@RequestMapping("/student")
public class StudentController extends GenericController<Student, Long, StudentManager>{

	StudentManager studentManager;
	
	@Autowired
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager=studentManager;
		this.manager=this.studentManager;
	}
}
