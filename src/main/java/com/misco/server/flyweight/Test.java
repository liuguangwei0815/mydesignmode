/**
 * 
 */
package com.misco.server.flyweight;

/**
 * @author liuwei
 *
 */
public class Test {
	public static void main(String[] args) {
		
//		String[] str = new String[] {"DR","CS","DB"};
//		for (int i = 0; i < 10; i++) {
//			int indx = (int) (Math.random()*str.length);
//			//工厂回去员工执行年度
//			Employee e = EmployeeFactory.getEmployee(str[indx]);
//			e.report();
//		}
		
		Integer a = Integer.valueOf(100);
		Integer b = 100;
		Integer c = Integer.valueOf(128);
		Integer d = 128;
		Integer e = Integer.valueOf(1280);
		Integer f = 1280;
		System.out.println("a==b:"+(a==b));
		System.out.println("c==d:"+(c==d));
		System.out.println("e==f:"+(e==f));
		
		
	}
}
