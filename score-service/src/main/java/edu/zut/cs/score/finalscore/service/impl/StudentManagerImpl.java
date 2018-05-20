package edu.zut.cs.score.finalscore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.score.finalscore.dao.StudentDao;
import edu.zut.cs.score.finalscore.domain.Student;
import edu.zut.cs.score.finalscore.service.StudentManager;
import edu.zut.cs.score.base.service.impl.GenericManagerImpl;

@Component
public class StudentManagerImpl extends GenericManagerImpl<Student, Long> implements StudentManager{

	StudentDao studentDao;

	@Autowired
	public void setUserDao(StudentDao studentDao) {
		this.studentDao = studentDao;
		this.dao = this.studentDao;
	}

	@Override
	public Student findbyStudentname(String studentDao) {
		// TODO Auto-generated method stub
		return null;
	}
}
