/**
 * 
 */
package com.misco.server.stratege;

/**
 * @author liuwei
 *
 */
public class Test {
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// 策略模式 避免大量的if else ，如果if 里面的代码有很多 那么这个if很多'
//		// 满减活动
//		new ActityStrategy(new ManjianStretegy()).doStrategy();
//		// 满减活动
//		new ActityStrategy(new LijianStategy()).doStrategy();
//		// 返现活动
//		new ActityStrategy(new FanxianStrategy()).doStrategy();
//	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//controller 传递的是
		String key = "MANJIAN";
		StrategyFactrory.getStrategyByKey(key).doStrategy();
	}
}
