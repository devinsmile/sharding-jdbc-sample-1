package com.jd.sharding.mapper;


import java.util.List;

import com.jd.sharding.entity.Order;
import com.jd.sharding.entity.OrderExample;

public interface OrderMapper {

    int insertBatch(List<Order> orders);

    int countByExample(OrderExample example);

    int maxOrderIdByExample(OrderExample example);

    int minOrderIdByExample(OrderExample example);

    int maxUserIdByExample(OrderExample example);

    int minUserIdByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    List<Order> selectByExample(OrderExample example);

    int updateByExampleSelective(Order record,OrderExample example);

    int updateByExample(Order record,OrderExample example);
}