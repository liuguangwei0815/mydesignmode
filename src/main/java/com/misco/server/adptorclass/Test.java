/**
 * 
 */
package com.misco.server.adptorclass;

/**
 * @author liuwei
 *
 */
public class Test {
	public static void main(String[] args) {
		//Adatptor 通过继承获取父类的代码 转化了 ITarget 接口，换句话说 Adatptor 拥有了被适配者的代码，这是类适配器
		ITarget i = new Adatptor();
		i.request();
	}

}
