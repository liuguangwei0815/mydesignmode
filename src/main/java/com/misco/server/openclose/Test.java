package com.misco.server.openclose;

public class Test {
	
	public static void main(String[] args) {
		ICourse ic = new JavaCourse(96, "企业到开发", 30d);
		//不能乱用 他是有锁的
		System.out.println(ic.getId()+" "+ic.getName()+" "+ic.getPrice());
	}
	

}
