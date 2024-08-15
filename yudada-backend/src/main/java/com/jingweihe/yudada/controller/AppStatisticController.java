package com.jingweihe.yudada.controller;

import com.jingweihe.yudada.common.BaseResponse;
import com.jingweihe.yudada.common.ErrorCode;
import com.jingweihe.yudada.common.ResultUtils;
import com.jingweihe.yudada.exception.ThrowUtils;
import com.jingweihe.yudada.mapper.UserAnswerMapper;
import com.jingweihe.yudada.model.dto.statistic.AppAnswerCountDTO;
import com.jingweihe.yudada.model.dto.statistic.AppAnswerResultCountDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/app/statistic")
@Slf4j
public class AppStatisticController {
    @Resource
    private UserAnswerMapper userAnswerMapper;

    /**
     * 某应用回答结果分布统计
     * @param appId
     * @return
     */
    @GetMapping("/answer_result_count")
    public BaseResponse<List<AppAnswerResultCountDTO>> getAppAnswerResultCount(Long appId) {
        ThrowUtils.throwIf(appId == null || appId <= 0, ErrorCode.PARAMS_ERROR);
        return ResultUtils.success(userAnswerMapper.doAppAnswerResultCount(appId));
    }

    /**
     * 热门应用及回答数统计
     * @return
     */
    @GetMapping("/answer_count")
    public BaseResponse<List<AppAnswerCountDTO>> getAppAnswerCount() {
        return ResultUtils.success(userAnswerMapper.doAppAnswerCount());
    }
}
