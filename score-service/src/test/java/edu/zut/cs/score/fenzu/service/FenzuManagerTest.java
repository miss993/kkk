package edu.zut.cs.score.fenzu.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.score.base.service.GenericManagerTestCase;
import edu.zut.cs.score.fenzu.domain.Fenzu;

public class FenzuManagerTest extends GenericManagerTestCase<Long,Fenzu,FenzuManager>{
	FenzuManager fenzuManager;
	public FenzuManagerTest() {
		super(Fenzu.class);
	}
	@Autowired
	public void setStudentManager(FenzuManager fenzuManager) {
		this.fenzuManager=fenzuManager;
		this.manager=this.fenzuManager;
	}
	@Before
	public void setUp() throws Exception {
		Fenzu fenzu=new Fenzu();
		fenzu.setName("狗子");
		fenzu.setStudentno("201508030309");
		this.entity=this.manager.save(fenzu);
		
	}
	@Test
	public void testFindByname() {
		List<Fenzu> result=this.fenzuManager.findByname("狗");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("狗子", result.get(0).getName());
	}
	@Test
	public void testFindBystudentno() {
		String studentno=this.entity.getStudentno();
		List<Fenzu> result = this.fenzuManager.findByStudentno(studentno);
		assertEquals(studentno, result.get(0).getStudentno());
	}
}