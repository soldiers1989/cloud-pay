package com.cloud.pay.merchant.mapper;

import org.apache.ibatis.annotations.Param;

import com.cloud.pay.merchant.entity.MerchantApplyBankInfo;

public interface MerchantApplyBankInfoMapper {
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_merchant_apply_bank_info
     *
     * @mbggenerated Sun Sep 02 09:06:42 CST 2018
     */
    int insert(MerchantApplyBankInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_merchant_apply_bank_info
     *
     * @mbggenerated Sun Sep 02 09:06:42 CST 2018
     */
    int insertSelective(MerchantApplyBankInfo record);

    MerchantApplyBankInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantApplyBankInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_merchant_apply_bank_info
     *
     * @mbggenerated Sun Sep 02 09:06:42 CST 2018
     */
    int updateByPrimaryKey(MerchantApplyBankInfo record);
    
    MerchantApplyBankInfo selectByMerchantId(@Param("merchantId")Integer merchantId);
}