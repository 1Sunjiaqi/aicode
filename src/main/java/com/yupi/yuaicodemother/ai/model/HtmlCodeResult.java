package com.yupi.yuaicodemother.ai.model;

import dev.langchain4j.model.output.structured.Description;
import lombok.Data;
@Description("生成html文件的返回结果")
@Data
public class HtmlCodeResult {

    @Description("html代码")
    private String htmlCode;

    @Description("html文件描述")
    private String description;
}
