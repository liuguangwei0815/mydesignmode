/**
 * 
 */
package com.misco.server.stratege;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuwei 策略工厂
 */
public class StrategyFactrory {
	//工厂容器
	private static Map<String,Istrategy> factroy = new HashMap<String, Istrategy>();
	//类初始化时候将策略加载进去
	static {
		factroy.put(StrategyKey.MANJIAN, new ManjianStretegy());
		factroy.put(StrategyKey.LIJIAN, new LijianStategy());
		factroy.put(StrategyKey.FANXIAN, new FanxianStrategy());
	}
	//默认没有推销活动
	private final static NonStrategy NON_STRATEGY = new NonStrategy();
	//不想被创建实例
	private StrategyFactrory() {
	}
	//返回具体策略
	public static Istrategy getStrategyByKey(String key) {
		Istrategy bean = factroy.get(key);
		return bean==null?NON_STRATEGY:bean;
	}
	//在声明常量时候，在逻辑上分组的作用
	private interface StrategyKey{
		String MANJIAN = "MANJIAN";
		String LIJIAN = "LIJIAN";
		String FANXIAN = "FANXIAN";
	}
}
