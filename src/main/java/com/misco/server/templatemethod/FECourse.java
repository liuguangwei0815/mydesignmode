/**
 * 
 */
package com.misco.server.templatemethod;

/**
 * @author liuwei
 * 前端代码
 */
public class FECourse extends ACourse{

	private Boolean isopen = false;

	@Override
	void packageCourse() {
		System.out.println("提供课程前端源代码");
		System.out.println("提供课程前端图片多媒体素材");
	}

	//将钩子函数暴露给应用层
	public FECourse(Boolean isopen) {
		this.isopen = isopen;
	}

	@Override
	protected boolean needArticle() {
		return isopen;
	}
}
