/**
 * 
 */
package com.misco.server.abstractfactroy;

/**
 * @author liuwei
 *
 */
public class PyCourseFactroy implements CourseFactory {
	/**
	 * ����py vido
	 */
	public Vidio getVidio() {
		return new PyVidio();
	}
	/**
	 * ���رʼ�
	 */
	public Article getArile() {
		return new PyArticle();
	}
}
