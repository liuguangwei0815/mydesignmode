/**
 * 
 */
package com.misco.server.single;

/**
 * @author liuwei 线程类
 */
public class SingleThead implements Runnable {
	public void run() {
		LazySingle sigle = LazySingle.getInstance();
		System.out.println(Thread.currentThread().getName()+":"+sigle);
	}
}
