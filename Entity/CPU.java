package com.shivam.codingchellenge.Entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class CPU {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="computer_id")
	Computer computer;
	String brand;
	public CPU() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CPU(long id, Computer computer) {
		super();
		this.id = id;
		this.computer = computer;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
