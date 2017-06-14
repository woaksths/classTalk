package org.ajou.springmvc.model;

import org.springframework.stereotype.Repository;

@Repository
public class CourseVO {

	private int courseId;
	private String courseName;
	private int semester;
	private String course_time;

	public CourseVO() {
		super();
	}

	public CourseVO(int courseId, String courseName, int semester, String course_time) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.semester = semester;
		this.course_time = course_time;
	}

	public int getcourseId() {
		return courseId;
	}

	public void setcourseId(int courseId) {
		this.courseId = courseId;
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

	public String getCourse_time() {
		return course_time;
	}

	public void setCourse_time(String course_time) {
		this.course_time = course_time;
	}

	@Override
	public String toString() {
		return "CourseVO [courseId=" + courseId + ", courseName=" + courseName + ", semester=" + semester
				+ ", course_time=" + course_time + "]";
	}
}
