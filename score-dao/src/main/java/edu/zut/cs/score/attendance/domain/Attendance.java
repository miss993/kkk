package edu.zut.cs.score.attendance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.score.base.domain.BaseEntity;

@Entity
@Table(name = "T_ATTENDANCE")
public class Attendance  extends BaseEntity{
	private static final long serialVersionUID = 4475744750767977852L;

	@Column
	String name;
	
	@Column
	String code;
	@Column
	String clazz;
	@Column
	String day1;
	@Column
	String day2;
	@Column
	String day3;
	@Column
	String day4;
	@Column
	String day5;
	@Column
	String day6;
	@Column
	String day7;
	@Column
	String day8;
	@Column
	String day9;
	@Column
	String day10;
	@Column
	String ascore;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getDay1() {
		return day1;
	}
	public void setDay1(String day1) {
		this.day1 = day1;
	}
	public String getDay2() {
		return day2;
	}
	public void setDay2(String day2) {
		this.day2 = day2;
	}
	public String getDay3() {
		return day3;
	}
	public void setDay3(String day3) {
		this.day3 = day3;
	}
	public String getDay4() {
		return day4;
	}
	public void setDay4(String day4) {
		this.day4 = day4;
	}
	public String getDay5() {
		return day5;
	}
	public void setDay5(String day5) {
		this.day5 = day5;
	}
	public String getDay6() {
		return day6;
	}
	public void setDay6(String day6) {
		this.day6 = day6;
	}
	public String getDay7() {
		return day7;
	}
	public void setDay7(String day7) {
		this.day7 = day7;
	}
	public String getDay8() {
		return day8;
	}
	public void setDay8(String day8) {
		this.day8 = day8;
	}
	public String getDay9() {
		return day9;
	}
	public void setDay9(String day9) {
		this.day9 = day9;
	}
	public String getDay10() {
		return day10;
	}
	public void setDay10(String day10) {
		this.day10 = day10;
	}
	public String getAscore() {
		return ascore;
	}
	public void setAscore(String ascore) {
		this.ascore = ascore;
	}
	
	
	
	
}
