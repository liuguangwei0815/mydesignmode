package com.misco.server.composite;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        //声明linux课程
        CatalogComponet linuxCourse = new Course("linux课程", new BigDecimal(2000));
        //声明window课程
        CatalogComponet winCourse = new Course("windows课程", new BigDecimal(3000));

        //主目录
        CatalogComponet mainCatalog = new CourseCatalog("主目录",1);

        //添加java的目录和课程
        CatalogComponet javaCatalog = new CourseCatalog("java课程目录",2);
        CatalogComponet mmallCatalog1 = new Course("java电商1期", new BigDecimal("55"));
        CatalogComponet mmallCatalog2 = new Course("java电商2期", new BigDecimal("66"));
        CatalogComponet mmallCatalog3 = new Course("java算法", new BigDecimal("77"));
        javaCatalog.add(mmallCatalog1);
        javaCatalog.add(mmallCatalog2);
        javaCatalog.add(mmallCatalog3);

        //你看他可以添加课程 又可以 填写 课程的目录，消除对象的差异性 这个是组合的核心
        mainCatalog.add(linuxCourse);
        mainCatalog.add(winCourse);
        mainCatalog.add(javaCatalog);

        mainCatalog.print();

    }
}
