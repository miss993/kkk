package edu.zut.cs.score.assignments.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.assignments.domain.Pswork;
import edu.zut.cs.score.base.dao.GenericDaoTestCase;

public class PsworkDaoTest extends GenericDaoTestCase<Long, Pswork,PsworkDao> {
	private static final Logger logger = LogManager.getLogger(PsworkDao.class.getName());

	@Autowired
	PsworkDao psworkDao;

	@Test
	public void testFindAll() {

		List<Pswork> result = this.psworkDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Pswork> result={}", result); //$NON-NLS-1$
		}

	}

}
