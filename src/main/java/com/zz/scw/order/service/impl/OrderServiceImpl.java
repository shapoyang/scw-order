package com.zz.scw.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zz.scw.order.bean.TOrder;
import com.zz.scw.order.bean.TOrderExample;
import com.zz.scw.order.mapper.TOrderMapper;
import com.zz.scw.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	TOrderMapper orderMapper;
	
	@Override
	public void createOrder(TOrder order) {
		TOrderExample example=new TOrderExample();
		example.createCriteria().andOrdernumEqualTo(order.getOrdernum());
		long countByOrderNum = orderMapper.countByExample(example);
		if(countByOrderNum>0) {
			throw new RuntimeException("订单重复创建");
		}
		
		orderMapper.insertSelective(order);
	}

	@Override
	public void updateOrderStatus(String ordernum, String status) {
		TOrder order = new TOrder();
		order.setStatus(status);
		TOrderExample example=new TOrderExample();
		example.setOrderByClause(ordernum);
		orderMapper.updateByExampleSelective(order, example);
	}

}
