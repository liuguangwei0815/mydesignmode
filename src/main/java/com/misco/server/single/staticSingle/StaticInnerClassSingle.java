/**
 * 
 */
package com.misco.server.single.staticSingle;

/**
 * @author liuwei 静态内部类方法
 */
public class StaticInnerClassSingle {
	public StaticInnerClassSingle() {
	}
	// 这个内部类一定要私有，权限要控制好
	private static class InnerClass {
		private static StaticInnerClassSingle instance = new StaticInnerClassSingle();
	}
	public static StaticInnerClassSingle getInstance() {
		return InnerClass.instance;
	}
}
