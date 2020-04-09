package com.misco.server.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course builder = new Course.CourseBuilder()
                .courseName("java课程").coursePPt("java PPT")
                .courseVidio("java vido").courseArticle("java 笔记").courseQA("java 答题").build();
        System.out.println(builder);
    }
}
