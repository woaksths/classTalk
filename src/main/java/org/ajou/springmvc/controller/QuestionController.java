package org.ajou.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.ajou.springmvc.model.SendQuestionVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionController {

	private SendQuestionVO sendQuestionVO;

	public ModelAndView questionList(HttpServletRequest request, SendQuestionVO sendQuestionVO) {
		return new ModelAndView("");
	}
	
	public ModelAndView traceQuestioner(SendQuestionVO svo) {
		return new ModelAndView("");
	}

	public void sendQuestion(SendQuestionVO svo) {
	}


}
