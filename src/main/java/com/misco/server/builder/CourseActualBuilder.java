package com.misco.server.builder;

/**
 * 课程的实际建造者
 * 1、有boss 下达制作课程指令
 * 2、课程经理负责和讲师对接并和讲师负责一起完成讲课， 负责叫讲师makeCourse 我们的课程
 * 3、讲师提供课程名称，视频 ，ppt 等
 */
public class CourseActualBuilder extends CourseBuilder {
    //将课程对象建立出来并在此进行初始化
    private  Course course = new Course();
    @Override
    public void courCourseName(String courseName) {
        course.setCourseName(courseName);
    }
    @Override
    public void courCoursePPt(String coursePPt) {
        course.setCoursePPt(coursePPt);
    }
    @Override
    public void courCourseVidio(String courseVidio) {
        course.setCourseVidio(courseVidio);
    }
    @Override
    public void courCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }
    @Override
    public void courCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }
    //直接返回这个对象即可
    @Override
    public Course makeCourse() {
        return course;
    }
}
