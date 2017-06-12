package org.ajou.springmvc.model;

import org.springframework.stereotype.Repository;

@Repository
public class AjouMemberVO {

	private String id;
	private String Sex;
	private int age;
	private String name;
	private String grade;
	private int classification;

	public AjouMemberVO() {
		super();
	}

	public AjouMemberVO(String id, String sex, int age, String name, String grade, int classification) {
		super();
		this.id = id;
		Sex = sex;
		this.age = age;
		this.name = name;
		this.grade = grade;
		this.classification = classification;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "AjouMemberVO [id=" + id + ", Sex=" + Sex + ", age=" + age + ", name=" + name + ", grade=" + grade
				+ ", classification=" + classification + "]";
	}

}
