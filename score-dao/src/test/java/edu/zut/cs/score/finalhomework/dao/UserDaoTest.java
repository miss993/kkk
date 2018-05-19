package edu.zut.cs.score.finalhomework.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.base.dao.GenericDaoTestCase;
import edu.zut.cs.score.finalhomework.domain.User;

public class UserDaoTest extends GenericDaoTestCase<Long,User,UserDao> {
	/**
	 * Logger for this class
	 */
	private static final Logger logger =LogManager.getLogger(UserDaoTest.class.getName());
	@Autowired
	UserDao studentdao;
	
	@Test
	public void testFindAll() {
		List<User> result=this.studentdao.findAll();
		if(logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Student> result={}", result); //$NON-NLS-1$
			}
		}
}
