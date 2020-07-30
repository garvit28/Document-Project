package DAO;

import java.util.List;

import Model.User_Roles;

public interface User_RolesDAOinterface {
	
	public List<User_Roles> getUser_Roles();

	List<User_Roles> getUser_RolesByID(User_Roles ur);

	boolean updateUser_Roles(User_Roles ur);

	boolean deleteUser_Roles(User_Roles ur);

	boolean saveUser_Roles(User_Roles ur);

}
