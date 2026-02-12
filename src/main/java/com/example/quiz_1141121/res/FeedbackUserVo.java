package com.example.quiz_1141121.res;

import java.time.LocalDate;
import java.util.List;

import com.example.quiz_1141121.vo.AnswerVo;

public class FeedbackUserVo {
	private String phone;
	private String username;
	private String email;
	private LocalDate fiilindate;
	private List<AnswerVo> answerVoList;
	private int age;

	public FeedbackUserVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeedbackUserVo( String username, String phone,String email, int age,LocalDate fiilindate,
			List<AnswerVo> answerVoList ) {
		super();
		this.phone = phone;
		this.username = username;
		this.email = email;
		this.fiilindate = fiilindate;
		this.answerVoList = answerVoList;
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFiilindate() {
		return fiilindate;
	}

	public void setFiilindate(LocalDate fiilindate) {
		this.fiilindate = fiilindate;
	}

	public List<AnswerVo> getAnswerVoList() {
		return answerVoList;
	}

	public void setAnswerVoList(List<AnswerVo> answerVoList) {
		this.answerVoList = answerVoList;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public FeedbackUserVo(String phone, String username, String email, LocalDate fiilindate, int age) {
		super();
		this.phone = phone;
		this.username = username;
		this.email = email;
		this.fiilindate = fiilindate;
		this.age = age;
	}

	public FeedbackUserVo(String phone, String username, String email, LocalDate fiilindate,
			List<AnswerVo> answerVoList) {
		super();
		this.phone = phone;
		this.username = username;
		this.email = email;
		this.fiilindate = fiilindate;
		this.answerVoList = answerVoList;
		
	}

}
