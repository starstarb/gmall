package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author baixin
 * @email 230326401@qq.com
 * @date 2020-02-23 00:03:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
