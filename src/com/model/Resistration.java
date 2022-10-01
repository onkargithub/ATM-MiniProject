package com.model;

public class Resistration {

	
	
	private int id;
	private String name;
	private String address;
	private String Email;
	private int ammount;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	@Override
	public String toString() {
		return "Resistration [id=" + id + ", name=" + name + ", address=" + address + ", Email=" + Email + ", ammount="
				+ ammount + "]";
	}
	
}