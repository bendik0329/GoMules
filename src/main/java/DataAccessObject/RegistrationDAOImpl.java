package DataAccessObject;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.RegistrationModel;

@Repository
public class RegistrationDAOImpl implements RegistrationDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(RegistrationDAOImpl.class);
	
	
	@Override
	public int Register(RegistrationModel regModel) {
		// here code to write for saving data into DB.
		
		 this.sessionFactory.getCurrentSession().persist(regModel);
		logger.info("Person saved successfully, registration ="+regModel);
		return 0;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
