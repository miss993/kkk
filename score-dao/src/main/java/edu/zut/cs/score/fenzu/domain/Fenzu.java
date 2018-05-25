package edu.zut.cs.score.fenzu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.score.base.domain.BaseEntity;

@Table(name = "TheFinalScore")//我自己的表名
@Entity
public class Fenzu extends BaseEntity {

	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "STUDENTNAME")//姓名
	String studentname;

	@Column(name = "STUDENTNO")//学号
	String studentno;

	@Column(name = "FINALSCORE")//成绩
	String finalscore;
	

	

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

	public String getFinalscore() {
		return finalscore;
	}

	public void setFinalscore(String finalscore) {
		this.finalscore = finalscore;
	}

}
