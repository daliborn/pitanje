package daliborn.info.pitanje.service;

import java.util.List;

import daliborn.info.pitanje.domain.Question;

public interface QuestionService {

	Question remove(String id);

	List<Question> allQuestions();

	void create(Question question);

	Question get(Integer id);

}
