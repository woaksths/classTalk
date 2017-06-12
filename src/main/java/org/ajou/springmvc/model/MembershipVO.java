package org.ajou.springmvc.model;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipVO {

	private String id;
	private String password;
	private String e_mail;
	private String Sex;
	private int age;
	private String name;
	private String grade;
	private int classification;
	private AjouMemberVO ajouMemberVO;

	
	
	public MembershipVO() {
		super();
	}



	public MembershipVO(String id, String password, String e_mail, String sex, int age, String name, String grade,
			int classification, AjouMemberVO ajouMemberVO) {
		super();
		this.id = id;
		this.password = password;
		this.e_mail = e_mail;
		Sex = sex;
		this.age = age;
		this.name = name;
		this.grade = grade;
		this.classification = classification;
		this.ajouMemberVO = ajouMemberVO;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getE_mail() {
		return e_mail;
	}



	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}



	public String getSex() {
		return Sex;
	}



	public void setSex(String sex) {
		Sex = sex;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public int getClassification() {
		return classification;
	}



	public void setClassification(int classification) {
		this.classification = classification;
	}



	public AjouMemberVO getAjouMemberVO() {
		return ajouMemberVO;
	}



	public void setAjouMemberVO(AjouMemberVO ajouMemberVO) {
		this.ajouMemberVO = ajouMemberVO;
	}



	@Override
	public String toString() {
		return "MembershipVO [id=" + id + ", password=" + password + ", e_mail=" + e_mail + ", Sex=" + Sex + ", age="
				+ age + ", name=" + name + ", grade=" + grade + ", classification=" + classification + ", ajouMemberVO="
				+ ajouMemberVO + "]";
	}
	
}
