package edu.zut.cs.score.assignments.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.assignments.domain.Assigenments;
import edu.zut.cs.score.base.dao.GenericDaoTestCase;

public class AssigenmentsDaoTest extends GenericDaoTestCase<Long, Assigenments,AssigenmentsDao> {
	private static final Logger logger = LogManager.getLogger(AssigenmentsDao.class.getName());

	@Autowired
	AssigenmentsDao assigenmentsDao;

	@Test
	public void testFindAll() {

		List<Assigenments> result = this.assigenmentsDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Pswork> result={}", result); //$NON-NLS-1$
		}

	}

}
