package daliborn.info.pitanje.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity(name = "QUESTION")
public class Question {
	@Id
	@Column(name="QUESTION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id = 0;
	
	private String question;
	
	@OneToMany
	@JoinColumn(name="RESPONSE_ID")
	@Cascade(CascadeType.ALL)
	private List<Response> responses;

	public Question(String question, List<Response> responses) {
		this.setQuestion(question);
		this.responses = responses;
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

	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}

	@Override
	public String toString() {
		return "Question [question=" + question + "]";
	}

}
