package edu.zut.cs.score.assignments.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.score.assignments.dao.AssignmentsDao;
import edu.zut.cs.score.assignments.domain.Assignments;
import edu.zut.cs.score.assignments.service.AssignmentsManager;
import edu.zut.cs.score.base.service.impl.GenericManagerImpl;

/**
 * 
 * @author zhoutong
 *
 */
@Component
public class AssignmentsManagerImpl extends GenericManagerImpl<Assignments,Long> implements AssignmentsManager {

	AssignmentsDao assignmentsDao;
	@Override
	public List<Assignments> findByname(String name) {
		// TODO Auto-generated method stub
		Assignments queryObject=new Assignments();
		queryObject.setName(name);
		ExampleMatcher matcher=ExampleMatcher.matching().withMatcher("name",GenericPropertyMatchers.startsWith()).withIgnorePaths("dateCreated","dateModified");
		Example<Assignments> ex=Example.of(queryObject,matcher);
		List<Assignments> result=dao.findAll(ex);
		return result;
	}

	@Override
	public List<Assignments> findBystuid(String stuid) {
		// TODO Auto-generated method stub
		Assignments queryObject=new Assignments();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setStuid(stuid);
		ExampleMatcher matcher=ExampleMatcher.matching().withStringMatcher(StringMatcher.CONTAINING).withIgnoreCase(true).withMatcher(stuid, GenericPropertyMatchers.startsWith());
		Example<Assignments> ex=Example.of(queryObject,matcher);
		List<Assignments> result=dao.findAll(ex);
		return result;
	}
	
	@Autowired
	public void setAssignmentsManager(AssignmentsDao assignmentsDao) {
		this.assignmentsDao = assignmentsDao;
		this.dao = this.assignmentsDao;
	}
	

}
