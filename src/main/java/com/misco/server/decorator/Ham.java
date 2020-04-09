/**
 * 
 */
package com.misco.server.decorator;

/**
 * @author liuwei
 *	����
 */
public class Ham extends ComdimentDecorator {
	public Ham(Beverage drink) {
		super(drink);
	}
	public String desc() {
		return "����"+drink.desc();
	}
	public double price() {
		return 2+drink.price();
	}
}
