/**
 * 
 */
package com.misco.server.liststata;

import java.util.LinkedList;

/**
 * @author liuwei
 *
 */
public class ListStatc {

	/**
	 * @param args 栈 先进后出，尾进尾出
	 */
	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>();
		li.addFirst("a");
		li.addFirst("b");
		li.addFirst("c");
		li.stream().forEach(e->System.out.println(e));
		//System.out.println("取出第一个元素c："+li.removeFirst());
		System.out.println("取出第一个元素a："+li.peek());
		li.stream().forEach(e->System.out.println(e));

	}

}
