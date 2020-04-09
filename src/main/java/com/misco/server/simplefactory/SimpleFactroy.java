package com.misco.server.simplefactory;

/**
 * 简单工程
 */
public class SimpleFactroy {
    /**
     * 每次通过参数获取
     * @param parm
     * @return
     */
    public static Object factory(String parm) {
        if (parm.contains("a")) {
            return new Aclass();
        }
        return null;
    }
}
