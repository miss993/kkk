package edu.zut.cs.score.finalscore.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.base.service.GenericManagerTestCase;
import edu.zut.cs.score.finalscore.domain.Student;
import edu.zut.cs.score.finalscore.service.StudentManager;

public class StudentManagerTest extends GenericManagerTestCase<Long, Student, StudentManager> {

	StudentManager studentManager;

	public StudentManagerTest() {
		super(Student.class);
	}

	@Autowired
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
		this.manager = this.studentManager;
	}

	@Before
	public void setUp() throws Exception {
		Student student = new Student();
		student.setStudentname("张三");
		student.setStudentno("2222222");
		student.setFinalscore("99");
		this.entity = this.manager.save(student);
	}

	@Test
	public void testFindByFullname() {
		List<Student> result = this.studentManager.findbyStudentname("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getStudentname());
	}

	@Test
	public void testFindByPostcode() {
		String postcode = this.entity.getStudentno();
		List<Student> result = this.studentManager.findbyStudentno("2222222");
		assertEquals(postcode, result.get(0).getStudentno());

	}

}
