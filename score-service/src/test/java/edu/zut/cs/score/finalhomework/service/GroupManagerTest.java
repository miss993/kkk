package edu.zut.cs.score.finalhomework.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.base.service.GenericManagerTestCase;
import edu.zut.cs.score.finalhomework.domain.Group;

public class GroupManagerTest extends GenericManagerTestCase<Long, Group, GroupManager> {

	public GroupManagerTest() {
		super(Group.class);
	}

	GroupManager groupManager;
	
	@Autowired
	public void setGroupManager(GroupManager groupManager) {
		this.groupManager=groupManager;
		this.manager=this.groupManager;
	}
	
}
