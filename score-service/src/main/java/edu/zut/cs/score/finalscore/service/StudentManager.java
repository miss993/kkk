package edu.zut.cs.score.finalscore.service;

import java.util.List;

import edu.zut.cs.score.finalscore.domain.Student;
import edu.zut.cs.score.base.service.GenericManager;

public interface StudentManager extends GenericManager<Student, Long>{

	List<Student> findAll();

	Student findbyStudentname(String studentname);
}
