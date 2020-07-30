package DAO;

import java.util.List;


import Model.Login;

public interface Login_DAOInterface {
	
	public List<Login> getLogin();

	boolean saveLogin(Login login);

	boolean deleteLogin(Login login);

	List<Login> getLoginByID(Login login);

	boolean updateLogin(Login login);

}
