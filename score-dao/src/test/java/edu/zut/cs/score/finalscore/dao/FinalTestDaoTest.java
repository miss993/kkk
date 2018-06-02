package edu.zut.cs.score.finalscore.dao;

import edu.zut.cs.score.finalscore.domain.FinalTest;
import edu.zut.cs.score.base.dao.GenericDaoTestCase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class FinalTestDaoTest extends GenericDaoTestCase<Long, FinalTest, FinalTestDao>{

	
	private static final Logger logger = LogManager.getLogger(FinalTestDaoTest.class.getName());

	@Autowired
	FinalTestDao finaltestDao;

	@Test
	public void testFindAll() {

		List<FinalTest> result = this.finaltestDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<User> result={}", result); //$NON-NLS-1$
		}

	}

}
