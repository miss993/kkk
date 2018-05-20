package edu.zut.cs.score.finalhomework.service;

import java.util.List;

import edu.zut.cs.score.base.service.GenericManager;
import edu.zut.cs.score.finalhomework.domain.User;

public interface UserManager extends GenericManager<User,Long> {
	
	List<User> findAll();
	User findbyUsername(String username);
}
