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
	 * ·µ»Øpy vido
	 */
	public Vidio getVidio() {
		return new PyVidio();
	}
	/**
	 * ·µ»Ø±Ê¼Ç
	 */
	public Article getArile() {
		return new PyArticle();
	}
}
