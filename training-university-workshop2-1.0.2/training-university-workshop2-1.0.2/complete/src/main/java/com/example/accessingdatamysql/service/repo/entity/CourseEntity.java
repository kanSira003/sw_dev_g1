package com.example.accessingdatamysql.service.repo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="COURSE")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID", updatable=false)	
	private Integer id;

	@Column(name="NAME")
	private String name;

	@Column(name="CREDIT")
	private Integer credit;

	@Column(name="SEAT")
	private Integer seat;

	@Column(name="MSEAT")
	private Integer mseat;





	public CourseEntity() {
	}
	
	public CourseEntity(Integer id, String name, Integer credit, Integer mseat) {
		this.id = id;
		this.name = name;
		this.credit = credit;
        this.seat = 0;
        this.mseat = mseat;
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

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Integer getSeat() {
		return seat;
	}

	public void setSeat(Integer seat) {
		this.seat = seat;
	}

	public Integer getMseat() {
		return mseat;
	}

	public void setMseat(Integer mseat) {
		this.mseat = mseat;
	}
}
