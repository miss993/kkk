package edu.zut.cs.score.finalhomework.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.score.base.domain.BaseEntity;

/**
 * Homework实体类
 * 定义了各个列名
 * @author 柴晓印
 *
 */
@Entity
@Table(name = "T_FINALHOMEWORK")
public class Homework extends BaseEntity{
	private static final long serialVersionUID = 4475744750767977852L;
	
	
/**
 * 学生姓名
 */
	@Column
	String name;
	/**
	 * 学生性别
	 */
	@Column
	Sex sex;
	/**
	 * 学生学号
	 */
	@Column
	String code;
	/**
	 * 学生年级
	 */
	@Column
	String grade;
	/**
	 * 学生班级
	 */
	@Column
	String address;
	/**
	 * 学生专业
	 */
	@Column
	String major;
	/**
	 * 学生成绩
	 */
	@Column
	Integer mark;
	

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

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
