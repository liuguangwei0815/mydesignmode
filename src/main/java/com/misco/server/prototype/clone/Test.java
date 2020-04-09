/**
 * 
 */
package com.misco.server.prototype.clone;

import java.util.Date;

/**
 * @author liuwei
 *
 */
public class Test {
	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		//如果对象没有从写对象里的属性，然后在外部进行赋值，会修改全部的
		Date d1 = new Date(0);
		Pig pig = new Pig("小猪",d1);
		Pig pig1 = (Pig) pig.clone();
		System.out.println("pig:"+pig);
		System.out.println("pig1:"+pig1);
		//将pig 的生日给修改了 
		pig.getBirthday().setTime(6666666666666666l);
		//这时候会发现pig 和 pig1 的birthday 都改变了 ,要重现必须的限不要给这些对象赋值先，如果赋值了 那么这个对象默认被clone了 就不重现这样真的锁
		System.out.println("pig:"+pig);
		System.out.println("pig1:"+pig1);
	}
}
