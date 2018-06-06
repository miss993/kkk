package edu.zut.cs.score.attendance.service;

import java.util.List;

import edu.zut.cs.score.attendance.domain.Attendance;
import edu.zut.cs.score.base.service.GenericManager;


public interface AttendanceManager extends GenericManager<Attendance, Long> {
	/**
	 * get Homework list by given code
	 *
	 * @param code
	 * @return
	 */
	List<Attendance> findByCode(String code);
	
	/**
	 * get Homework list by given name
	 * @param name
	 * @return
	 */
	List<Attendance> findByName(String name);
}
