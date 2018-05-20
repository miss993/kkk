package edu.zut.cs.score.finalhomework.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import edu.zut.cs.score.base.service.impl.GenericManagerImpl;
import edu.zut.cs.score.finalhomework.domain.Student;
import edu.zut.cs.score.finalhomework.service.StudentManager;

@Component
public class StudentManagerImpl extends GenericManagerImpl<Student, Long> implements StudentManager{

	@Override
	public List<Student> findByPostcode(String postcode) {
		List<Student> result = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student u = new Student();
			result.add(u);
		}
		return result;
	}
}
