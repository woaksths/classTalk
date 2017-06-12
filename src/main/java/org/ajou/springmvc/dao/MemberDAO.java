package org.ajou.springmvc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.ajou.springmvc.model.AjouMemberVO;
import org.ajou.springmvc.model.MembershipVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Resource
	private SqlSessionTemplate template;
	
	public MembershipVO login(MembershipVO membershipVO){		
		return template.selectOne("member.login",membershipVO);
	}
	
	public void registerMember(MembershipVO mvo){
		 template.insert("", mvo);;
	}
	
	public List<MembershipVO> showtest(){
		return template.selectList("member.showMemberList");
	}
	
	
	public List<AjouMemberVO> loginProfessor(AjouMemberVO ajouMemberVO){
		return template.selectList("member.loginProfessor", ajouMemberVO);
	}
}
