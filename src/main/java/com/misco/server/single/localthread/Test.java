/**
 * 
 */
package com.misco.server.single.localthread;

/**
 * @author liuwei
 * 测试TreadLoal
 */
public class Test {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadLoaclThread());
		Thread t2 = new Thread(new ThreadLoaclThread());
		//t1和t2他们获取的对象不是单例的
		t1.start();
		t2.start();
		//Main 也是主线程 ，在一个线程时候唯一的
		System.out.println(Thread.currentThread().getName()+":1获取单例"+LoaclThreadTest.getInstance());
		System.out.println(Thread.currentThread().getName()+":2获取单例"+LoaclThreadTest.getInstance());
		
		
	}
	

}
