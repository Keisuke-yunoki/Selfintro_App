package com.example.selfintroapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.selfintroapp.domain.Appdata;
import com.example.selfintroapp.service.SelfintroAppService;

@Controller
@RequestMapping("/appdatas")
public class SelfintroAppController {
	
	@Autowired
	SelfintroAppService service;
	
	
	
	@GetMapping
	public String index(Model model) {

// 一覧画面表示！！Service→Controllerへ
		model.addAttribute("appdatas", service.findAll());		
		// list.htmlの表示
		return "appdatas/index";		
	}
	
	// 編集画面の表示 
	@GetMapping("edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		
		//Service→Controllerへ
		model.addAttribute("appdata", service.findOne(id));
		// edit.htmlの表示
		return "appdatas/edit";
	}
	
	// 更新
	@PutMapping("{id}")
	public String update(@PathVariable Integer id, @ModelAttribute Appdata appdata) {
		appdata.setId(id);
		service.update(appdata);
		return "redirect:/appdatas";
		
	}
	@DeleteMapping("{id}")
	public String destroy(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/appdatas";
		
	}
}
