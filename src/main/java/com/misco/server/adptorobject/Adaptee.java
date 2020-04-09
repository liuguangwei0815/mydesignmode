/**
 * 
 */
package com.misco.server.adptorobject;

/**
 * @author liuwei
 * 被适配者
 */
public class Adaptee {
	//此方法需要被适配
	public void needAdaptRequest() {
		System.out.println("需要被适配代码");
	}
}
