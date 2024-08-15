package com.jingweihe.yudada.model.dto.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/**
 * 问题内容数据传输对象，包含问题选项列表和标题。
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionContentDTO {
    /**
     * 问题的选项列表。
     */
    private List<Option> options;

    /**
     * 问题的标题。
     */
    private String title;

    /**
     * 问题选项类，内部类。
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Option {
        /**
         * 选项的结果。
         */
        private String result;

        /**
         * 选项的值。
         */
        private String value;

        private int score;

        /**
         * 选项的键。
         */
        private String key;
    }
}

