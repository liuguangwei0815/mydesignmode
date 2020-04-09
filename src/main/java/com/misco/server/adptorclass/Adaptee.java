/**
 * 
 */
package com.misco.server.adptorclass;

/**
 * @author liuwei 这个类的方法新的接口Itarge 无法被使用，需要是适配 ，被适配者
 */
public class Adaptee {
	//此方法需要被适配
	public void needAdaptRequest() {
		System.out.println("需要被适配代码");
	}
}
