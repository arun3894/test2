package com.jpa.sts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bharatcity")
public class User {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
private int id;
private String name;
private String status;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String name, String status) {
	super();
	this.id = id;
	this.name = name;
	this.status = status;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", status=" + status + "]";
}

}
