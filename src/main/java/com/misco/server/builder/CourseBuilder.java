package com.misco.server.builder;

/**
 * 课程抽象建造者，这里可以使用接口，需要具体的子类去进行建造出来
 */
public abstract class CourseBuilder {
    public abstract void courCourseName(String courseName);

    public abstract void courCoursePPt(String coursePPt);

    public abstract void courCourseVidio(String courseVidio);

    public abstract void courCourseArticle(String courseArticle);

    public abstract void courCourseQA(String courseQA);
    //构建对象
    public abstract Course makeCourse();
}
