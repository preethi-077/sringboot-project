package com.springboot.jes34.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.jes34.dao.BuyerDao;
import com.springboot.jes34.dto.BuyerDto;


@Component
public class BuyerService {
	
	@Autowired
	BuyerDao buyerDao;
	
	public String createAccount(BuyerDto buyerDto) {
		return buyerDao.createAccount(buyerDto);
		
	}
	
	public String removeAccount(int id) {
		Optional<BuyerDto> obs=buyerDao.removeAccount(id);
		if(obs.isPresent()) {
			BuyerDto dto=obs.get();
			buyerDao.removeById(dto.getId());
			return "account deleted";
			}else 
				return "no data found";
	    }

}
