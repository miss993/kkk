package edu.zut.cs.score.finalhomework.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import edu.zut.cs.score.base.domain.BaseEntity;

@Entity
@Table(name = "T_FINALHOMEWORK")
public class Student extends BaseEntity{
	
	
	private static final long serialVersionUID = 4475744750767977852L;
	
	@Column
	String address;

	@Column
	String clazz;

	@Column
	String code;

	@Column
	String fullName;

	@Column
	Gender gender;

	@Column
	String grade;

	@Column
	String major;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
