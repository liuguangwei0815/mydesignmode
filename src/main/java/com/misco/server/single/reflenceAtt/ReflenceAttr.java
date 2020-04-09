/**
 * 
 */
package com.misco.server.single.reflenceAtt;

import java.lang.reflect.InvocationTargetException;

import com.misco.server.single.LazySingle;

/**
 * @author liuwei 通过反射进行攻击
 */
public class ReflenceAttr {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

//		// 通过反射获取饿汉磨的反射对象
//		Class<?> claszz = Class.forName(HungriySIgn.class.getName());
//		// 将构造器权限给放开
//		claszz.getConstructor().setAccessible(true);
//		// 获取实例
//		HungriySIgn instance = (HungriySIgn) claszz.getConstructor().newInstance();
	//	System.out.println("获取饿汉的单例模式：" + HungriySIgn.getInstance());
	//	System.out.println("获取反射获取单例模式：" + instance);
		
		// 通过反射获取饿汉磨的反射对象
		Class<?> claszz = Class.forName(LazySingle.class.getName());
		// 将构造器权限给放开
		claszz.getConstructor().setAccessible(true);
		// 获取实例
		LazySingle instance = (LazySingle) claszz.getConstructor().newInstance();
		//我们获取懒加载的
		System.out.println("获取饿汉的单例模式：" + LazySingle.getInstance());
	
		System.out.println("获取反射获取单例模式：" + instance);
		

	}
}
