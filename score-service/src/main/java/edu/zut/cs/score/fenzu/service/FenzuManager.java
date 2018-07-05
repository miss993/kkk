package edu.zut.cs.score.fenzu.service;

import java.util.List;
import edu.zut.cs.score.fenzu.domain.Fenzu;
import edu.zut.cs.score.base.service.GenericManager;

/**
 * 接口FenzuManager继承了基础GenericManager
 * 
 * @author panshaoqian
 */

public interface FenzuManager extends GenericManager<Fenzu, Long> {
	/**
	 * get student list by given name
	 * 
	 * @param name
	 * @return
	 */
	List<Fenzu> findByname(String name);

	/**
	 * get student list by given studentno
	 * 
	 * @param studentno
	 * @return
	 */
	List<Fenzu> findByStudentno(String studentno);

}
