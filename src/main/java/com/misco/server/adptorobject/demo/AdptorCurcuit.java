/**
 * 
 */
package com.misco.server.adptorobject.demo;

/**
 * @author liuwei 电源适配器
 */
public class AdptorCurcuit implements DC5{
	
	private AC220 ac220 = new AC220();

	@Override
	public void dc5() {
		//获取直流电 ，通过原来的逻辑等到结果 在经过处理得到新的结果
		int ac = ac220.ac220();
		//变压器进行转换
		int out = ac/44;
		System.out.println("得到直流电："+out);
	}
}
