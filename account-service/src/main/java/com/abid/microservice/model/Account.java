package com.abid.microservice.model;

/**
 * Created by abidk on 12/24/15.
 */
public class Account {
	private String name;

	public Account(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
