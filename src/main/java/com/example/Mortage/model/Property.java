package com.example.Mortage.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="property")
public class Property {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="prize_per_sqft")
	private double prizePerSqft;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public double getPrizePerSqft() {
		return prizePerSqft;
	}

	public void setPrizePerSqft(double prizePerSqft) {
		this.prizePerSqft = prizePerSqft;
	}
		

	
}