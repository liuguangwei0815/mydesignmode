/**
 * 
 */
package com.misco.server.single.localthread;

/**
 * @author liuwei localThread
 */
public class LoaclThreadTest {

	// 每个线程唯一进行隔离，但是对全局不是唯一
	private static ThreadLocal<LoaclThreadTest> local = new ThreadLocal<LoaclThreadTest>() {
		@Override
		protected LoaclThreadTest initialValue() {
			return new LoaclThreadTest();
		}
	};

	public static LoaclThreadTest getInstance() {
		return local.get();
	}
}
