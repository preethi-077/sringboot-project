package com.springboot.jes34.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jes34.dao.BuyerDao;
import com.springboot.jes34.dto.BuyerDto;
import com.springboot.jes34.service.BuyerService;


@RestController
@RequestMapping("/buyers")
public class BuyerController {
	
	@Autowired
	BuyerService buyerService;
	
	
    @PostMapping("/signin")
	public String createaccount(@RequestBody BuyerDto buyerDto) {
		System.out.println(buyerDto);
		return buyerService.createAccount(buyerDto);
		
	}
    
	@DeleteMapping("/delete")
    public String removeAccount(@RequestBody BuyerDto buyerDto) {
	  return buyerService.removeAccount(buyerDto.getId());
	}
	
    @GetMapping("/fetch")
    public void fetch() {
		
	}
    
    @PutMapping("/edit")
    public void update() {
		
	}
}
