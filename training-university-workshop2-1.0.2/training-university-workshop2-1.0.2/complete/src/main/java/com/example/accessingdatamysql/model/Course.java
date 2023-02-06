package com.example.accessingdatamysql.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {

	private Integer id;
	private String name;
	private Integer credit;
    private Integer seat;
    private Integer mseat;

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

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", credit=" + credit + ", seat=" + seat + ", mseat=" + mseat
                + "]";
    }
    

}
