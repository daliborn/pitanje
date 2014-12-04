package daliborn.info.pitanje.service;

import java.util.ArrayList;
import java.util.List;

import daliborn.info.pitanje.domain.Question;

public class QuestionServiceImpl implements QuestionService {

	@Override
	public Question get(String params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question remove(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Question question) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Question> allQuestions() {
		List<Question> list = new ArrayList<Question>();
		list.add(new Question("prvo"));
		list.add(new Question("drugo"));
		list.add(new Question("trece"));
		return list;
	}

}
