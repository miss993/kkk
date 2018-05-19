package edu.zut.cs.score.finalscore.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.finalscore.dao.StudentDao;
import edu.zut.cs.score.finalscore.domain.Student;
import edu.zut.cs.score.base.dao.GenericDaoTestCase;

public class StudentDaoTest extends GenericDaoTestCase<Long, Student, StudentDao>{
	@Autowired
	StudentDao studentDao;

	@Test
	public void testFindAll() {

		List<Student> result = this.studentDao.findAll();

	}

}
