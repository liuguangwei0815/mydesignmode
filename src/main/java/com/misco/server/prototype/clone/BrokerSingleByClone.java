/**
 * 
 */
package com.misco.server.prototype.clone;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.misco.server.single.hangurysingle.HungriySIgn;

/**
 * @author liuwei
 *
 */
public class BrokerSingleByClone {

	/**
	 * @param args
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 如果不想通过clone 破坏单例 ，clone 。 反射、序列化 都可能会破坏单例
		// 让我们的单例实现cloneable接口，如果不实现 我们的通过反射实现clone 或者里面的clone方法 方法博怀但是不成立的
		HungriySIgn sIgn = HungriySIgn.getInstance();
		System.out.println("sIgn:" + sIgn);

		Method me = HungriySIgn.class.getDeclaredMethod("clone");
		me.setAccessible(true);
		HungriySIgn ch = (HungriySIgn) me.invoke(sIgn);
		
		System.out.println("ch:" + ch);

	}

}
