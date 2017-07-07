package com.example.demo.mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Results;

import com.example.demo.entity.Financing;

@Mapper
public interface FinancingMapper {
    int deleteByPrimaryKey(BigDecimal pkid);

    int insert(Financing record);

    int insertSelective(Financing record);

    Financing selectByPrimaryKey(BigDecimal pkid);
    Financing selectByPrimaryKeyForUpdate(BigDecimal pkid);

    int updateByPrimaryKeySelective(Financing record);

    int updateByPrimaryKey(Financing record);

    /**
     * 查询总数量
     * @param params
     * @return
     */
    int queryFinancingCount(@Param("map") Map<String, Object> params);
    /**
     * 申请付款融资清单列表总计
     * @param params
     * @return
     */
    Map<String, Object> queryNotPayFinancingTotal(@Param("map") Map<String, Object> params);
    /**
     * 还款清单列表总计
     * @param params
     * @return
     */
    Map<String, Object> queryRepaymentFinancingTotal(@Param("map") Map<String, Object> params);
    /**
     * 批量修改融资单
     * @param listMap
     * @return
     */
    int updateBatchFinancing(@Param("listMap") List<Map<String, Object>> listMap); 
    
    /**
     * 根据融资单code  批量修改
     * @param listMap
     * @return
     */
    int updateBatchFinancingByFinancingCode(@Param("listMap") List<Map<String, Object>> listMap); 

}