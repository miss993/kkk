package edu.zut.cs.score.finalhomework.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.base.service.GenericManagerTestCase;
import edu.zut.cs.score.finalhomework.domain.Homework;

public class HomeworkManagerTest extends GenericManagerTestCase<Long, Homework, HomeworkManager>{

	HomeworkManager homeworkManager;
	
	public HomeworkManagerTest() {
		super(Homework.class);
	}
	@Autowired
	public void setStudentManager(HomeworkManager homeworkManager) {
		this.homeworkManager = homeworkManager;
		this.manager = this.homeworkManager;
	}
	
	@Before
	public void setUp() throws Exception {
		Homework homework = new Homework();
		homework.setName("张三");
		homework.setAddress("河南省郑州市");
		homework.setCode("2015080303412");
		this.entity = this.manager.save(homework);
	}
	
	@Test
	public void testFindByName() {
		List<Homework> result = this.homeworkManager.findByName("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getName());
	}
	@Test
	public void testFindBycode() {
		String code = this.entity.getCode();
		List<Homework> result = this.homeworkManager.findByCode(code);
		assertEquals(code, result.get(0).getCode());

	}
	
}
