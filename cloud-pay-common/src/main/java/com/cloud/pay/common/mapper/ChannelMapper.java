package com.cloud.pay.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cloud.pay.common.entity.Channel;

public interface ChannelMapper {


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    int insert(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    int insertSelective(Channel record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    Channel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    int updateByPrimaryKeySelective(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    int updateByPrimaryKey(Channel record);
    
    public List<Channel> getChannelList(@Param("channelCode")String channelCode, @Param("channelName")String channelName);
}