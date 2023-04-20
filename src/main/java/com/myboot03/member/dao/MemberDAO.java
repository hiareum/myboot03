package com.myboot03.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myboot03.member.vo.MemberVO;

@Mapper
@Repository("memberDAO")
public interface MemberDAO {
	//DAO�������̽��� @Mapper�� ����ϱ�� �߱⿡ �ּ�
	//public List selectAllMembers() throws DataAccessException ;
	
	//�� ���� ���̹�Ƽ�������� DAO�������̽��� �߻�޼��带 ������ �Ŀ� �������̽� ����Ŭ�������� SQLSession Ŭ������
	//���� ���Ͽ� SQL���� �����ؼ� ���� ������ , ��������Ʈ������ ���� Ŭ������ �������� ���� Ŭ�������� DAO �������̽��� �߻�޼��带 ȣ���ϸ�
	//�������̽������� ���� ���Ͽ��� ȣ��� �̸��� ������ ID�� sql���� �ٷ� ����� �� �ִ�
	public List selectAllMemberList() throws DataAccessException ;
	
	
	//public int insertMember(MemberVO memberVO) throws DataAccessException ;
	public int insertMember(MemberVO memberVO) throws DataAccessException ;
	
//	public int removeMember(String id) throws DataAccessException;
	public int deleteMember(String id) throws DataAccessException;
	
//	public int modMember(MemberVO memberVO)throws DataAccessException;
	 public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
	

}
