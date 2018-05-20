package edu.zut.cs.score.finalscore.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import edu.zut.cs.score.finalscore.domain.Student;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AdminServiceConfig.class)
public class StudentManagerTest {

	@Autowired
	StudentManager studentManager;

	@Test
	public void testFindAll() {
		List<Student> all = this.studentManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyStudentname() {
		String studentname = "world";
		Student expected_user = new Student();
		Student student = this.studentManager.findbyStudentname(studentname);
		// assertEquals(user.getStudentname(), expected_user.getStudentname());
		assertEquals(student, expected_user);
	}
}
