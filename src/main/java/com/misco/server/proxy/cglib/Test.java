/**
 * 
 */
package com.misco.server.proxy.cglib;

/**
 * @author liuwei
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TargetClass tc  = (TargetClass) new CglibPrxoyFacotory().getInstanc(new TargetClass());
		tc.EnhancerMethod("我是别增强方法原始内容输出");
	}

}
