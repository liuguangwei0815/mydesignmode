package com.misco.server.flyweight;

/**
 * @author liuwei 管理者有很多
 */
public class Manager implements Employee {

	@Override
	public void report() {
		// 做报告
		System.out.println(content);
	}

	private String departMentName;
	private String content;

	// 部门名称
	public Manager(String departMentName) {
		this.departMentName = departMentName;
	}	

	public void setContent(String content) {
		this.content = content;
	}
}
