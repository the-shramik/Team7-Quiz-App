package com.quiz.bean;

import java.util.Arrays;

public class Question {

	private int qid;
	private String title;
	private String[] options;
	private String answer;
	
	//getters and setters
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswers(String answer) {
		this.answer = answer;
	}
	
	//parameterized constructor
	public Question(int qid, String title, String[] options, String answer) {
		super();
		this.qid = qid;
		this.title = title;
		this.options = options;
		this.answer = answer;
	}
	
	//default constructor
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//toString() method overrided
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", title=" + title + ", options=" + Arrays.toString(options) + ", answers="
				+ answer + "]";
	}
	
	
}
