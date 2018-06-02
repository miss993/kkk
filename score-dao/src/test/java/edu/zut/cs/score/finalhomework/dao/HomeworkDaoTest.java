package edu.zut.cs.score.finalhomework.dao;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.base.dao.GenericDaoTestCase;
import edu.zut.cs.score.finalhomework.domain.Homework;

public class HomeworkDaoTest extends GenericDaoTestCase<Long, Homework, HomeworkDao>{
	@Autowired
	HomeworkDao homeworkDao;
	
	@Test
	public void testFindAll() {
		
		List<Homework> r=this.homeworkDao.findAll();
		if (logger.isInfoEnabled()) {
            logger.info("testFindAll() - List<Student> result={}", r); //$NON-NLS-1$
        }
	}
}
