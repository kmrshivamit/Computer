package com.shivam.codingchellenge.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Computer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String brand;
	@JsonIgnore
	@OneToOne(mappedBy = "computer", cascade=CascadeType.ALL)
	CPU cPU;
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computer(long id, String brand, CPU cPU) {
		super();
		this.id = id;
		this.brand = brand;
		this.cPU = cPU;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public CPU getcPU() {
		return cPU;
	}
	public void setcPU(CPU cPU) {
		this.cPU = cPU;
	}
	@Override
	public String toString() {
		return "Computer [id=" + id + ", brand=" + brand + ", cPU=" + cPU + "]";
	}
	
	
	
	
	

}
