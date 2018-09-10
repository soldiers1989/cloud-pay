package com.cloud.pay.trade.mapper;

import java.util.List;

import com.cloud.pay.trade.dto.TradeDTO;
import com.cloud.pay.trade.entity.Trade;

public interface TradeMapper {
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_trade
     *
     * @mbggenerated Sun Sep 09 10:52:02 CST 2018
     */
    int insert(Trade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_trade
     *
     * @mbggenerated Sun Sep 09 10:52:02 CST 2018
     */
    int insertSelective(Trade record);

    Trade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
    
    /**
     * 查询出交易订单存在但是渠道不存在的记录
     * @param reconDate
     * @return
     */
    List<TradeDTO> selectLongRecord(String reconDate);
    
    /**
     * 查询交易表和渠道订单号相同但其他要素不相等的记录
     * @param reconDate
     * @return
     */
    List<TradeDTO> selectExceptionRecord(String reconDate);
}