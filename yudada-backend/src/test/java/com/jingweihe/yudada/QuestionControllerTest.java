package com.jingweihe.yudada;

import com.jingweihe.yudada.controller.QuestionController;
import com.jingweihe.yudada.model.dto.question.AiGenerateQuestionRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
public class QuestionControllerTest {

    @Resource
    private QuestionController questionController;

    @Test
    void aiGenerateQuestionSSEVIPTest() throws InterruptedException {
        AiGenerateQuestionRequest request = new AiGenerateQuestionRequest();
        request.setAppId(3L);
        request.setQuestionNumber(10);
        request.setOptionNumber(2);

        questionController.aiGenerateQuestionSSETest(request, false);
        questionController.aiGenerateQuestionSSETest(request, false);
        questionController.aiGenerateQuestionSSETest(request, true);

        Thread.sleep(1000000L);
    }

}
