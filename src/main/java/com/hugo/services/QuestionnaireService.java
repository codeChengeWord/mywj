package com.hugo.services;

import com.hugo.entity.Questionnaire;
import com.hugo.utils.QAResult;
import com.hugo.utils.page.childvo.QuestionnairePage;

import java.util.List;
import java.util.Map;

/**
 * Created by lxs on 2019/4/4.
 */

public interface QuestionnaireService {

    /**
     * 查询返回map数据
     * @param id
     * @return
     */
    List<Map<String,Object>> getPageQuestionnaireByUserResMap(int id);

    QAResult addQtManage(Questionnaire questionnaire,int userId,String userName);

    /**
     * 返回对象集合
     * @param questionnairePage
     * @return
     */
    List<Questionnaire> getQuestionnaire(QuestionnairePage questionnairePage);
    /**
     * 返回数据总数
     * @param questionnairePage
     * @return
     */
    Integer getQuestionnaireNum(QuestionnairePage questionnairePage);

    /**
     * 删除数据
     * @param data
     * @return
     */
    QAResult deleteQt(String data);
    /**
     * 删除数据
     * @param data
     * @return
     */
    QAResult approvalQt(String data);
    /**
     * 提交数据
     * @param data
     * @return
     */
    QAResult submissionQT(String data);

    /**
     * 获取问卷
     * @param id
     * @return
     */
    Questionnaire getQtById(Integer id);

}
