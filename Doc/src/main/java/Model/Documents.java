package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Documents")
public class Documents {
	
	@Id
	int Document_Id;
	String Document_Name;
	String Document_Creation_date;
	String Document_Size;
	
	
	public Documents() {
	
	}
	public Documents(int document_Id, String document_Nmae, String document_Creation_date, String document_Size) {
		super();
		Document_Id = document_Id;
		Document_Name = document_Nmae;
		Document_Creation_date = document_Creation_date;
		Document_Size = document_Size;
	}
	public int getDocument_Id() {
		return Document_Id;
	}
	public void setDocument_Id(int document_Id) {
		Document_Id = document_Id;
	}
	public String getDocument_Name() {
		return Document_Name;
	}
	public void setDocument_Name(String document_Nmae) {
		Document_Name = document_Nmae;
	}
	public String getDocument_Creation_date() {
		return Document_Creation_date;
	}
	public void setDocument_Creation_date(String document_Creation_date) {
		Document_Creation_date = document_Creation_date;
	}
	public String getDocument_Size() {
		return Document_Size;
	}
	public void setDocument_Size(String document_Size) {
		Document_Size = document_Size;
	}

	
}
