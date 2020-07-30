package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.User_Roles;

@Repository
public class User_RolesDAO implements User_RolesDAOinterface {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User_Roles> getUser_Roles() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<User_Roles> query=currentSession.createQuery("from User_Roles", User_Roles.class);
		List<User_Roles> list=query.getResultList();
		return list;
	}

	@Override
	public List<User_Roles> getUser_RolesByID(User_Roles ur) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<User_Roles> query=currentSession.createQuery("from User_Roles where Role_Id=:role_id", User_Roles.class);
		query.setParameter("role_id", ur.getRole_Id());
		List<User_Roles> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateUser_Roles(User_Roles ur) {
		// TODO Auto-generated method stub
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(ur);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
		
	}

	@Override
	public boolean deleteUser_Roles(User_Roles ur) {
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
	public boolean saveUser_Roles(User_Roles ur) {
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

}
