package DataAccessObject;

import java.util.List;

import org.springframework.stereotype.Repository;

import model.RegistrationModel;

@Repository
public interface RegistrationDAO {
	
	//Method to save data into database.
	public int Register(RegistrationModel regModel);
	
	//Method to save data into database.
	public List<RegistrationModel> Login(RegistrationModel loginModel);

}
