package com.example.Mortage.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loanOffer")
public class LoanOffer {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private double loanAmount;
	private double tenure;
	private double rateOfInt;
	private double emi;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getTenure() {
		return tenure;
	}
	public void setTenure(double tenure) {
		this.tenure = tenure;
	}
	public double getRateOfInt() {
		return rateOfInt;
	}
	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	
	
}