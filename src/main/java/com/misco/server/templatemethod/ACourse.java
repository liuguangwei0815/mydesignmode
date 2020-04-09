/**
 *
 */
package com.misco.server.templatemethod;

/**
 * @author liuwei 抽象方法 1、抽象方法要声明为抽象类 对所有子类不会进行修改的都声明为final
 *
 */
public abstract class ACourse {

    // 声明一个制作课程的固定流程，这个方法需要受保护的 final ，不能别重写的 子类不能继承
    protected final void makeCourse() {
        this.makePPT();
        this.makeVidio();
        //钩子方法。让子类去实现
        if (this.needArticle()) {
            this.makeArticle();
        }
        this.packageCourse();
    }

    // 1制作PPT 这个是所有子类公认的
    final void makePPT() {
        System.out.println("制作PPT");
    }

    // 2制作视频 也是被其他子类工人的 所以这个final
    final void makeVidio() {
        System.out.println("制作视频");
    }

    // 3制作手记，有可能小明需要手记了，但是小黄不需要手记, 但是他也是公认的（可选的项） 都不会对他进行修改
    final void makeArticle() {
        System.out.println("编写笔记");
    }

    // 钩子函数 ,但是每个人可能不一定编写 所以声明钩子方法 ,这个不是final 子类可以覆盖他
    protected boolean needArticle() {
        return false;
    }

    // 包装课程。我们需要源码放到文件包中里面，对于前端的同学他们也要放一些素材 同时还要放一些素材进去 ，不同课程 不同的包装课程是不一样的,这个交给子类来实现
    abstract void packageCourse();

}
