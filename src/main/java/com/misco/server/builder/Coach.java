package com.misco.server.builder;

/**
 * 课程经理
 */
public class Coach {
    //讲师
    private CourseBuilder courseBuilder;
    //将应用层赋值讲师
    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }
    //经理开始制作课程 并将课程返回给boss 可以理解为client
    public Course makeCourse(String courseName, String coursePPt, String courseVidio, String courseArticle, String courseQA) {
        courseBuilder.courCourseArticle(courseArticle);
        courseBuilder.courCourseName(courseName);
        courseBuilder.courCoursePPt(coursePPt);
        courseBuilder.courCourseVidio(courseVidio);
        courseBuilder.courCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}
