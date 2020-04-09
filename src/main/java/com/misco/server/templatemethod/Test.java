package com.misco.server.templatemethod;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        //声明设计模式课程
        System.out.println("制作java课程开始==========");
        ACourse aCourse = new DesignPatternCourse();
        aCourse.makeCourse();
        System.out.println("制作java课程结束===========");

        System.out.println("制作前端课程开始===========");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("制作前端课程结束===========");
    }
}
