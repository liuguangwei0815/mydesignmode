/**
 * 
 */
package com.misco.server.single;

/**
 * @author liuwei 懒汉模式 1、私有构造， 线程不安全，懒加载
 */
public class LazySingle {
	private static LazySingle instance = null;

	// 私有化
	public LazySingle() {
		if(instance!=null) {
			throw new RuntimeException("禁止通过反射实例化单例");
		}
	}

	// 获取对象
	public synchronized static LazySingle getInstance() {
		/*
		 * 这里是线程不安全的，第一次线程建立到了 instance = new LazySingle(); 这时候第一个线程还未完成这句，这时候第二个线程过来了
		 * 判断instance == null 那么这时候肯定是为空的那么 就会返回两次新建立的instance 对象
		 */
		if (instance == null) {
			instance = new LazySingle();
		}
		return instance;
	}
}
