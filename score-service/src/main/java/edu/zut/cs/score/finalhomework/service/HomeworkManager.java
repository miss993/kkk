package edu.zut.cs.score.finalhomework.service;
import java.util.List;

import edu.zut.cs.score.base.service.GenericManager;
import edu.zut.cs.score.finalhomework.domain.Homework;
/**
 * 
 * @author chaixiaoyin
 *
 */

public interface HomeworkManager extends GenericManager<Homework, Long>{

	/**
	 * get Homework list by given code
	 *
	 * @param code
	 * @return
	 */
	List<Homework> findByCode(String code);
	
	/**
	 * get Homework list by given name
	 * @param name
	 * @return
	 */
	List<Homework> findByName(String name);
	
}
