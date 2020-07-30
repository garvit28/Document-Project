package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.User_RolesDAO;
import Model.User_Roles;

@Service
@Transactional
public class User_rolesService {
	

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

}
