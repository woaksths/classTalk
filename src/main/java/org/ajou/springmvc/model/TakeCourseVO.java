package org.ajou.springmvc.model;

import org.springframework.stereotype.Repository;

@Repository
public class TakeCourseVO {

	
	private int CourseNum;
	private String id;
	
	private AjouMemberVO ajouMember;
	private CourseVO course;
	
	public TakeCourseVO() {
		super();
	}

	
	
	public TakeCourseVO(int courseNum, String id, AjouMemberVO ajouMember, CourseVO course) {
		super();
		CourseNum = courseNum;
		this.id = id;
		this.ajouMember = ajouMember;
		this.course = course;
	}



	public int getCourseNum() {
		return CourseNum;
	}

	public void setCourseNum(int courseNum) {
		CourseNum = courseNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AjouMemberVO getAjouMember() {
		return ajouMember;
	}

	public void setAjouMember(AjouMemberVO ajouMember) {
		this.ajouMember = ajouMember;
	}

	public CourseVO getCourse() {
		return course;
	}

	public void setCourse(CourseVO course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "TakeCourseVO [CourseNum=" + CourseNum + ", id=" + id + ", ajouMember=" + ajouMember + ", course="
				+ course + "]";
	}
	
	
	
}
