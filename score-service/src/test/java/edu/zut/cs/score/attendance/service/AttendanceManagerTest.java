package edu.zut.cs.score.attendance.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.attendance.domain.Attendance;
import edu.zut.cs.score.base.service.GenericManagerTestCase;



public class AttendanceManagerTest extends GenericManagerTestCase<Long, Attendance, AttendanceManager>{
   AttendanceManager attendanceManager;
	public AttendanceManagerTest() {
		super(Attendance.class);
		
	}
	@Autowired
	public void setAttendanceManager(AttendanceManager attendanceManager) {
		this.attendanceManager = attendanceManager;
		this.manager = this.attendanceManager;
	}
	
	@Before
	public void setUp() throws Exception {
		Attendance attendance = new Attendance();
		attendance.setName("张三");
		attendance.setCode("2015080303412");
		this.entity = this.manager.save(attendance);
	}
	
	@Test
	public void testFindByName() {
		List<Attendance> result = this.attendanceManager.findByName("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getName());
	}
	@Test
	public void testFindByCode() {
		String code = this.entity.getCode();
		List<Attendance> result = this.attendanceManager.findByCode(code);
		assertEquals(code, result.get(0).getCode());

	}
	
}
