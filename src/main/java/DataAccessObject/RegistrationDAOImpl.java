package DataAccessObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.persistence.TypedQuery;

import model.RegistrationModel;

@Repository
@Transactional
public class RegistrationDAOImpl implements RegistrationDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
/*	private static final Logger logger = LoggerFactory.getLogger(RegistrationDAOImpl.class);*/
	
@Override
  public int Register(RegistrationModel regModel) {
 
		Session sess= this.sessionFactory.getCurrentSession();
		
		sess.persist(regModel);
		
		
		//logger.info("Person saved successfully, registration ="+regModel);
		return regModel.getuserID();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<RegistrationModel> Login(RegistrationModel loginModel) {
		
		Session session= this.sessionFactory.getCurrentSession();
		String SQL_QUERY =" from RegistrationModel as o where o.email=? and o.userPassword=?";
		@SuppressWarnings("unchecked")
		TypedQuery<RegistrationModel> query = session.createQuery(SQL_QUERY);
		query.setParameter(0,loginModel.getEmail());
		query.setParameter(1,loginModel.getUserPassword());
		List<RegistrationModel> listUserdetails= query.getResultList();
		
		return listUserdetails;
	}
}
