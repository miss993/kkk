package edu.zut.cs.score.assignments.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.assignments.domain.Assignments;
import edu.zut.cs.score.base.service.GenericManagerTestCase;
/**
 * 
 * @author zhoutong
 *
 */
public class AssignmentsManagerTest extends GenericManagerTestCase<Long,Assignments,AssignmentsManager>{
	
	AssignmentsManager assignmentsManager;
	
	public AssignmentsManagerTest() {
		super(Assignments.class);
	}
	@Autowired
	public void setAssignmentsManager(AssignmentsManager assignmentsManager) {
		this.assignmentsManager = assignmentsManager;
		this.manager = this.assignmentsManager;
	}
	@Before
	public void setUp() throws Exception{
		Assignments assignments = new Assignments();
		assignments.setName("周周");
		assignments.setStuid("201508030300");
		assignments.setScore1("99");
		assignments.setScore2("98");
		assignments.setScore3("97");
		assignments.setScore4("96");
		assignments.setScore5("95");
		this.entity = this.manager.save(assignments);
	}
	@Test
	public void testFindByname() {
		List<Assignments> result = this.assignmentsManager.findByname("周");
		assertNotNull(result);
		assertEquals(1,result.size());
		assertEquals("周周",result.get(0).getName());
	}

	@Test
	public void testFindBystuid() {
		String stuid = this.entity.getStuid();
		List<Assignments> result = this.assignmentsManager.findBystuid(stuid);
		assertEquals(stuid,result.get(0).getStuid());
	}

}
