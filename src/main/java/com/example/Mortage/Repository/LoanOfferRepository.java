package com.example.Mortage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Mortage.Model.LoanOffer;

public interface LoanOfferRepository extends JpaRepository<LoanOffer, Long> {

}