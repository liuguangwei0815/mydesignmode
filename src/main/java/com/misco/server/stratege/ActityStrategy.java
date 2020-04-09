/**
 * 
 */
package com.misco.server.stratege;

/**
 * @author liuwei 促销活动包装类
 */
public class ActityStrategy {
	private Istrategy strategy;
	public ActityStrategy(Istrategy strategy) {
		this.strategy = strategy;
	}
	public void doStrategy() {
		// 交个实际策略去执行
		strategy.doStrategy();
	}
}
