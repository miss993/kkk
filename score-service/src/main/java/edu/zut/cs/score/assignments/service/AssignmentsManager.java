package edu.zut.cs.score.assignments.service;

import java.util.List;

import edu.zut.cs.score.assignments.domain.Assigenments;
import edu.zut.cs.score.base.service.GenericManager;
/**
 * 
 * @author zhoutong
 *
 */
public interface AssignmentsManager extends GenericManager<Assigenments,Long>
{
	List<Assigenments> findByname(String name);
	
	List<Assigenments> findBystuid(String stuid);
	
	
}
