package com.example.demo.biz;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Financing;
import com.example.demo.mapper.FinancingMapper;

@Service
public class FinancingBiz {


	@Autowired
	private FinancingMapper mapper;
	
	/**
	 * 融资
	 * @param pkid
	 * @return
	 */
	public Financing selectFinancingPage(BigDecimal pkid){
        return mapper.selectByPrimaryKey(pkid);
	}

}
