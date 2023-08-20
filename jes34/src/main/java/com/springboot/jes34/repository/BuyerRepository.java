package com.springboot.jes34.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jes34.dto.BuyerDto;


@Repository 
public interface BuyerRepository extends JpaRepository<BuyerDto, Integer>{

}
