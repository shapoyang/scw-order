package com.zz.scw.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zz.common.bean.AppResponse;
import com.zz.scw.order.bean.TOrder;
import com.zz.scw.order.service.OrderService;

@RequestMapping("/order")
@RestController
public class OrderController {
	@Autowired
	OrderService orderService;
	
	//更新订单状态
	@GetMapping("/updateOrderStatus")
	public AppResponse<Object> updateOrderStatus(@RequestParam("ordernum") String ordernum,@RequestParam("status") String status){
		orderService.updateOrderStatus(ordernum,status);
		return AppResponse.ok("更新成功");
	}
	
	//创建订单
	@PostMapping("/createOrder")
	public AppResponse<Object> createOrder(@RequestBody TOrder order){
		
		 try {
			orderService.createOrder(order);
		} catch (Exception e) {
			e.printStackTrace();
			return AppResponse.fail("30001", e.getMessage());
		}
		 
		 return AppResponse.ok("订单创建成功");
	}
}
