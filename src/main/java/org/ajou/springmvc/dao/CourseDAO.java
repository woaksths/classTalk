package org.ajou.springmvc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.ajou.springmvc.model.CourseVO;
import org.ajou.springmvc.model.TakeCourseVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDAO {

	@Resource
	private SqlSessionTemplate template;
	
	public List<CourseVO> showCourseList(String id){
		//System.out.println("coursedao"+id);
		return template.selectList("course.courselist",id);
	}
	
	public TakeCourseVO chooseCourse(TakeCourseVO tvo){
		return template.selectOne("", tvo);
	}
	
}
