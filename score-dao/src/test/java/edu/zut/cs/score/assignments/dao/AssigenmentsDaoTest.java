package edu.zut.cs.score.assignments.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.assignments.domain.Assignments;
import edu.zut.cs.score.base.dao.GenericDaoTestCase;

public class AssigenmentsDaoTest extends GenericDaoTestCase<Long, Assignments,AssignmentsDao> {
	private static final Logger logger = LogManager.getLogger(AssignmentsDao.class.getName());

	@Autowired
	AssignmentsDao assignmentsDao;

	@Test
	public void testFindAll() {

		List<Assignments> result = this.assignmentsDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Pswork> result={}", result); //$NON-NLS-1$
		}

	}

}
