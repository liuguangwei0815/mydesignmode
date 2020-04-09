/**
 *
 */
package com.misco.server.templatemethod;

/**
 * @author liuwei
 * 设计模式课程
 */
public class DesignPatternCourse extends ACourse {

    //只需要实现这个方法即可和里面的逻辑
    @Override
    void packageCourse() {
        System.out.println("提供课程java源代码");
    }

    //現在我們需要在设计过程中需要编写手记
    //覆盖父类的needArticle 即可
    @Override
    protected boolean needArticle() {
        return true;
    }
}
