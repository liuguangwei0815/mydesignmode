/**
 * 
 */
package com.misco.server.observer;

import java.util.Observable;

/**
 * @author liuwei 课程 - 被观察者
 */
public class Course extends Observable {

	private String courseName;
	

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	// 他可以生产问题
	public void prdque(Question question) {
		System.out.println(question.getUsernName() + "在" + this.courseName + "提问了：" + question.getQcontent());
		// 设置发生了改变
		setChanged();
		// 通知观察者 ，可以穿参或者不可以
		notifyObservers(question);
	}
}
