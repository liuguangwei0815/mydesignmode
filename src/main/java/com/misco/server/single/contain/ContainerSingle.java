package com.misco.server.single.contain;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例模式 ，管理多个单例
 * @author liuwei
 *
 */
public class ContainerSingle {
	private static Map<String,Object> singleMap = new HashMap<String, Object>();
	private ContainerSingle() {}
	//放置单例 以key为 vlaue为单例
	public static void putInstance(String key,Object obje) {
		if(null!=key&&!"".equals(key) && obje!=null) {
			//线程不安全的。所以这里可能放置多个单例对象 但是key是唯一的，获取也是唯一的，但是他们是有隐患的，因为当一个线程放了 立即去获取 另外一个线程还未放置好 会造成多个实例 ， 线程不安全，可以使用ConcurrentHashMap 
			if(!singleMap.containsKey(key)) {
				singleMap.put(key, obje);
			}
		}
	}
	public static Object getInstance(String key) {
		return singleMap.get(key);
	}
}
