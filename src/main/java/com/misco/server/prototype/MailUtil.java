/**
 * 
 */
package com.misco.server.prototype;

import java.text.MessageFormat;

/**
 * @author liuwei 发送邮件工具类
 */
public class MailUtil {

	public static void sendMail(Mail mail) {
		String msg = "姓名：{0}地址：{1}内容{2}";
		System.out.println("发送" + MessageFormat.format(msg, mail.getUsername(), mail.getAddr(), mail.context));
	}

	public static void saveMail(Mail mail) {
		String msg = "姓名：{0}地址：{1}内容{2}";
		System.out.println("保存" + MessageFormat.format(msg, mail.getUsername(), mail.getAddr(), mail.context));
	}
}
