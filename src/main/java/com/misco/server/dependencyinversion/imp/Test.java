package com.misco.server.dependencyinversion.imp;

/**
 * �����Ϊ�߼�Ӧ�ò㣬�������ֱ��ʹ��ʵ���� ��ô�����������ʵ������ 
 * ����ʵ������
 * 
 * @author liuwei
 */
public class Test {
	public static void main(String[] args) {

		PepelLearnIMpl m = new PepelLearnIMpl();
		System.out.println(m.learnJava());
		System.out.println(m.learnPy());
		// ����������Ҫѧϰ�ܶ�γ� ���Ҳ���ʱ�䣬��ô���Ƕ�Ҫ�޸����ǵ�ʵ������ܸ��ṩ�����ǵĸ߼�Ӧ�ø�ʵ��
	}
}
