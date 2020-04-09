/**
 * 
 */
package com.misco.server.observer;

/**
 * @author liuwei
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Course course = new Course("java 设计模式");
		Teacher teacher = new Teacher("apollo");
		
		course.addObserver(teacher);
		
		//业务逻辑
		Question question = new Question();
		question.setUsernName("geely");
		question.setQcontent("Main 函数如何使用");
		course.prdque(question);
	}
}
