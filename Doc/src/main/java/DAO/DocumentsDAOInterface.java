package DAO;

import java.util.List;

import Model.Documents;

public interface DocumentsDAOInterface {
	
	public List<Documents> getDocuments();

	List<Documents> getDocumentsByID(Documents docs);

	boolean updateDocuments(Documents docs);

	boolean deleteDocuments(Documents docs);

	boolean saveDocuments(Documents docs);

}
