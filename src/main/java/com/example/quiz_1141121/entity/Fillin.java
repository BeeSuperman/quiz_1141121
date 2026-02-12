package com.example.quiz_1141121.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "fillin")
@IdClass(value=FillinId.class)
public class Fillin {
	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQustionId(int qustionId) {
		this.questionId = qustionId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public LocalDate getFillinDate() {
		return fillinDate;
	}

	public void setFillinDate(LocalDate fillinDate) {
		this.fillinDate = fillinDate;
	}

	@Id
	@Column(name = "quizId")
	private int quizId;
	@Id
	@Column(name = "questionId")
	private int questionId;
	@Id
	@Column(name = "userEmail")
	private String userEmail;

	@Column(name = "answer")
	private String answer;

	@Column(name = "fillin_date")
	private LocalDate fillinDate;

}
