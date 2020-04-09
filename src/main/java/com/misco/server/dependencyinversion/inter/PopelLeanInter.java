package com.misco.server.dependencyinversion.inter;
/**
 *    面向接口编程
 *    人学习什么课程
 * @author liuwei
 *
 */
public class PopelLeanInter {
     public String lean(ISouce souce) {
    	 return "学习"+souce.desc();
     }
}
