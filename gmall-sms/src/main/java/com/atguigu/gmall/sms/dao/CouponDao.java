package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author baixin
 * @email 230326401@qq.com
 * @date 2020-02-23 13:41:52
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
