package com.myboot03.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myboot03.member.vo.MemberVO;

@Mapper
@Repository("memberDAO")
public interface MemberDAO {
	//DAO인터페이스를 @Mapper로 사용하기로 했기에 주석
	//public List selectAllMembers() throws DataAccessException ;
	
	//그 전에 마이바티스에서는 DAO인터페이스에 추상메서드를 선언한 후에 인터페이스 구현클래스에서 SQLSession 클래스로
	//매퍼 파일에 SQL문에 접근해서 실행 헀지만 , 스프링부트에서는 구현 클래스가 없어지고 서비스 클래스에서 DAO 인터페이스의 추상메서드를 호출하면
	//인터페이스에서는 매퍼 파일에서 호출된 이름과 동일한 ID의 sql문을 바로 사용할 수 있다
	public List selectAllMemberList() throws DataAccessException ;
	
	
	//public int insertMember(MemberVO memberVO) throws DataAccessException ;
	public int insertMember(MemberVO memberVO) throws DataAccessException ;
	
//	public int removeMember(String id) throws DataAccessException;
	public int deleteMember(String id) throws DataAccessException;
	
//	public int modMember(MemberVO memberVO)throws DataAccessException;
	 public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
	

}
