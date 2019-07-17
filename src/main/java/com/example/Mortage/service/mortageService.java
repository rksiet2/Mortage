package com.example.Mortage.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mortage.Model.LoanOffer;
import com.example.Mortage.Model.OfferDetails;
import com.example.Mortage.Model.Property;
//import com.example.Mortage.Model.Property;
import com.example.Mortage.Model.User;
import com.example.Mortage.Repository.LoanOfferRepository;
//import com.example.mortageq.repository.LoanOfferRepository;
//import com.example.mortageq.repository.PropertyRepository;
import com.example.Mortage.Repository.PropertyRepository;

@Service
public class mortageService {

	@Autowired
	PropertyRepository propertyRepository;
	
	@Autowired 
	LoanOfferRepository loanOfferRepository;
	
	public  OfferDetails searchForProperty(User user) {
		OfferDetails offerDetails = new OfferDetails();
		Property property = propertyRepository.findByPincode(user.getPincode());
		List<LoanOffer> allLoanOffers = loanOfferRepository.findAll();
		
		//prepare for offer details
		offerDetails.setPincode(property.getPincode());
		offerDetails.setPrizePerSqft(property.getPrizePerSqft());
		double totalPrize = user.getAreaSize() * property.getPrizePerSqft();
		offerDetails.setTotalPrize(totalPrize);
		List<LoanOffer> eligibleOffers = allLoanOffers.stream().filter(lo -> {
return lo.getLoanAmount() <= totalPrize*0.8;
			}).collect(Collectors.toList());
		offerDetails.setEligibleOffers(eligibleOffers);
	return offerDetails;
		
	}
}