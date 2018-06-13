package edu.zut.cs.score.attendance.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.score.attendance.domain.Attendance;
import edu.zut.cs.score.attendance.service.AttendanceManager;
import edu.zut.cs.score.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/attendance/attendance")
public class AttendanceController extends GenericController<Attendance, Long, AttendanceManager>{

	AttendanceManager attendanceManager;
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		System.out.println("-----------?");
		String result = "/attendance/index";
		return result;
	}
	@Autowired
	public void setAttendanceManager(AttendanceManager attendanceManager) {
		this.attendanceManager = attendanceManager;
		this.manager = this.attendanceManager;
	}
}
