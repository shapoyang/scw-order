package com.zz.scw.order.service;

import com.zz.scw.order.bean.TOrder;

public interface OrderService {

	void createOrder(TOrder order);

	void updateOrderStatus(String ordernum, String status);

}
