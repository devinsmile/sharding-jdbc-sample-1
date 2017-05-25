package com.jd.school.live;



import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jd.sharding.entity.Order;
import com.jd.sharding.service.OrderService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class TestOrderService {

    @Autowired
    private OrderService orderService;



    @Test
    public  void test_sayHello() throws Exception {

    	System.out.println("======test_sayHello========");
    }


    @Test
    public  void insertOrder() throws Exception {

        List<Order> orderList = new ArrayList<Order>();
        try{
        	
        	int userId = 1 ;
        	
        	int orderId = 2;
        	
        	Order order = this.createOrder(orderId, userId, "0");
        	
        	orderService.addOrder(order);
        	
        	System.out.println("==========ddddddddd============");
        	
        	
        }catch(Exception e){
            System.out.println("==========xxxxxxxxxx============");
            e.printStackTrace();
        }


    }


    private Order createOrder(int orderId,int userId,String status){
       
    	Order order = new Order();
    	order.setOrderId(orderId);
    	
    	order.setUserId(userId);
    	order.setStatus(status);
    	
    	
        return order;
    }


    @Test
    public  void getAllOrder() throws Exception {

        try{
        	
        	List<Order> orderList = orderService.getAllOrder();
        	
        	
        	for(Order order:orderList){
        		System.out.println("userId:"+order.getUserId()+",orderId:"+order.getOrderId());
        	}
        	
        	
        }catch(Exception e){
            System.out.println("==========xxxxxxxxxx============");
            e.printStackTrace();
        }


    }


}
