package com.misco.server.decorator;

/**
 * 这层可以不用，这里只是把将被修饰者的引用
 * @author liuwei
 *
 */
public abstract class ComdimentDecorator implements Beverage{
	//引入被装饰者的引用 同时声明protected 只能有子类能够引用
	protected Beverage drink;
	//声明构造需要被修饰者的引用
	public ComdimentDecorator(Beverage drink) {
		super();
		this.drink = drink;
	}
}
