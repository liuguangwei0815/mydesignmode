/**
 * 
 */
package com.misco.server.adptorclass;

/**
 * @author liuwei 适配器 ， 类适配器 
 *      通过继承获取父类的方法，使用在新的接口中
 */
public class Adatptor extends Adaptee implements ITarget {
	@Override
	public String request() {
		// 执行其他逻辑。。。。。
		// 复用了类里面的代码
		super.needAdaptRequest();
		// 自行其他逻辑。。。。。
		return null;
	}

}
