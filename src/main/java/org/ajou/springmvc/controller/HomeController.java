package org.ajou.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	/*
	 * @PathVariable : 요청 url 정보를 변수로 할당 받는다 
	 * 요청 url 과 일치하는 url 매핑 정보가 있으면 
	 * ( 즉 별도의 메서드가 있으면 ) 
	 * 그 메서드가 실행되고 
	 * 없으면 
	 * @PathVariable 적용 메서드가 실행된다 ....
	 */
	
	@RequestMapping("{viewName}.do")
	public String showView(@PathVariable String viewName){
		System.out.println("@PathVariable:"+viewName);
		return viewName;
	}
	@RequestMapping("{dirName}/{viewName}.do")
	public String showView(@PathVariable String dirName,@PathVariable String viewName){
		System.out.println("@PathVariable:"+dirName+"/"+viewName);
		return dirName+"/"+viewName;
	}
	
	
}
