/**
 * 
 */
package com.misco.server.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuwei
 *  享元模式是为了少建立对象 提高性能 员工工厂 ，容器单例模式
 */
public class EmployeeFactory {
	
	private EmployeeFactory() {
	}
	//下面的get，需要你加上锁或者使用ConcurrentHashMap
	private static Map<String,Employee> map = new HashMap<String, Employee>();
	//这里是线程不安全的
	public static Employee getEmployee(String key) {
		Manager manager = (Manager) map.get(key);
		if(manager==null) {
			//其实这里要设置这个对象的属性
			//部门名称
			System.out.println("建立"+key+"部门经理,并生产报告。。。");
			manager = new Manager(key);
			//设置内容
			String content = key+"部门汇报：此次汇报。。。。。";
			manager.setContent(content);
			map.put(key, manager);
		}
		return manager;
	}
}
