package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_Roles")
public class User_Roles {

	@Id
	int Role_Id;
	String Role_Name;
	
	
	public User_Roles() {
		
	}
	public User_Roles(int role_Id, String role_Name) {
		super();
		Role_Id = role_Id;
		Role_Name = role_Name;
	}
	public int getRole_Id() {
		return Role_Id;
	}
	public void setRole_Id(int role_Id) {
		Role_Id = role_Id;
	}
	public String getRole_Name() {
		return Role_Name;
	}
	public void setRole_Name(String role_Name) {
		Role_Name = role_Name;
	}
	
	
}
