/**
 * 
 */
package com.misco.server.combination;

import java.util.LinkedList;
import java.util.List;

/**
 * @author liuwei
 * 目录课程 有很多比如linux windos 和 特异性java
 */
public class CatalogCourse extends CatalogCompoment{
	
	private String name;
	
	List<CatalogCompoment> list = new LinkedList<CatalogCompoment>();

	public CatalogCourse(String name) {
		this.name = name;
	}
	
	
	//课程目录要根据特定的场景 那些方法是不能继承的，比如这里是不能继承价格的
	@Override
	public void add(CatalogCompoment catalogCompoment) {
		list.add(catalogCompoment);
	}

	@Override
	public void remove(CatalogCompoment catalogCompoment) {
		list.remove(catalogCompoment);
	}

//	@Override
//	public void print() {
//		for (CatalogCompoment catalogCompoment : list) {
//			System.out.println(catalogCompoment.getName(catalogCompoment));
//		}
//	}
	

}
