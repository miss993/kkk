package edu.zut.cs.score.finalscore.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import edu.zut.cs.score.base.service.GenericManagerTestCase;
import edu.zut.cs.score.finalscore.domain.FinalTest;
import edu.zut.cs.score.finalscore.service.FinalTestManager;
/**
 * 
 * @author wangyudong
 *
 */
public class FinalTestManagerTest extends GenericManagerTestCase<Long, FinalTest, FinalTestManager>{

	
	FinalTestManager finaltestManager;

	public FinalTestManagerTest() {
		super(FinalTest.class);
	}

	@Autowired
	public void setStudentManager(FinalTestManager finaltestManager) {
		this.finaltestManager = finaltestManager;
		this.manager = this.finaltestManager;
	}

	@Before
	public void setUp() throws Exception {
		FinalTest finaltest = new FinalTest();
		finaltest.setSname("张三");
		finaltest.setSno("2222");
		finaltest.setSscore("99");
		this.entity = this.manager.save(finaltest);
	}

	@Test
	public void testFindByFullname() {
		List<FinalTest> result = this.finaltestManager.findBySname("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getSname());
	}

	@Test
	public void testFindByPostcode() {
		String postcode = this.entity.getSno();
		List<FinalTest> result = this.finaltestManager.findBySno(postcode);
		assertEquals(postcode, result.get(0).getSno());

	}

}
