package org.ajou.springmvc.model;

import org.springframework.stereotype.Repository;

@Repository
public class TakeCourseVO {

	private String courseId;
	private String id;

	public TakeCourseVO() {
		super();
	}

	public TakeCourseVO(String courseId, String id) {
		super();
		this.courseId = courseId;
		this.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TakeCourseVO [courseId=" + courseId + ", id=" + id + "]";
	}
}