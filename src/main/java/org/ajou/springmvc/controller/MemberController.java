package org.ajou.springmvc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.ajou.springmvc.dao.CourseDAO;
import org.ajou.springmvc.dao.MemberDAO;
import org.ajou.springmvc.model.CourseVO;
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
	private CourseDAO courseDAO;
	@Resource
	private TakeCourseVO takeCourseVO;

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, MembershipVO membershipVO) {

		MembershipVO mvo = memberDAO.login(membershipVO);

		if (mvo == null) {
			System.out.println("회원정보 일치하지 않습니다");
			return new ModelAndView("login_fail");
		} else if (!mvo.getAjouMemberVO().getId().equals("hwang")&&mvo.getAjouMemberVO().getClassification() == 1) {
			System.out.println("교수권한");
			request.getSession().setAttribute("mvo", mvo);
			System.out.println("로그인한 아이디:" + mvo.getAjouMemberVO().getId());
			return new ModelAndView("login_success");
			// return new ModelAndView("redirect:courseList.do?id="+
			// mvo.getAjouMemberVO().getId());
		} else if (mvo.getAjouMemberVO().getClassification() == 1&&mvo.getAjouMemberVO().getId().equals("hwang")) {
			return new ModelAndView("login_hwang");
		} else {
			System.out.println("학생 진입");
			return new ModelAndView("login_fail");
		}
}

	@RequestMapping("logout.do")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "home";
	}

	@RequestMapping("courseList.do")
	public ModelAndView showCourseList(String id) {
		// System.out.println("강의 과목 리스트 진입");

		// System.out.println("교수 id check"+id);
		List<CourseVO> clist = courseDAO.showCourseList(id);
		// System.out.println("dao 진입" + clist);
		return new ModelAndView("login_success", "clist", clist);
	}

	@RequestMapping("membertest.do")
	public ModelAndView showMemberList() {

		// System.out.println("컨트롤러 진입 테스트");
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
			row.put("id", mvo.getID());
			row.put("email", mvo.getEMAIL());
			row.put("password", mvo.getPASSWORD());
			jarray.add(i, row);
		}
		jsonMain.put("sendData", jarray);
		return jsonMain;
	}

}
