package com.misco.server.openclose;

public class Test {
	
	public static void main(String[] args) {
		ICourse ic = new JavaCourse(96, "��ҵ������", 30d);
		//�������� ����������
		System.out.println(ic.getId()+" "+ic.getName()+" "+ic.getPrice());
	}
	

}
