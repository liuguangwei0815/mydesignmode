package com.misco.server.prototype;
/**
 * 原型设计模式测试
 * @author liuwei
 * 假设mail这个对象构造起来非常麻烦，可以通过clole 进行发送
 */
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Mail mail = new Mail();
		mail.setContext("初始化模板");
		System.out.println("mail:"+mail);
		for (int i = 0; i < 5; i++) {
			//不会执行mail的构造
			Mail cm = (Mail) mail.clone();
			cm.setUsername("姓名：u"+i);
			cm.setAddr("地址"+i);
			cm.setContext("恭喜你"+i);
			MailUtil.saveMail(cm);
			System.out.println("cm:"+cm);
		}
		//这个只能发在最优一行，
		MailUtil.saveMail(mail);
	}
}
