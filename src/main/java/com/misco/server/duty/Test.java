package com.misco.server.duty;

public class Test {

	public static void main(String[] args) {
		//设置两个审批者 去审批课程
		Approver article = new ArticleAprrover();
		Approver vido = new VidioAprrover();
		
		//设置课程
		Course course = new Course();
		course.setCourseName("java 设计模式");
		course.setArticle("java 设计模式手记");
		course.setVidio("java 设计模式手记");
		//如果流程 交给client 的 如果article 不过 那么vido 就不用审理了
		
		//设置下链路
		article.setNextApporver(vido);
		//发布课程
		article.depaloy(course);
	}

}
