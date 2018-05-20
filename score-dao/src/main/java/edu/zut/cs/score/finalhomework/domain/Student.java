package edu.zut.cs.score.finalhomework.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.score.base.domain.BaseEntity;


@Table(name = "T_STUDENT")
@Entity
public class Student extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6172780675713487492L;

	@Column(name = "ADDRESS")
	String address;

	@Column(name = "POSTCODE")
	String postcode;

	public String getAddress() {
		return address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
}
