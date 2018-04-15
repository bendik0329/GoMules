package service;

import model.RegistrationModel;

public interface RegistrationManager {

	//Method to save data into db.
	public int Register(RegistrationModel regModel);
}
