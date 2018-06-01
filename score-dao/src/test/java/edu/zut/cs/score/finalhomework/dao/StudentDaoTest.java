package edu.zut.cs.score.finalhomework.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.base.dao.GenericDaoTestCase;
import edu.zut.cs.score.finalhomework.domain.Student;

public class StudentDaoTest extends GenericDaoTestCase<Long, Student, StudentDao>{
	@Autowired
	StudentDao studentDao;
	
	@Test
	public void testFindAll() {
		
		List<Student> r=this.studentDao.findAll();
		if (logger.isInfoEnabled()) {
            logger.info("testFindAll() - List<Student> result={}", r); //$NON-NLS-1$
        }
	}
}
