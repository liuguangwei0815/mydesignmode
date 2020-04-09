/**
 * 
 */
package com.misco.server.single;

/**
 * @author liuwei
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new SingleThead());
		Thread t2 = new Thread(new SingleThead());
		t1.start();
		t2.start();
		
	}

}
