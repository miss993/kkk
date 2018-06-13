package edu.zut.cs.score.finalhomework.dao;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.base.dao.GenericDaoTestCase;
import edu.zut.cs.score.finalhomework.domain.Homework;
/**
 * HomeworkDao的测试,继承了GenericDaoTestCase
 * @author 柴晓印
 *
 */
public class HomeworkDaoTest extends GenericDaoTestCase<Long, Homework, HomeworkDao>{
	@Autowired
	HomeworkDao homeworkDao;
	/**
	 * 测试方法
	 */
	@Test
	public void testFindAll() {
		
		List<Homework> r=this.homeworkDao.findAll();
		if (logger.isInfoEnabled()) {
            logger.info("testFindAll() - List<Student> result={}", r); //$NON-NLS-1$
        }
	}
}
