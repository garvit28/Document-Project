package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.DocumentsDAO;
import Model.Documents;

@Service
@Transactional
public class DocumentsService {
	@Autowired
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
}
