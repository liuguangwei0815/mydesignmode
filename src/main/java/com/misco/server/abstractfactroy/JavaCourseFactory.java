/**
 * 
 */
package com.misco.server.abstractfactroy;

/**
 * @author liuwei
 * java ����Ĳ�Ʒ ����ֻ��java�Ĳ�Ʒ ������������Ʒ ���������ֻ����java ����������ʵ��ʵ�ֹ��̣��ؼ��� ����
 */
public class JavaCourseFactory implements CourseFactory {

	//����java����Ƶ
	public Vidio getVidio() {
		return new JavaVidio();
	}
	//����java�ıʼ�
	public Article getArile() {
		return new JavaArticle();
	}
}
