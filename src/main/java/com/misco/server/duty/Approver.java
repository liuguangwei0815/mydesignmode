/**
 * 
 */
package com.misco.server.duty;

/**
 * @author liuwei
 *  重点：在抽象类审批者 有自己类型的应用，指向下一个需要审批的对象，这个负责在他的子类指定
 */
public abstract class Approver {
	//他有自己的引用 比如tish 和这个不一定相等 ，声明一个自己类型的批准者 protected 为了子类能继承他
	protected Approver approver;
	//设置下一个批准者  
	public void setNextApporver(Approver approver) {
		this.approver = approver;
	}
	//发布课程
	public abstract void depaloy(Course course);
}
