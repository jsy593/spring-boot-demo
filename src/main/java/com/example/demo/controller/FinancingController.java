package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.biz.FinancingBiz;
import com.example.demo.entity.Financing;

@RestController
public class FinancingController {
	@Autowired
	private FinancingBiz biz;
	
	@GetMapping("financing/{id}")
	public Financing getFinancing(@PathVariable String id){
		System.out.println("id:"+id);
		return biz.selectFinancingPage(new BigDecimal(id));
		
	}
}
