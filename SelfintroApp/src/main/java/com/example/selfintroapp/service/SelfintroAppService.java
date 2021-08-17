package com.example.selfintroapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.selfintroapp.domain.Appdata;
import com.example.selfintroapp.mapper.SelfintroAppMapper;


@Service
public class SelfintroAppService {
	
	@Autowired
	private SelfintroAppMapper mapper;
	
	@Transactional
	public List<Appdata>findAll(){
		return mapper.findAll();
	}

	@Transactional
	public Appdata findOne(Integer id) {
		return mapper.findOne(id);
	}
	
	@Transactional
	public void update(Appdata appdata) {
		mapper.update(appdata);
		
	}
	
	@Transactional
	public void delete(Integer id) {
		mapper.delete(id);
		
		
	}

}
