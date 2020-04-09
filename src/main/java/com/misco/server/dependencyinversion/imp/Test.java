package com.misco.server.dependencyinversion.imp;

/**
 * 这个作为高级应用层，如果这里直接使用实现类 那么这个就是面向实现类编程 
 * 面向实现类编程
 * 
 * @author liuwei
 */
public class Test {
	public static void main(String[] args) {

		PepelLearnIMpl m = new PepelLearnIMpl();
		System.out.println(m.learnJava());
		System.out.println(m.learnPy());
		// 加入我现在要学习很多课程 而且不定时间，那么我们都要修改我们的实现类才能给提供给我们的高级应用更实用
	}
}
