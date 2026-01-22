package com.yupi.yuaicodemother.ai;

import com.yupi.yuaicodemother.ai.model.HtmlCodeResult;
import com.yupi.yuaicodemother.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult code = aiCodeGeneratorService.generateHtmlCode("请生成一个博客首页，不超过20行");
        System.out.println(code);
        code = aiCodeGeneratorService.generateHtmlCode("不用生成代码，告诉我你刚才做了什么？");
        System.out.println(code);

        code = aiCodeGeneratorService.generateHtmlCode("请生成一个工具网站，不超过20行");
        System.out.println(code);
        code = aiCodeGeneratorService.generateHtmlCode("不用生成代码，告诉我你刚才做了什么？");
        System.out.println(code);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult code = aiCodeGeneratorService.generateMultiFileCode("请生成一个博客首页，不超过20行");
        System.out.println(code);
    }
}