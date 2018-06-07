package edu.zut.cs.score.assignments.service;

import java.util.List;

import edu.zut.cs.score.assignments.domain.Assignments;
import edu.zut.cs.score.base.service.GenericManager;
/**
 * 
 * @author zhoutong
 *
 */
public interface AssignmentsManager extends GenericManager<Assignments,Long>
{
	List<Assignments> findByname(String name);
	
	List<Assignments> findBystuid(String stuid);
	
	
}
