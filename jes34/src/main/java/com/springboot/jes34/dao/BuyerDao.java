package com.springboot.jes34.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.jes34.dto.BuyerDto;
import com.springboot.jes34.repository.BuyerRepository;


@Component
public class BuyerDao {
	
	
	@Autowired
	BuyerRepository buyerRepository;
	
	public String createAccount(BuyerDto buyerDto) {
		buyerRepository.save(buyerDto);
		return "account created";
	}
	
	public Optional<BuyerDto> removeAccount(int id) {
		Optional<BuyerDto> obo=buyerRepository.findById(id);
		return obo;
	}

	public void removeById(int id) {
		buyerRepository.deleteById(id);
	}
}
