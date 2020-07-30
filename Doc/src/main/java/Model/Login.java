package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {

	@Id
	int Login_Id;
	String Username;
	String Password;
	
	
	
	public Login() {
		
	}

	public Login(int login_Id, String username, String password) {
		super();
		Login_Id = login_Id;
		Username = username;
		Password = password;
	}
	
	public int getLogin_Id() {
		return Login_Id;
	}
	public void setLogin_Id(int login_Id) {
		Login_Id = login_Id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	
}
