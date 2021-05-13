package com.client.entity;

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
@Table(name = "client_tbl")
public class Client {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String sex;
    private String emotions;
    private String therapistname;
    private String cphone;
    private String appointment;

	public String getAppointment() {
		return appointment;
	}
	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmotions() {
		return emotions;
	}
	public void setEmotions(String emotions) {
		this.emotions = emotions;
	}
	public String getTherapistname() {
		return therapistname;
	}
	public void setTherapistname(String therapistname) {
		this.therapistname = therapistname;
	}

	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

}
