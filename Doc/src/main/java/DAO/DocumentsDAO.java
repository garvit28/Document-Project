package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Documents;

@Repository
public class DocumentsDAO implements DocumentsDAOInterface {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Documents> getDocuments() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Documents> query=currentSession.createQuery("from Documents", Documents.class);
		List<Documents> list=query.getResultList();
		return list;
		
	}

	@Override
	public List<Documents> getDocumentsByID(Documents docs) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Documents> query=currentSession.createQuery("from Documents where Document_Id=:role_id", Documents.class);
		query.setParameter("document_id", docs.getDocument_Id());
		List<Documents> list=query.getResultList();
		return list;
		}

	/*@Override
	public boolean updateDocuments(Documents docs) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(docs);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}*/

	@Override
	public boolean deleteDocuments(Documents docs) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(docs);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean saveDocuments(Documents docs) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(docs);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return status;
	}

/*	public boolean updateDocuments(Documents docs) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(docs);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}*/

	public boolean updateDocuments(Documents docs) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(docs);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
