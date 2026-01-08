package com.yupi.yuaicodemother.core;

import com.yupi.yuaicodemother.model.enums.CodeGenTypeEnum;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import java.util.List;

@SpringBootTest
class AiCodeGeneratorFacadeTest {

    @Resource
    AiCodeGeneratorFacade aiCodeGeneratorFacade;

    @Test
    void generateAndSaveCode() {
    }

    @Test
    void generateAndSaveCodeStream() {
        Flux<String> codeStream =  aiCodeGeneratorFacade.generateAndSaveCodeStream("生成一个登录页面，总共不超过20行", CodeGenTypeEnum.HTML);
        List<String> result = codeStream.collectList().block();
        // 拼接字符串
        String resultStr = String.join("\n", result);
        System.out.println(resultStr);
    }
}