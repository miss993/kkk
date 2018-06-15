package edu.zut.cs.score.finalscore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.score.base.domain.BaseEntity;

/**
 * 
 * @author wangyudong
 *表名：T_FINALSCORE
 *属性：姓名，学号，成绩
 */
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
	
	@Column
	String skaoqin;
	
	@Column
	String spingshizuoye;
	
	public String getSname() {
		return sname;
	}

	public String getSno() {
		return sno;
	}

	public String getSscore() {
		return sscore;
	}
	
	public String getSkaoqin() {
		return skaoqin;
	}
	
	public String getSpingshizuoye() {
		return spingshizuoye;
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
	
	public void setSkaoqin(String skaoqin) {
		this.sscore = skaoqin;
	}
	
	public void setSpingshizuoye(String spingshizuoye) {
		this.spingshizuoye = spingshizuoye;
	}
}
