package com.example.selfintroapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.selfintroapp.domain.Appdata;


@Mapper
public interface SelfintroAppMapper {

	/**
	*	アプリデータリストを全検索する。
	*	@return アプリデータリスト
	*/
	List<Appdata>findAll();
	/**
	 * 
	 * 	アプリデータを一部検索する。
	 * 	@return
	 */
	Appdata findOne(int id);
	
	void update(Appdata appdata);
	
	void delete(Integer id);
	
	void save(Appdata appdata);
	
	
}
