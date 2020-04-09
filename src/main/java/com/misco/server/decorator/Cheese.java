/**
 * 
 */
package com.misco.server.decorator;

/**
 * @author liuwei
 *
 */
public class Cheese extends ComdimentDecorator {
	public Cheese(Beverage drink) {
		super(drink);
	}
	public String desc() {
		return "֥ʿ"+drink.desc();
	}
	public double price() {
		return 3+drink.price();
	}
}
