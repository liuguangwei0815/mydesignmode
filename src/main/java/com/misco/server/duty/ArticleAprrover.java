/**
 * 
 */
package com.misco.server.duty;

/**
 * @author liuwei 日记审批者
 */
public class ArticleAprrover extends Approver {

	@Override
	public void depaloy(Course course) {
		//笔记不为空
		if (course.getArticle() != null && !course.getArticle().equals("")) {
			System.out.println("课程有日记，批准！");
			//如果有下一个批准对象
			if(approver!=null) {
				//将这个课程传递给下一个审批者 调动校验
				approver.depaloy(course);
			}
		}else {
			System.out.println("没有日记，审批不通过");
			//流程终止
			return;
		}
	}
}
