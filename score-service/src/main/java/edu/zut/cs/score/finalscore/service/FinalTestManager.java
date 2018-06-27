package edu.zut.cs.score.finalscore.service;

import java.util.List;

import edu.zut.cs.score.base.service.GenericManager;
import edu.zut.cs.score.finalscore.domain.FinalTest;
/**
 * 
 * @author wangyudong
 *
 */

public interface FinalTestManager extends GenericManager<FinalTest, Long>{

	/**
	 * get student list by given code
	 *
	 * @param sno
	 * @return
	 */
	
	List<FinalTest> findBySno(String sno);
	
	/**
	 * 
	 * @param sname
	 * @return
	 */
	List<FinalTest> findBySname(String sname);
}
