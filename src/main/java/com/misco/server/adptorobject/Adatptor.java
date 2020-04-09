/**
 * 
 */
package com.misco.server.adptorobject;

import com.misco.server.adptorclass.ITarget;

/**
 * @author liuwei 适配器 ，对象适配器（通过组合）
 */
public class Adatptor implements ITarget {
	//通过组合
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public String request() {
		// 执行其他逻辑。。。。。
		// 复用了类里面的代码
		adaptee.needAdaptRequest();
		// 自行其他逻辑。。。。。
		return null;
	}
}
