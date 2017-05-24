package com.jd.sharding.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.sharding.entity.Order;
import com.jd.sharding.entity.OrderExample;
import com.jd.sharding.mapper.OrderMapper;
import com.jd.sharding.service.OrderService;


@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

//    @Autowired
//    SingleKeyModuloTableShardingAlgorithm singleKeyModuloTableShardingAlgorithm;


    public List<Order> getAllOrder() {
        return orderMapper.selectByExample(null);
    }


//    public void addOrder(Order o) {
//        orderMapper.insertSelective(o);
//    }

//    public void addOrders(List<Order> orders) {
//        Map<String, List<Order>> map = ListUtil.getMapByKeyProperty(orders, "userId");
//        for (String userId : map.keySet()) {
//            Map<String, List<Order>> map2 = ListUtil.getMapByModKeyProperty(map.get(userId), "orderId",
//                    singleKeyModuloTableShardingAlgorithm.getTableCount());
//            for (String key : map2.keySet()) {
//                orderMapper.insertBatch(map2.get(key));
//            }
//        }
//    }

    public void updateOrders(List<Integer> userIds, String newOrderStatus) {
        Order o = new Order();
        o.setStatus(newOrderStatus);
        OrderExample example = new OrderExample();
        example.createCriteria().andUserIdIn(userIds);
        orderMapper.updateByExampleSelective(o, example);
    }

    public void deleteAll() {
        orderMapper.deleteByExample(null);
    }

    public int getCount(OrderExample example) {
        return orderMapper.countByExample(example);
    }

//    public void delete(Order order) {
//        orderMapper.delete(order);
//    }

    public void update(Order order) {
        OrderExample example = new OrderExample();
        example.createCriteria()
                .andUserIdEqualTo(order.getUserId())
                .andOrderIdEqualTo(order.getOrderId());
        orderMapper.updateByExampleSelective(order, example);
    }

    public int getMaxOrderId(OrderExample example) {
        return orderMapper.maxOrderIdByExample(example);
    }

    public int getMinOrderId(OrderExample example) {
        return orderMapper.minOrderIdByExample(example);
    }

    public int getMaxUserId(OrderExample example) {
        return orderMapper.maxUserIdByExample(example);
    }

    public int getMinUserId(OrderExample example) {
        return orderMapper.minUserIdByExample(example);
    }


	public void addOrder(Order o) {
		
		
	}


	public void addOrders(List<Order> orders) {
		
	}


	public void delete(Order order) {
		
	}
}
