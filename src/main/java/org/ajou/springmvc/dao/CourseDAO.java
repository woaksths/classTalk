package org.ajou.springmvc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.ajou.springmvc.model.CourseVO;
import org.ajou.springmvc.model.MembershipVO;
import org.ajou.springmvc.model.TakeCourseVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDAO {

	@Resource
	private SqlSessionTemplate template;
	
	public List<CourseVO> showCourseList(MembershipVO mvo){
		return template.selectList("",mvo);
	}
	
	public TakeCourseVO chooseCourse(TakeCourseVO tvo){
		return template.selectOne("", tvo);
		
	}
	
}
