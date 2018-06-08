package edu.zut.cs.score.assignments.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.score.base.domain.BaseEntity;
/**
 * Assignments的数据库设计与操作
 * @author zhoutong
 *
 */
@Entity
@Table(name = "T_Assignments")
public class Assignments  extends BaseEntity{
	private static final long serialVersionUID = 4475744750767977852L;

	@Column
	String name;
	
	@Column
	String stuid;
	
	@Column
	String score1;

	@Column
	String score2;

	@Column
	String score3;

	@Column
	String score4;

	@Column
	String score5;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getScore1() {
		return score1;
	}

	public void setScore1(String score1) {
		this.score1 = score1;
	}

	public String getScore2() {
		return score2;
	}

	public void setScore2(String score2) {
		this.score2 = score2;
	}

	public String getScore3() {
		return score3;
	}

	public void setScore3(String score3) {
		this.score3 = score3;
	}

	public String getScore4() {
		return score4;
	}

	public void setScore4(String score4) {
		this.score4 = score4;
	}

	public String getScore5() {
		return score5;
	}

	public void setScore5(String score5) {
		this.score5 = score5;
	}
	
	
}
