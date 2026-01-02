package com.yupi.yuaicodemother.common;

import lombok.Data;

@Data  // 使用Lombok库的@Data注解，自动生成getter、setter、toString等方法
public class PageRequest {

    /**
     * 当前页号
     * 默认值为1，表示从第一页开始
     */
    private int pageNum = 1;

    /**
     * 页面大小
     * 默认值为10，表示每页显示10条数据
     */
    private int pageSize = 10;

    /**
     * 排序字段
     * 用于指定按照哪个字段进行排序，可以为null表示不排序
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     * 可选值包括"ascend"（升序）和"descend"（降序）
     * 默认值为"descend"表示降序排列
     */
    private String sortOrder = "descend";
}
