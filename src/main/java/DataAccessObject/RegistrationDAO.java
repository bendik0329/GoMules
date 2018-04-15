package DataAccessObject;

import model.RegistrationModel;

public interface RegistrationDAO {
	
	//Method to save data into db.
	public int Register(RegistrationModel regModel);

}
