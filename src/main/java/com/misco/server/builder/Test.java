package com.misco.server.builder;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach();
        //设置建造者
        coach.setCourseBuilder(new CourseActualBuilder());
        Course course = coach.makeCourse("java", "javaPPT",
                "javavidio", "笔记", "问答");
        System.out.println(course.toString());
    }
}
