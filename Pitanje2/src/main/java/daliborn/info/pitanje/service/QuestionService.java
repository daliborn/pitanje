package daliborn.info.pitanje.service;

import java.util.List;
import java.util.Set;

import daliborn.info.pitanje.domain.Question;

public interface QuestionService {

	Question get(String params);

	Question remove(String id);

	List<Question> allQuestions();

	void create(Question question);

}
