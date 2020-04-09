package com.misco.server.builder.v2;

/**
 * 课程
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

    public Course(CourseBuilder builder) {
        this.courseName  = builder.courseName;
        this.coursePPt  = builder.coursePPt;
        this.courseVidio  = builder.courseVidio;
        this.courseArticle  = builder.courseArticle;
        this.courseQA  = builder.courseQA;
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

    //静态内部类
    public static class CourseBuilder {
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

        //链式调用返回本身 并赋值
        public CourseBuilder courseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        //链式调用返回本身 并赋值
        public CourseBuilder coursePPt(String coursePPt) {
            this.coursePPt = coursePPt;
            return this;
        }

        //链式调用返回本身 并赋值
        public CourseBuilder courseVidio(String courseVidio) {
            this.courseVidio = courseVidio;
            return this;
        }

        //链式调用返回本身 并赋值
        public CourseBuilder courseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        //链式调用返回本身 并赋值
        public CourseBuilder courseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        //返回课程对象
        public Course build() {
            return new Course(this);
        }
    }
}
