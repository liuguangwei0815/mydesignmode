package com.misco.server.composite;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 课程 继承目录组件
 *
 * @author liuwei
 * @date 2020/04/24
 */
public class Course extends CatalogComponet {
    private String name;
    private BigDecimal price;

    public Course(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    /**
     * 课程是继承课程目录，
     * 但是课程和目录是两个不相关的东西但是又有相关的东西，但是他继承的 所以需要选择性的继承他的方法
     * 课程可以获取自己的名称，和价格 但是不能添加和删除目录组件 ，但是其他方法还是可以继承的
     **/
    @Override
    public String getName(CatalogComponet catalogComponet) {
        return this.name;
    }

    @Override
    public BigDecimal getPrice(CatalogComponet catalogComponet) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程名称：" + name + " 课程价格：" + price);
    }
}
