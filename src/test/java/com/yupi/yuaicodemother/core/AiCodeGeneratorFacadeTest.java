package com.yupi.yuaicodemother.core;

import com.yupi.yuaicodemother.model.enums.CodeGenTypeEnum;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import java.io.File;
import java.util.List;

@SpringBootTest
class AiCodeGeneratorFacadeTest {

    @Resource
    private AiCodeGeneratorFacade aiCodeGeneratorFacade;
     @Test void generateAndSaveCode() {
        File file = aiCodeGeneratorFacade.generateAndSaveCode("生成一个登录界面，总共不超过20行", CodeGenTypeEnum.MULTI_FILE);

    }

    @Test
    void generateAndSaveCodeStream() {
         Flux<String> codeStream = aiCodeGeneratorFacade.generateAndSaveCodeStream("生成一个登录界面，总共不超过20行", CodeGenTypeEnum.MULTI_FILE);
         List<String> codeList = codeStream.collectList().block();
         String completeContent = String.join("\n", codeList);
         System.out.println(completeContent);
    }
}