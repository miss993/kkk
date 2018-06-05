package edu.zut.cs.score.finalhomework.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.score.base.domain.BaseEntity;

@Entity
@Table(name = "T_FINALHOMEWORK")
public class Homework extends BaseEntity{
	private static final long serialVersionUID = 4475744750767977852L;
	
	

	@Column
	String name;

	@Column
	Sex sex;

	@Column
	String code;

	@Column
	String grade;

	@Column
	String address;
	@Column
	String major;
	

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
}
