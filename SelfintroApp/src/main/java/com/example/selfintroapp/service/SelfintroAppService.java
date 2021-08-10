package com.example.selfintroapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.selfintroapp.domain.Appdata;
import com.example.selfintroapp.mapper.SelfintroAppMapper;


	

@Service
public class SelfintroAppService {
	
	@Autowired
	SelfintroAppMapper mapper;
	
	
	public List<Appdata>findAll(){
		return mapper.findAll();
	}

}
