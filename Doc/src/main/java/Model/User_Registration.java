package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_registration")
public class User_Registration {
	
	@Id
	int User_Id;
	String User_name;
	String User_EmailId;
	int User_Mobno;
	String Address;
	String User_Type;
	
	
	
	
	public User_Registration() {
		
	}

	public User_Registration(int user_Id, String user_name, String user_EmailId, int user_Mobno, String address,
			String user_Type) {
		super();
		User_Id = user_Id;
		User_name = user_name;
		User_EmailId = user_EmailId;
		User_Mobno = user_Mobno;
		Address = address;
		User_Type = user_Type;
	
	}

	public int getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}

	public String getUser_name() {
		return User_name;
	}

	public void setUser_name(String user_name) {
		User_name = user_name;
	}

	public String getUser_EmailId() {
		return User_EmailId;
	}

	public void setUser_EmailId(String user_EmailId) {
		User_EmailId = user_EmailId;
	}

	public int getUser_Mobno() {
		return User_Mobno;
	}

	public void setUser_Mobno(int user_Mobno) {
		User_Mobno = user_Mobno;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getUser_Type() {
		return User_Type;
	}

	public void setUser_Type(String user_Type) {
		User_Type = user_Type;
	}
	

	
}
