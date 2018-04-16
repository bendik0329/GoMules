package DataAccessObject;

import org.springframework.stereotype.Repository;

import model.RegistrationModel;

@Repository
public interface RegistrationDAO {
	
	//Method to save data into database.
	public int Register(RegistrationModel regModel);

}
