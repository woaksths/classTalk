package org.ajou.springmvc.model;

import java.sql.Time;

import org.springframework.stereotype.Repository;

@Repository
public class CourseVO {

	
	private int courseNum;
	private String courseName;
	private int semester;
	private Time time;
	
	public CourseVO() {
		super();
	}

	public CourseVO(int courseNum, String courseName, int semester, Time time) {
		super();
		this.courseNum = courseNum;
		this.courseName = courseName;
		this.semester = semester;
		this.time = time;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "CourseVO [courseNum=" + courseNum + ", courseName=" + courseName + ", semester=" + semester + ", time="
				+ time + "]";
	}
	
	
}
