package daliborn.info.pitanje.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "QUESTION")
public class Question {
	@Id
	@Column(name="QUESTION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id = 0;
	
	private String question;

	public Question(String question) {
		this.setQuestion(question);
	}

	public Question() {}
	
	
	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Question [question=" + question + "]";
	}

}
