/**
 * 
 */
package com.misco.server.dependencyinversion.inter;

/**
 * @author liuwei 面向接口编程 倒置原则
 */
public class Test {

	public static void main(String[] args) {

		// 我要学习java
		PopelLeanInter po = new PopelLeanInter();
		ISouce souce = new JavaSouce();
		System.out.println(po.lean(souce));
		// 我学习了py教程
		ISouce py = new PySouce();
		System.out.println(po.lean(py));

	}

}
