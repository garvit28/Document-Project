package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Login;
@Repository
public class Login_DAO implements Login_DAOInterface{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Login> getLogin() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Login> query=currentSession.createQuery("from Login", Login.class);
		List<Login> list=query.getResultList();
		return list;
		
	}

	@Override
	public boolean saveLogin(Login login) {
		// TODO Auto-generated method stub
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(login);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}

	@Override
	public boolean deleteLogin(Login login) {
		// TODO Auto-generated method stub
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(login);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}

	@Override
	public List<Login> getLoginByID(Login login) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Login> query=currentSession.createQuery("from Login where Login_Id=:login_id", Login.class);
		query.setParameter("login_id", login.getLogin_Id());
		List<Login> list=query.getResultList();
		return list;
		
	}

	@Override
	public boolean updateLogin(Login login) {
		// TODO Auto-generated method stub
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(login);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}

}
