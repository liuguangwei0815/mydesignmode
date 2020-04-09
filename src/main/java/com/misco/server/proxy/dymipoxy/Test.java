package com.misco.server.proxy.dymipoxy;

public class Test {
	
	public static void main(String[] args) {
		Order order = new Order();
		order.setUserId(2);
		IorderService iorder = (IorderService) new OrderServerDyPoxy(new OrderServerImpl()).bing();
		iorder.saveOrder(order);
	}
}
