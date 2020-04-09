package com.misco.server.proxy.dymipoxy;

public class OrderDaoImpl implements IoderDao{
	@Override
	public int insert(Order order) {
		System.out.println("Dao 添加order 成功");
		return 1;
	}
}
