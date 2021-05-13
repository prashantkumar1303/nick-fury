package com.therapist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "therapist_tbl")
public class Therapist {

    @Id
    @GeneratedValue
    private int tid;
    private String name;
    private String sex;
    private String notes;
    private String clientname;
    private double tphone;
    private String appointment;


	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public double getTphone() {
		return tphone;
	}
	public void setTphone(double tphone) {
		this.tphone = tphone;
	}
	public String getAppointment() {
		return appointment;
	}
	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}

}
