package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DataAccessObject.RegistrationDAO;
import model.RegistrationModel;

@Service
public class RegistrationManagerImpl implements RegistrationManager {

	@Autowired
	RegistrationDAO regisDAO;
	
	//Method to save data into db.
	public int Register(RegistrationModel regModel) {
		
		return regisDAO.Register(regModel);
		
	}
}
