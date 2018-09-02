package com.cloud.pay.merchant.mapper;

import com.cloud.pay.merchant.entity.MerchantAttachementInfo;

public interface MerchantAttachementInfoMapper {
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_merchant_attachement_info
     *
     * @mbggenerated Sun Sep 02 09:06:42 CST 2018
     */
    int insert(MerchantAttachementInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_merchant_attachement_info
     *
     * @mbggenerated Sun Sep 02 09:06:42 CST 2018
     */
    int insertSelective(MerchantAttachementInfo record);
    
    MerchantAttachementInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantAttachementInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_merchant_attachement_info
     *
     * @mbggenerated Sun Sep 02 09:06:42 CST 2018
     */
    int updateByPrimaryKey(MerchantAttachementInfo record);
}