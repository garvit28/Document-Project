package com.main.Doc;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Documents;
import Model.Login;
import Model.User_Registration;
import Model.User_Roles;
import Service.DocumentsService;
import Service.LoginService;
import Service.ServiceLayer;
import Service.User_rolesService;


@RestController
//@CrossOrigin(origins="*")
@RequestMapping(value="/apii")
public class FirstController {


	@Autowired
	private ServiceLayer serviceLayer;
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private User_rolesService user_rolesService;
	
	@Autowired
	private DocumentsService documentService;
	
	
	@PostMapping("/save-user")
	public boolean saveUser_Registration(@RequestBody User_Registration ur) {
		 return serviceLayer.saveUser_Registration(ur);
		
	}
	
	@GetMapping("user-list")
	public List<User_Registration> allUsers() {
		 return serviceLayer.getUser_Registration();
	}
	
	
	
	@DeleteMapping("delete-user/{User_Id}")
	public boolean deleteStartup(@PathVariable("User_Id") int user_id,User_Registration ur) {
		ur.setUser_Id(user_id);
		return serviceLayer.deleteUser_Registration(ur);
	}

	
	

	@GetMapping("/user/{User_Id}")
	public List<User_Registration> alluserByID(@PathVariable("User_Id") int user_id,User_Registration ur) {
		ur.setUser_Id(user_id);
		 return serviceLayer.getUser_RegistrationByID(ur);
		
	}
	
	
	
	
	
	@PostMapping("/update-user/{User_Id}")
	public boolean updateStartup(@RequestBody User_Registration ur,@PathVariable("User_id") int user_id) {
		ur.setUser_Id(user_id);
		return serviceLayer.updateUser_Registration(ur);
	}
	
	//=====================================================================================================//

	@PostMapping("/save-userrole")
	public boolean saveUser_Roles(@RequestBody User_Roles ur) {
		 return user_rolesService.saveUser_Roles(ur);
		
	}
	
	
	@DeleteMapping("delete-userroles/{Role_Id}")
	public boolean deleteUser_Roles(@PathVariable("Role_Id") int role_id,User_Roles ur) {
		ur.setRole_Id(role_id);
		return user_rolesService.deleteUser_Roles(ur);
	}

		
	
	@PostMapping("/update-userrole/{Role_Id}")
	public boolean updateUser_Roles(@RequestBody User_Roles ur,@PathVariable("Role_Id") int role_id) {
		ur.setRole_Id(role_id);
		return user_rolesService.updateUser_Roles(ur);
	}
	
	
	@PostMapping("/save-login")
	public boolean saveLogin(@RequestBody Login login) {
		 return loginService.saveLogin(login);
		
	}
	
	

	@DeleteMapping("delete-login/{Login_Id}")
	public boolean deletelogin(@PathVariable("login_Id") int login_id,Login login) {
		login.setLogin_Id(login_id);
		return loginService.deleteLogin(login);
	}

	
	

	@GetMapping("/login/{login_Id}")
	public List<Login> LoginByID(@PathVariable("login_Id") int login_id,Login login) {
		login.setLogin_Id(login_id);
		 return loginService.getLoginByID(login);
		
	}
	
	
	
	
	
	@PostMapping("/update-login/{Login_Id}")
	public boolean updateLogin(@RequestBody Login login,@PathVariable("Login_id") int login_id) {
		login.setLogin_Id(login_id);
		return loginService.updateLogin(login);
	}
	
	

	@PostMapping("/save-Docs")
	public boolean saveDocuments(@RequestBody Documents docs) {
		 return documentService.saveDocuments(docs);
		
	}
	
	@GetMapping("docs-list")
	public List<Documents> allDocuments() {
		 return documentService.getDocuments();
	}
	
	
	
	@DeleteMapping("delete-docs/{Document_Id}")
	public boolean deleteDocuments(@PathVariable("Document_Id") int document_id,Documents docs) {
		docs.setDocument_Id(document_id);
		return documentService.deleteDocuments(docs);
	}

	
	

	@GetMapping("/docs/{Document_Id}")
	public List<Documents> DocumentsByID(@PathVariable("Document_Id") int document_id,Documents docs) {
		docs.setDocument_Id(document_id);
		 return documentService.getDocumentsByID(docs);
		
	}
	
	
	
	
	
	@PostMapping("/update-docs/{Document_Id}")
	public boolean updateDocument(@RequestBody Documents docs,@PathVariable("Document_id") int document_id) {
		docs.setDocument_Id(document_id);
		return documentService.updateDocuments(docs);
	}
	
	
}
