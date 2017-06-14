package org.ajou.springmvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.ajou.springmvc.model.SendQuestionVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionController {

	@Resource
	private SendQuestionVO sendQuestionVO;

	
	@RequestMapping("chatting.do")
	public ModelAndView questionList(HttpServletRequest request, SendQuestionVO sendQuestionVO) {
		return new ModelAndView("chatting");
	}
	
	@RequestMapping("AIchatting.do")
	public ModelAndView showAiChatting(HttpServletRequest request){
		System.out.println("인공지능 채팅게시판");
		return new ModelAndView("AIchatting");
	}
	
	public ModelAndView traceQuestioner(SendQuestionVO svo) {
		return new ModelAndView("");
	}

	public void sendQuestion(SendQuestionVO svo) {
	}


}
