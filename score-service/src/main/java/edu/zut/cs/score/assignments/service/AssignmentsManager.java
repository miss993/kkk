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
	/**
	 * 根据name查找
	 * @param name
	 * @return
	 */
	List<Assignments> findByname(String name);
	
	/**
	 * 根据stuid查找
	 * @param stuid
	 * @return
	 */
	List<Assignments> findBystuid(String stuid);
	
	
}
