/**
 * 
 */
package com.misco.server.decorator;

/**
 * @author liuwei
 *
 */
public class MainTest {

	/**
	 * @param args  
	 * 装饰者最大的作用是能动态扩展对象的功能
	 */
	public static void main(String[] args) {
		//来一份芝士火腿咖啡
		Beverage o = new Offfee();
		Beverage h = new Ham(o);
		Beverage c = new Cheese(h);
		System.out.println(c.desc()+"--"+c.price());
		//来一份双份的火腿茶
		Tea tea = new Tea();
		Ham th1 = new Ham(tea);
		Ham th2 = new Ham(th1);
		System.out.println(th2.desc()+"--"+th2.price());
		
		
		
		
		
		
		
	}

}
