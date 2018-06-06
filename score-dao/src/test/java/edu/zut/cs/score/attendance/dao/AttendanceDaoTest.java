package edu.zut.cs.score.attendance.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.attendance.domain.Attendance;
import edu.zut.cs.score.base.dao.GenericDaoTestCase;

public class AttendanceDaoTest extends GenericDaoTestCase<Long, Attendance, AttendanceDao> {
	@Autowired
	AttendanceDao attendanceDao;
	
	@Test
	public void testFindAll() {
		
		List<Attendance> r=this.attendanceDao.findAll();
		if (logger.isInfoEnabled()) {
            logger.info("testFindAll() - List<Attendance> result={}", r); //$NON-NLS-1$
        }
	}
}
