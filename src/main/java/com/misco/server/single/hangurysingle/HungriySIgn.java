/**
 * 
 */
package com.misco.server.single.hangurysingle;

import java.io.Serializable;

/**
 * @author liuwei 饿汉模式
 */
public class HungriySIgn implements Serializable,Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 可以不适用final 因为在static 在类初始化过程就被实例了，final 是必须在jvm 初始化赋值的
	private final static HungriySIgn instance = new HungriySIgn();

	public HungriySIgn() {
		if(instance!=null) {
			throw new RuntimeException("禁止通过反射实例化单例");
		}
	}

	public static HungriySIgn getInstance() {
		return instance;
	}
	public Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}
	
}
