package com.example.Mortage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Mortage.Model.Property; 

public interface PropertyRepository extends JpaRepository<Property, Long> {

	public Property findByPincode(String string);
	
}