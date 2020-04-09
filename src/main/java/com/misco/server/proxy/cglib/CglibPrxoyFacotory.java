/**
 * 
 */
package com.misco.server.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author liuwei
 */
public class CglibPrxoyFacotory implements MethodInterceptor{

	Object target;

	public Object getInstanc(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		defore();
		Object o = method.invoke(target, args);
		after();
		return o;
	}
	
	public void defore(){System.out.println("before");}
	
	public void after(){System.out.println("after");}
	

}
