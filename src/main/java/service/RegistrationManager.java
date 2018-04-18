package service;

import java.util.List;

import model.RegistrationModel;

public interface RegistrationManager {

	//Method to save data into db.
	public int Register(RegistrationModel regModel);
	
	//Method to save data into db.
	public List<RegistrationModel> Login(RegistrationModel loginModel);
}
