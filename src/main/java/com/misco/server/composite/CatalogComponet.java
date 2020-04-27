package com.misco.server.composite;

import java.math.BigDecimal;

/**
 * 目录组件(抽象类)
 *
 * @author liuwei
 * @date 2020/04/24
 */

public abstract class CatalogComponet {

    /**
     * 声明方法，交给子类进行选择重写
     *
     * @param catalogComponet
     */
    public void add(CatalogComponet catalogComponet) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponet catalogComponet) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComponet catalogComponet) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public BigDecimal getPrice(CatalogComponet catalogComponet) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    /**
     * 这个入参可以有和没有 通过场景判断
     */
    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }


}
