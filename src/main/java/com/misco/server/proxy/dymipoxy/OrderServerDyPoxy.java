/**
 * 
 */
package com.misco.server.proxy.dymipoxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuwei ordrServer 这个代理
 */
public class OrderServerDyPoxy implements InvocationHandler {

	// 目标对象需要增强，怎么传进来呢，通过构造器
	private Object target;

	public OrderServerDyPoxy(Object target) {
		this.target = target;
	}

	// 写一个绑定方法，获取proxy获取代理对象的方法
	public Object bing() {
		// 获取目标类的class对象
		Class<?> clazz = target.getClass();
		// 生产一个对象
		/**
		 * ClassLoader loader, （被代理对象）目标类的classLoader Class<?>[] interfaces,
		 * （被代理对象）当前目标类的接口 InvocationHandler h ，代理的实现
		 */
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	/**
	 * proxy：几乎用不上他， method：要被增强的方法对象 args：具体的Method参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 怎么传参
		Object arg = args[0];
		beforMetod(arg);
		// 增强的方法 ..obj:目标对象，
		Object object = method.invoke(target, args);
		afterMetod();
		return object;
	}

	// 比如分库 具体分到哪里呀
	public void beforMetod(Object par) {
		System.out.println("前增强"+par);
	}

	public void afterMetod() {
		System.out.println("后增强");
	}

}
