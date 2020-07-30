package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import DAO.DocumentsDAO;
//import DAO.Login_DAO;
import DAO.User_RegistrationDAO;
//import DAO.User_RolesDAO;
//import Model.Documents;
//import Model.Login;
//import Model.User_Registration;
//import Model.User_Roles;
import Model.User_Registration;

@Service
@Transactional
public class ServiceLayer {

	@Autowired
	private User_RegistrationDAO user_registrationDAO;
	
	
	
	public List<User_Registration> getUser_Registration() {
		return user_registrationDAO.getUser_Registration();

	}

	
	public boolean saveUser_Registration(User_Registration ur) {
		return user_registrationDAO.saveUser_Registration(ur);

	}

	
	public boolean deleteUser_Registration(User_Registration ur) {
		return user_registrationDAO.deleteUser_Registration(ur);

	}

	
	public List<User_Registration> getUser_RegistrationByID(User_Registration ur) {
		return user_registrationDAO.getUser_RegistrationByID(ur);

	}

	
	public boolean updateUser_Registration(User_Registration ur) {
		return user_registrationDAO.updateUser_Registration(ur);

	}
	//================================================================================//
	
/*	@Autowired
	private DocumentsDAO documentsDAO;
	
	
	public List<Documents> getDocuments() {
		return documentsDAO.getDocuments();

	}

	
	public boolean saveDocuments(Documents docs) {
		return documentsDAO.saveDocuments(docs);

	}

	
	public boolean deleteDocuments(Documents docs) {
		return documentsDAO.deleteDocuments(docs);

	}

	
	public List<Documents> getDocumentsByID(Documents docs) {
		return documentsDAO.getDocumentsByID(docs);

	}

	
	public boolean updateDocuments(Documents docs) {
		return documentsDAO.updateDocuments(docs);

	}
	
//====================================================================================//
	
	
	
	@Autowired
	private User_RolesDAO user_rolesDAO;
	
	
	
	public List<User_Roles> getUser_Roles() {
		return user_rolesDAO.getUser_Roles();

	}

	
	public boolean saveUser_Roles(User_Roles ur) {
		return user_rolesDAO.saveUser_Roles(ur);

	}

	
	public boolean deleteUser_Roles(User_Roles ur) {
		return user_rolesDAO.deleteUser_Roles(ur);

	}

	
	public List<User_Roles> getUser_RolesByID(User_Roles ur) {
		return user_rolesDAO.getUser_RolesByID(ur);

	}

	
	public boolean updateUser_Roles(User_Roles ur) {
		return user_rolesDAO.updateUser_Roles(ur);

	}
	//=========================================================================================================//
	
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

	
	public boolean updateLogin(Login ur) {
		return loginDAO.updateLogin(ur);

	}*/
}
