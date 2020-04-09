package com.misco.server.proxy.dymipoxy;
/**
 * 订单类型
 * @author liuwei
 *
 */
public class Order {
	//订单信息
	private Object orderInfo;
	//用户
	private Integer userId;
	public Object getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(Object orderInfo) {
		this.orderInfo = orderInfo;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
