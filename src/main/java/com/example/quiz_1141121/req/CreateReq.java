package com.example.quiz_1141121.req;

import java.time.LocalDate;
import java.util.List;

import com.example.quiz_1141121.entity.Question;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;

public class CreateReq {
	
	

	private String title;

	
	private String description;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate endDate;// 在數據庫裡是DateTime

	
	private boolean published;
	
	private List<Question> questionList;//問卷和問題的關係是一對多，一所以這樣寫是錯的，要用list
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}
}
