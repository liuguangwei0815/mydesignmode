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
	 * װ���������������ܶ�̬��չ����Ĺ���
	 */
	public static void main(String[] args) {
		//��һ��֥ʿ���ȿ���
		Beverage o = new Offfee();
		Beverage h = new Ham(o);
		Beverage c = new Cheese(h);
		System.out.println(c.desc()+"--"+c.price());
		//��һ��˫�ݵĻ��Ȳ�
		Tea tea = new Tea();
		Ham th1 = new Ham(tea);
		Ham th2 = new Ham(th1);
		System.out.println(th2.desc()+"--"+th2.price());
		
		
		
		
		
		
		
	}

}
