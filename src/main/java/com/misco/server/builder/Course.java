package com.misco.server.builder;

/**
 * @author liuwei  需要把这个对象建造出来
 * 场景是，要建立一个课程，课程的步骤有课程的名称，课程的ppt 课程的vidio 课程的笔记 课程的QA（问题和答案）
 */
public class Course {

    //课程名称
    private String courseName;
    //ppt
    private String coursePPt;
    //Vidio
    private String courseVidio;
    //Article
    private String courseArticle;
    //ppt 问题和答案
    private String courseQA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPt() {
        return coursePPt;
    }

    public void setCoursePPt(String coursePPt) {
        this.coursePPt = coursePPt;
    }

    public String getCourseVidio() {
        return courseVidio;
    }

    public void setCourseVidio(String courseVidio) {
        this.courseVidio = courseVidio;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPt='" + coursePPt + '\'' +
                ", courseVidio='" + courseVidio + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
