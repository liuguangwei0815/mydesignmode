/**
 * 
 */
package com.misco.server.single.localthread;

/**
 * @author liuwei
 *
 */
public class ThreadLoaclThread implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":获取单例"+LoaclThreadTest.getInstance());
	}
}
