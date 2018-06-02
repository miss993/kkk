package edu.zut.cs.score.fenzu.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.score.base.domain.BaseEntity;

@Table(name = "Fenzumessage")//我自己的表名
@Entity
public class Fenzu extends BaseEntity {

	private static final long serialVersionUID = -4376674977047164142L;

	
	String name;//姓名

	
	String studentno;//学号

	
	String studentclass;//班级
	 
	
	String studentsex;//性别
	
	
	String studentdoing;//任务
	
	String studentzhiwu;//职务

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentno() {
		return studentno;
	}

	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}

	public String getStudentclass() {
		return studentclass;
	}

	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}

	public String getStudentsex() {
		return studentsex;
	}

	public void setStudentsex(String studentsex) {
		this.studentsex = studentsex;
	}

	public String getStudentdoing() {
		return studentdoing;
	}

	public void setStudentdoing(String studentdoing) {
		this.studentdoing = studentdoing;
	}

	public String getStudentzhiwu() {
		return studentzhiwu;
	}

	public void setStudentzhiwu(String studentzhiwu) {
		this.studentzhiwu = studentzhiwu;
	}
	 
	

	

	
}
