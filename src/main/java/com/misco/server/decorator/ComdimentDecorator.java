package com.misco.server.decorator;

/**
 * �����Բ��ã�����ֻ�ǰѽ��������ߵ�����
 * @author liuwei
 *
 */
public abstract class ComdimentDecorator implements Beverage{
	//���뱻װ���ߵ����� ͬʱ����protected ֻ���������ܹ�����
	protected Beverage drink;
	//����������Ҫ�������ߵ�����
	public ComdimentDecorator(Beverage drink) {
		super();
		this.drink = drink;
	}
}
