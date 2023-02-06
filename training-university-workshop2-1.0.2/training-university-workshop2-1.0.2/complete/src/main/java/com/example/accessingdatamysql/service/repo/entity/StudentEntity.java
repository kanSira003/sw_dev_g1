package com.example.accessingdatamysql.service.repo.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="STUDENTS") // This tells Hibernate to make a table out of this class
public class StudentEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID", updatable=false)	
	private Integer id;

	@Column(name="NAME")
	private String name;

	@Column(name="EMAIL")
	private String email;

	@Column(name="STATE")
	private Integer state;

	@Column(name="CREATED")
	private Timestamp created;

	@Column(name="CREDIT")
	private Integer credit;





	public StudentEntity() {
	}
	
	public StudentEntity(Integer id, String name, Integer state) {
		this.id = id;
		this.name = name;
		this.state = state;
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Timestamp getCreated() {
		return created;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}


}
