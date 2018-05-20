package edu.zut.cs.score.finalhomework.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.score.base.service.GenericManagerTestCase;
import edu.zut.cs.score.finalhomework.domain.Student;

public class StudentManagerTest extends GenericManagerTestCase<Long, Student, StudentManager>{

	public StudentManagerTest() {
		super(Student.class);
	}
	@Autowired
	StudentManager	studentManager;
	
	@Test
	public void testFindByPostcode() {
		String postcode = "NR74DU";
		List<Student> result = this.studentManager.findByPostcode(postcode);
		List<Student> expected = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student s = new Student();
			expected.add(s);
		}
		assertEquals(expected.size(), result.size());
	}
}
