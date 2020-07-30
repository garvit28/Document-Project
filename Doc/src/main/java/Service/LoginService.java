package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Login_DAO;
import Model.Login;

@Service
@Transactional
public class LoginService {

	@Autowired
	private Login_DAO loginDAO;
	
	
	
	public List<Login> getLogin() {
		return loginDAO.getLogin();

	}

	
	public boolean saveLogin(Login login) {
		return loginDAO.saveLogin(login);

	}

	
	public boolean deleteLogin(Login login) {
		return loginDAO.deleteLogin(login);

	}

	
	public List<Login> getLoginByID(Login login) {
		return loginDAO.getLoginByID(login);
	}

	
	public boolean updateLogin(Login login) {
		return loginDAO.updateLogin(login);

	}
	
	
}
