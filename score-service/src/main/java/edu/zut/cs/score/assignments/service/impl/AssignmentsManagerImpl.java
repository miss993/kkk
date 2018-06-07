package edu.zut.cs.score.assignments.service.impl;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.score.assignments.domain.Assigenments;
import edu.zut.cs.score.assignments.service.AssignmentsManager;
import edu.zut.cs.score.base.service.impl.GenericManagerImpl;

/**
 * 
 * @author zhoutong
 *
 */
@Component
public class AssignmentsManagerImpl extends GenericManagerImpl<Assigenments,Long> implements AssignmentsManager {

	@Override
	public List<Assigenments> findByname(String name) {
		// TODO Auto-generated method stub
		Assigenments queryObject=new Assigenments();
		queryObject.setName(name);
		ExampleMatcher matcher=ExampleMatcher.matching().withMatcher("name",GenericPropertyMatchers.startsWith()).withIgnorePaths("dateCreated","dateModified");
		Example<Assigenments> ex=Example.of(queryObject,matcher);
		List<Assigenments> result=dao.findAll(ex);
		return result;
	}

	@Override
	public List<Assigenments> findBystuid(String stuid) {
		// TODO Auto-generated method stub
		Assigenments queryObject=new Assigenments();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setStuid(stuid);
		ExampleMatcher matcher=ExampleMatcher.matching().withStringMatcher(StringMatcher.CONTAINING).withIgnoreCase(true).withMatcher(stuid, GenericPropertyMatchers.startsWith());
		Example<Assigenments> ex=Example.of(queryObject,matcher);
		List<Assigenments> result=dao.findAll(ex);
		return result;
	}

}
