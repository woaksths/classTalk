package org.ajou.springmvc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.ajou.springmvc.model.SendQuestionVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionDAO {

	@Resource
	private SqlSessionTemplate template;

	public void sendQuestion(SendQuestionVO svo){
		 template.insert("", svo);
	}
	
	public List<SendQuestionVO> showQuestionList(){
		return template.selectList("");
	}
	
	public SendQuestionVO traceQuestioner(){
		return template.selectOne("");
	}
}
