package edu.zut.cs.score.attendance.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.score.base.domain.BaseEntity;

@Table(name = "Attendance")
@Entity
public class Student extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "STUDENTNAME")
	String studentname;

	@Column(name = "STUDENTNO")
	String studentno;

	@Column(name = "ATTENDANCE")
	String attendance;
	

	

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentno() {
		return studentno;
	}

	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

}
