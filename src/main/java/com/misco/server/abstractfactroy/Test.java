/**
 * 
 */
package com.misco.server.abstractfactroy;

import com.misco.server.dependencyinversion.inter.JavaSouce;

/**
 * @author liuwei
 * ����Ľ����������Ҫ��Ҫjava��Ƶ ��py��Ƶ��Ҫjava�ʼǡ�py �ʼ� ��ʹ�ó��󹤳�������ʵ��
 */
public class Test {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����java�Ĺ��̣�ֻ���õ�java�����
		JavaCourseFactory java  = new JavaCourseFactory();
		java.getVidio().product();
		java.getArile().product();
		//ֻ���õ�py������
		PyCourseFactroy py = new PyCourseFactroy();
		py.getVidio().product();
		py.getArile().product();
	}

}
