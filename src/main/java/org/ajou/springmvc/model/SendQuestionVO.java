package org.ajou.springmvc.model;

import org.springframework.stereotype.Repository;

@Repository
public class SendQuestionVO {

	private int num;
	private int courseNum;
	private String id;
	private String content;
	private boolean mode;
	private MembershipVO membershipVO;
	private TakeCourseVO takeCourseVO;
	
	
	public SendQuestionVO() {
		super();
	}
	
	public SendQuestionVO(int num, int courseNum, String id, String content, boolean mode, MembershipVO membershipVO,
			TakeCourseVO takeCourseVO) {
		super();
		this.num = num;
		this.courseNum = courseNum;
		this.id = id;
		this.content = content;
		this.mode = mode;
		this.membershipVO = membershipVO;
		this.takeCourseVO = takeCourseVO;
	}



	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isMode() {
		return mode;
	}
	public void setMode(boolean mode) {
		this.mode = mode;
	}
	public MembershipVO getMembershipVO() {
		return membershipVO;
	}
	public void setMembershipVO(MembershipVO membershipVO) {
		this.membershipVO = membershipVO;
	}
	public TakeCourseVO getTakeCourseVO() {
		return takeCourseVO;
	}
	public void setTakeCourseVO(TakeCourseVO takeCourseVO) {
		this.takeCourseVO = takeCourseVO;
	}


	@Override
	public String toString() {
		return "SendQuestionVO [num=" + num + ", courseNum=" + courseNum + ", id=" + id + ", content=" + content
				+ ", mode=" + mode + ", membershipVO=" + membershipVO + ", takeCourseVO=" + takeCourseVO + "]";
	}
			
}
