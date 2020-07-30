package DAO;

import java.util.List;


import Model.User_Registration;

public interface User_RegistrationDAOInterface {
	
	public List<User_Registration> getUser_Registration();

	List<User_Registration> getUser_RegistrationByID(User_Registration ur);

	boolean updateUser_Registration(User_Registration ur);

	boolean deleteUser_Registration(User_Registration ur);

	boolean saveUser_Registration(User_Registration ur);
}
