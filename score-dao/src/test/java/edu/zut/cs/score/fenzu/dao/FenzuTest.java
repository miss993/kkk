package edu.zut.cs.score.fenzu.dao;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.score.fenzu.domain.Fenzu;
import edu.zut.cs.score.finalscore.dao.StudentDao;
import edu.zut.cs.score.finalscore.domain.Student;
import edu.zut.cs.score.base.dao.GenericDaoTestCase;
import edu.zut.cs.score.fenzu.dao.FenzuDao;
public class FenzuTest extends GenericDaoTestCase <Long,Fenzu,FenzuDao> {
	@Autowired
	StudentDao studentDao;

	@Test
	public void testFindAll() {

		List<Student> result = this.studentDao.findAll();
		if (logger.isInfoEnabled()) {
            logger.info("testFindAll() - List<Student> result={}", result); //$NON-NLS-1$
        }

    }
	

}