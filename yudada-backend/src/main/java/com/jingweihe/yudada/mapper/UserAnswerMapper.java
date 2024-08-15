package com.jingweihe.yudada.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jingweihe.yudada.model.dto.statistic.AppAnswerCountDTO;
import com.jingweihe.yudada.model.dto.statistic.AppAnswerResultCountDTO;
import com.jingweihe.yudada.model.entity.UserAnswer;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
* @author 86182
* @description 针对表【user_answer(用户答题记录)】的数据库操作Mapper
* @createDate 2024-08-09 15:09:53
* @Entity generator.domain.UserAnswer
*/
public interface UserAnswerMapper extends BaseMapper<UserAnswer> {

    @Select("select appId, count(userId) as answerCount from user_answer " +
            "group by appId order by answerCount desc")
    List<AppAnswerCountDTO> doAppAnswerCount();

    @Select("select resultName, count(resultName) as resultCount from user_answer " +
            "where appId = #{appId} group by resultName order by resultCount desc")
    List<AppAnswerResultCountDTO> doAppAnswerResultCount(Long appId);
}





