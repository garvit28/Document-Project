package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import Model.User_Registration;

@Repository
public class User_RegistrationDAO implements User_RegistrationDAOInterface{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User_Registration> getUser_Registration() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query<User_Registration> query=currentSession.createQuery("from User_Registration", User_Registration.class);
		List<User_Registration> list=query.getResultList();
		return list;
	}

	@Override
	public boolean saveUser_Registration(User_Registration ur) {
		// TODO Auto-generated method stub
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(ur);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return status;
		
	}

	@Override
	public boolean deleteUser_Registration(User_Registration ur) {
		// TODO Auto-generated method stub
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(ur);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}

	@Override
	public List<User_Registration> getUser_RegistrationByID(User_Registration ur) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query<User_Registration> query=currentSession.createQuery("from User_Registration where User_id=:user_id", User_Registration.class);
		query.setParameter("user_id", ur.getUser_Id());
		List<User_Registration> list=query.getResultList();
		return list;
		
	}

	@Override
	public boolean updateUser_Registration(User_Registration ur) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(ur);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}

}
