/**
 * 
 */
package com.misco.server.abstractfactroy;

/**
 * @author liuwei
 * 这里使用interface 和 abstract 都可以
 * 抽象工厂类(课程)
 */
public interface CourseFactory {
	//获取视频
	Vidio getVidio();
	//获取笔记
	Article getArile();
}
