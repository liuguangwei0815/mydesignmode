/**
 * 
 */
package com.misco.server.abstractfactroy;

import com.misco.server.dependencyinversion.inter.JavaSouce;

/**
 * @author liuwei
 * 需求，慕课网不单单要求要java视频 、py视频还要java笔记、py 笔记 ，使用抽象工厂方法来实现
 */
public class Test {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//声明java的工程，只会拿到java类族的
		JavaCourseFactory java  = new JavaCourseFactory();
		java.getVidio().product();
		java.getArile().product();
		//只会拿到py的族类
		PyCourseFactroy py = new PyCourseFactroy();
		py.getVidio().product();
		py.getArile().product();
	}

}
