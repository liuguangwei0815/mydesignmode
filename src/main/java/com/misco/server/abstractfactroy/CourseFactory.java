/**
 * 
 */
package com.misco.server.abstractfactroy;

/**
 * @author liuwei
 * ����ʹ��interface �� abstract ������
 * ���󹤳���(�γ�)
 */
public interface CourseFactory {
	//��ȡ��Ƶ
	Vidio getVidio();
	//��ȡ�ʼ�
	Article getArile();
}
