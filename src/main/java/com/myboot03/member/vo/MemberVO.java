package com.myboot03.member.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component(value = "memberVO")
public class MemberVO {
		private String id;
		private String pwd;
		private String name;
		private String email;
		private Date joinDate;

		public MemberVO() {
			System.out.println("MemberVOȣ��");
		}


		

		

}
