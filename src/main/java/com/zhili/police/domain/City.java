package com.zhili.police.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;

public class City implements Serializable {
	@Transient
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	@Column
	private String name;
	@Column
	private String state;
	@Column
	private String country;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return getId() + "," + getName() + "," + getState() + "," + getCountry();
	}

}