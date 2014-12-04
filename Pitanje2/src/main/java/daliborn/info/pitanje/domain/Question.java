package daliborn.info.pitanje.domain;

public class Question {
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

	@Override
	public String toString() {
		return "Question [question=" + question + "]";
	}

}
