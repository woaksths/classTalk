package org.ajou.springmvc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.ajou.springmvc.dao.MemberDAO;
import org.ajou.springmvc.model.MembershipVO;
import org.ajou.springmvc.model.TakeCourseVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class MemberController {

	@Resource
	private MembershipVO membershipVO;
	@Resource
	private MemberDAO memberDAO;

	@Resource
	private TakeCourseVO takeCourseVO;

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, MembershipVO membershipVO) {
		MembershipVO mvo = memberDAO.login(membershipVO);
		if (mvo != null && mvo.getAjouMemberVO().getClassification() == 1) {
			request.getSession().setAttribute("mvo", mvo);
			System.out.println("교수님 권한 로그인 성공");
			return new ModelAndView("member", "mvo", mvo);
		} else if (mvo != null && mvo.getAjouMemberVO().getClassification() == 0) {
			System.out.println("학생 로그인 ");
			return new ModelAndView("login_fail");
		} else {
			System.out.println("회원 정보가 일치하지 않습니다.");
			return new ModelAndView("login_fail");
		}
	}

	@RequestMapping("logout.do")
	public String logout(HttpServletRequest request) {
		return "";
	}

	public ModelAndView showCourseList(TakeCourseVO tvo) {
		return new ModelAndView("");
	}

	@RequestMapping("membertest.do")
	public ModelAndView showMemberList() {

		System.out.println("컨트롤러 진입 테스트");
		List<MembershipVO> member = memberDAO.showtest();
		System.out.println(member);
		return new ModelAndView("member", "member", member);
	}

	@ResponseBody
	@RequestMapping(value = "json.do", produces = "application/json;charset=utf-8")
	public JSONObject json() {
		JSONObject jsonMain = new JSONObject();
		List<MembershipVO> member = memberDAO.showtest();
		JSONArray jarray = new JSONArray();

		for (int i = 0; i < member.size(); i++) {
			MembershipVO mvo = member.get(i);
			JSONObject row = new JSONObject();
			row.put("id", mvo.getId());
			row.put("email", mvo.getE_mail());
			row.put("password", mvo.getPassword());
			jarray.add(i, row);
		}
		jsonMain.put("sendData", jarray);
		return jsonMain;
	}

}
