package daliborn.info.pitanje.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import daliborn.info.pitanje.domain.Question;

public class QuestionServiceImpl implements QuestionService {
	private SessionFactory sessionFactory = null;

	public QuestionServiceImpl() {
        Configuration config = new Configuration().configure();

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
                config.getProperties()).buildServiceRegistry();

        sessionFactory = config.buildSessionFactory(serviceRegistry);
	}


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
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        session.save(question);

        session.getTransaction().commit();
		
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
