package edu.zut.cs.score.finalscore.service;

import java.util.List;

import edu.zut.cs.score.base.service.GenericManager;
import edu.zut.cs.score.finalscore.domain.FinalTest;

public interface FinalTestManager extends GenericManager<FinalTest, Long>{

	
	
	List<FinalTest> findBySno(String sno);
	
	
	List<FinalTest> findBySname(String sname);
}
