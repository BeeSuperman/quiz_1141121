package com.example.quiz_1141121.entity;

import java.io.Serializable;
//@SuppressWarnings
public class FillinId implements Serializable {
	private int quizId;
	private int qustionId;
	private String userEmail;
	public int getQuizId() {
		return quizId;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	public int getQustionId() {
		return qustionId;
	}
	public void setQustionId(int qustionId) {
		this.qustionId = qustionId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}
