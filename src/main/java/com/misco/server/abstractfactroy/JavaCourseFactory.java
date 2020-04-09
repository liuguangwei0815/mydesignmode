/**
 * 
 */
package com.misco.server.abstractfactroy;

/**
 * @author liuwei
 * java 类族的产品 这里只有java的产品 不会有其他产品 ，这个工程只生产java ，有子类来实现实现工程，关键字 类族
 */
public class JavaCourseFactory implements CourseFactory {

	//返回java的视频
	public Vidio getVidio() {
		return new JavaVidio();
	}
	//返回java的笔记
	public Article getArile() {
		return new JavaArticle();
	}
}
