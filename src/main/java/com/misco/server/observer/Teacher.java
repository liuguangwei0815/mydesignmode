/**
 * 
 */
package com.misco.server.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liuwei 他监听课程，不是监听问题
 */
public class Teacher implements Observer{
	private String teacherName;

	public Teacher(String teacherName) {
		super();
		this.teacherName = teacherName;
	}
	@Override
	public void update(Observable observable, Object arg) {
		Course course = (Course) observable;
		Question q = (Question) arg;
		System.out.println(teacherName+"收到了"+course.getCourseName()+"的："+q.getUsernName()+q.getQcontent());
	}
}
