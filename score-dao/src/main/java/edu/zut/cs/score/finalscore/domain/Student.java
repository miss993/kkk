package edu.zut.cs.score.finalscore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.score.base.domain.BaseEntity;

@Table(name = "TheFinalScore")//我自己的表名
@Entity
public class Student extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column//姓名
	String studentname;

	@Column//学号
	String studentno;

	@Column//成绩
	String finalscore;
	

	
	public String getStudentname() {
		return studentname;
	}
	
	public String getStudentno() {
		return studentno;
	}
	
	public String getFinalscore() {
		return finalscore;
	}
	
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	
	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}


	public void setFinalscore(String finalscore) {
		this.finalscore = finalscore;
	}

}
