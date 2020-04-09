package com.misco.server.proxy.dymipoxy;

public class OrderServerImpl implements IorderService{
	IoderDao dao = new OrderDaoImpl();
	@Override
	public void saveOrder(Order order) {
		dao.insert(order);
	}
}
