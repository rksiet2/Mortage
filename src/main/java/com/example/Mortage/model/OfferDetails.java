package com.example.Mortage.Model;

import java.util.List;

public class OfferDetails {
	private String pincode;
	private double prizePerSqft;
	private double totalPrize;
	private String msg;
	private List<LoanOffer> eligibleOffers;
	
	
	public List<LoanOffer> getEligibleOffers() {
		return eligibleOffers;
	}
	public void setEligibleOffers(List<LoanOffer> eligibleOffers) {
		this.eligibleOffers = eligibleOffers;
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
	public double getTotalPrize() {
		return totalPrize;
	}
	public void setTotalPrize(double totalPrize) {
		this.totalPrize = totalPrize;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	


}