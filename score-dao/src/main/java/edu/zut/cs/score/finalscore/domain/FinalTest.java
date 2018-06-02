package edu.zut.cs.score.finalscore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.score.base.domain.BaseEntity;


@Entity
@Table(name = "T_FINALSCORE")
public class FinalTest extends BaseEntity{
	
	private static final long serialVersionUID = 4475744750767977852L;

	@Column
	String sname;

	@Column
	String sno;

	@Column
	String sscore;
	
	public String getSname() {
		return sname;
	}

	public String getSno() {
		return sno;
	}

	public String getSscore() {
		return sscore;
	}

	
	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public void setSscore(String sscore) {
		this.sscore = sscore;
	}
}
