package com.javainuse.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class DAOUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7743193847454965407L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long usrId;
	@Column
	private String username;
	@Column
	@JsonIgnore
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}