package com.pal.springcloud.dao;

import com.pal.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {
//    下订单
    void create(Order order);
//    修改订单
    void update(@Param("userId") Long uderId,@Param("status") Integer status);
}
