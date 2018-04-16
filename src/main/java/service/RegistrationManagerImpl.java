package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Transactional;

import model.RegistrationModel;
import DataAccessObject.RegistrationDAO;

@Service
@Transactional
public class RegistrationManagerImpl implements RegistrationManager {

	@Autowired
	RegistrationDAO regisDAO;
	
	//Method to save data into db.
	@Override
	public int Register(RegistrationModel regModel) {
		
		return regisDAO.Register(regModel);
	}
}
