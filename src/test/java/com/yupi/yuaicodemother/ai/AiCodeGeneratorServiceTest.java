package com.yupi.yuaicodemother.ai;

import com.yupi.yuaicodemother.ai.model.HtmlCodeResult;
import com.yupi.yuaicodemother.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult code = aiCodeGeneratorService.generateHtmlCode("请生成一个博客首页，不超过20行");
        System.out.println(code);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult code = aiCodeGeneratorService.generateMultiFileCode("请生成一个博客首页，不超过20行");
        System.out.println(code);
    }
}