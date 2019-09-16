package com.yz.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String occupation;
	
	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(String name, String occupation) {
		this.name = name;
		this.occupation = occupation;
	}
	
	@Override
	public String toString() {
		return "User { id: " + this.id 
				+ ", name: " + this.name
				+ ",occupation: "+ this.occupation + "}";
	}
}
