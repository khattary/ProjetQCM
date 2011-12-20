package ma.norsys.formation.dao;

import ma.norsys.formation.dao.IDaoQuestionnaire;
import ma.norsys.formation.entities.Questionnaire;
import ma.norsys.formation.entities.Subscriber;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class DaoQuestionnaireImpl implements IDaoQuestionnaire {
	@Autowired
	private SessionFactory sessionFactory;
	public Questionnaire findQuetinnaireById(long id) {

		
		Questionnaire questionnaire = (Questionnaire) sessionFactory.getCurrentSession().get(Questionnaire.class, id);
		return questionnaire;
	}

	public void addQuestionnaire(Questionnaire qten) {

		sessionFactory.getCurrentSession().save(qten);

	}

	public Subscriber findSubscriberById(long id) {
	
		Subscriber sub =(Subscriber) sessionFactory.getCurrentSession().get(Subscriber.class, id);
		return sub;
	}

}
