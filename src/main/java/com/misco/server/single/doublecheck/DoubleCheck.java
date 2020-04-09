/**
 * 
 */
package com.misco.server.single.doublecheck;

/**
 * @author liuwei 双重检测
 */
public class DoubleCheck {
	//为了防止重排序volatile
	private volatile static DoubleCheck doubleCheck = null;

	public DoubleCheck() {
	}

	// 获取对象
	public DoubleCheck getInstance() {
		// 第一次判断不要加锁，性能上的提升 ,这里会判断有问题的，重排序 这里会判断有问题的
		if (doubleCheck == null) {
			// 里面进行加锁 保证只有一个线程进来 ,类锁
			synchronized (DoubleCheck.class) {
				// 再次判断
				if (doubleCheck == null) {
					doubleCheck = new DoubleCheck();
				}
			}
		}
		return doubleCheck;
	}
}
