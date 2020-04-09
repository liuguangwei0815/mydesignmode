/**
 * 
 */
package com.misco.server.stratege;

/**
 * @author liuwei 空活动策略
 */
public class NonStrategy implements Istrategy{

	@Override
	public void doStrategy() {
		System.err.println("没有活动。。。");
	}
  
}
