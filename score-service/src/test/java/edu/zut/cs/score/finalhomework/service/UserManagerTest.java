package edu.zut.cs.score.finalhomework.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.score.base.service.GenericManagerTestCase;
import edu.zut.cs.score.finalhomework.domain.User;

public class UserManagerTest extends GenericManagerTestCase<Long, User, UserManager>{

	public UserManagerTest() {
		super(User.class);
	}
	@Autowired
	UserManager userManager;
	
	@Test
	public void testFindAll() {
		List<User> all=this.userManager.findAll();
		assertEquals(all.size(), 100);
	}
	
	@Test
	public void testFindbyUsername() {
		String username="world";
		User expected_user=new User();
		// expected_user.setUsername(username);
		User user=this.userManager.findbyUsername(username);
		this.logger.info(user);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(user, expected_user);
	}
	
}
