package br.com.fiap.helper;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fiap.util.HibernateUtil;

public class GenericDaoImpl<T extends Serializable> extends GenericDao<T>{

	protected final Class<T> entityClass;
	Session session = null;
	Transaction transaction = null;
	
	
	public void openSessionAndBeginTransaction(){
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		transaction = session.beginTransaction();
	}
	
	
	public GenericDaoImpl(Class<T> clazz) {
		this.entityClass = clazz;
	}
	
	
	@Override
	public void create( T t ) {
		try {
			openSessionAndBeginTransaction();
			session.save( t );
			transaction.commit();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings( "unchecked" )
	@Override
	public T read( T t ) {
		try {
			openSessionAndBeginTransaction();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		return (T)session.load( entityClass, t);
	}

	@Override
	public void update( T t ) {
		openSessionAndBeginTransaction();
		session.merge( t );
		transaction.commit();
	}

	@Override
	public void delete( T t ) {
		openSessionAndBeginTransaction();
		session.delete( t );
		transaction.commit();
	}

	@Override
	public List<T> listAll() {
		openSessionAndBeginTransaction();
		return session.createCriteria( entityClass ).list();
	}
}
