package org.ajou.springmvc.model;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipVO {

	private String ID;
	private String PASSWORD;
	private String EMAIL;
	private AjouMemberVO ajouMemberVO;

	public MembershipVO() {
		super();
	}

	public MembershipVO(String iD, String pASSWORD, String eMAIL, AjouMemberVO ajouMemberVO) {
		super();
		ID = iD;
		PASSWORD = pASSWORD;
		EMAIL = eMAIL;
		this.ajouMemberVO = ajouMemberVO;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public AjouMemberVO getAjouMemberVO() {
		return ajouMemberVO;
	}

	public void setAjouMemberVO(AjouMemberVO ajouMemberVO) {
		this.ajouMemberVO = ajouMemberVO;
	}

	@Override
	public String toString() {
		return "MembershipVO [ID=" + ID + ", PASSWORD=" + PASSWORD + ", EMAIL=" + EMAIL + ", ajouMemberVO="
				+ ajouMemberVO + "]";
	}

}
