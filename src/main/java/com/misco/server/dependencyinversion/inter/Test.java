/**
 * 
 */
package com.misco.server.dependencyinversion.inter;

/**
 * @author liuwei ����ӿڱ�� ����ԭ��
 */
public class Test {

	public static void main(String[] args) {

		// ��Ҫѧϰjava
		PopelLeanInter po = new PopelLeanInter();
		ISouce souce = new JavaSouce();
		System.out.println(po.lean(souce));
		// ��ѧϰ��py�̳�
		ISouce py = new PySouce();
		System.out.println(po.lean(py));

	}

}
