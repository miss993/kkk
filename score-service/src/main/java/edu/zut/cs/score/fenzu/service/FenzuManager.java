package edu.zut.cs.score.fenzu.service;
/**
 * 接口FenzuManager继承了基础GenericManager
 * @author panshaoqian
 */

import java.util.List;
import edu.zut.cs.score.fenzu.domain.Fenzu;

import edu.zut.cs.score.base.service.GenericManager;
public interface FenzuManager extends GenericManager<Fenzu,Long> {
	
	
	

	List<Fenzu> findByname(String name);
	
	List<Fenzu> findByStudentno(String studentno);

}
