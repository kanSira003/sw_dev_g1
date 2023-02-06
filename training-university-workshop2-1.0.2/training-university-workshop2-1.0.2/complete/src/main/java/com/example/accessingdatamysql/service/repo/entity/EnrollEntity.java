package com.example.accessingdatamysql.service.repo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="ENROLL")
public class EnrollEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID", updatable=false)	
	private Integer id;

	@Column(name="STU_ID")
	private Integer stuid;

	@Column(name="C_ID")
	private Integer cid;


	public EnrollEntity() {
	}
	
	public EnrollEntity(Integer id, Integer stuid, Integer cid) {
		this.id = id;
		this.stuid = stuid;
        this.cid = cid;
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStuid() {
		return stuid;
	}

	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}
}
