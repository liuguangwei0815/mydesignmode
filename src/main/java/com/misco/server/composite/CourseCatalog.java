package com.misco.server.composite;

import java.rmi.dgc.Lease;
import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录 ，课程目录肯定很多课程，课程又是目录组件
 *
 * @author liuwei
 * @date 2020/04/24
 */
public class CourseCatalog extends CatalogComponet {
    //课程也继承了目录组件，其实这里就是对应的课程的集合
    List<CatalogComponet> list = new ArrayList<CatalogComponet>();
    //目录的名称
    private String name;
    //层级
    private Integer level;


    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    /**
     * 课程目录的权限有添加删除打印，但是他本身是没有价格的
     **/
    @Override
    public void add(CatalogComponet catalogComponet) {
        list.add(catalogComponet);
    }

    @Override
    public void remove(CatalogComponet catalogComponet) {
        list.remove(catalogComponet);
    }

    @Override
    public void print() {
        //答应名称
        System.out.println(this.name);
        for (CatalogComponet c : list) {
            if(level!=null){
                for (int i = 0; i < level; i++) {
                    //加入空格 使这个更加区分明显
                    System.out.print("  ");
                }
                c.print();
            }

        }
    }

    @Override
    public String getName(CatalogComponet catalogComponet) {
        return super.getName(catalogComponet);
    }
}
