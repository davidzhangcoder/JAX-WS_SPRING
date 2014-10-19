package com.dz.common;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.dz.configurable.ConfigurableBase;

public class DAOImpl implements IDAO {
	
	//http://open-open2009.iteye.com/blog/528140 JPA SPRING 泛型DAO 

	// private static EntityManagerFactory emf;
	//
	// private static ThreadLocal<EntityManager> em;
	//
	// public EntityManager getEntityManager() {
	// EntityManager manager = em.get();
	// if (manager == null) {
	// manager = emf.createEntityManager();
	// em.set(manager);
	// }
	// return manager;
	// }

	@PersistenceContext
	private EntityManager em;

	// public boolean del(Object obj) {
	// getEntityManager().getTransaction().begin();
	// if (!getEntityManager().contains(obj))
	// obj = getEntityManager().merge(obj);
	// getEntityManager().remove(obj);
	// getEntityManager().getTransaction().commit();
	// return true;
	// }

	public int execute(String sql)
	{
		return execute(sql, null);
	}

	public int execute(String sql, Collection paras) {
		Query query = em.createNativeQuery(sql);
		int parameterIndex = 0;
		if (paras != null && paras.size() > 0) {
			for (Object obj : paras) {
				query.setParameter(parameterIndex++, obj);
			}
		}
		return query.executeUpdate();
	}
	
	 public <T extends ConfigurableBase> T get(Class<T> clz, Serializable id)
	 {
	 return em.find(clz, id);
	 }

	public <T extends ConfigurableBase> T getBy(Class<T> clz, String fieldName, Serializable value) {
		Query query = em.createQuery("from " + clz + " where fieldName=?");
		query.setParameter(0, value);
		return (T) query.getSingleResult();
	}

	public List query(Class clz, String scope) {
		return query(clz, scope, null);
	}

	public List query(Class clz, String scope, Collection paras) {
		return query(clz, scope, null, -1, -1);
	}

	public List query(Class clz, String scope, Collection paras, int begin,
			int max) 
	{
		Query query = em.createQuery("from " + clz + " where " + scope);
		int parameterIndex = 0;
		if (paras != null && paras.size() > 0) {
			for (Object obj : paras) {
				query.setParameter(parameterIndex++, obj);
			}
		}
		if (begin >= 0 && max > 0) {
			query.setFirstResult(begin);
			query.setMaxResults(max);
		}
		return query.getResultList();
	}

	// @Transactional(value = "transactionManager", propagation =
	// Propagation.REQUIRED)
	public <T extends ConfigurableBase> T save(T base) {
		em.persist(base);
		return base;

	}

	// public Object uniqueResult(String sql) {
	// return uniqueResult(sql, null);
	// }
	//
	// public Object uniqueResult(String sql, Collection paras) {
	// Query query = getEntityManager().createQuery(sql);
	// int parameterIndex = 0;
	// if (paras != null && paras.size() > 0) {
	// for (Object obj : paras) {
	// query.setParameter(parameterIndex++, obj);
	// }
	// }
	// return query.getSingleResult();
	// }
	//
	// public boolean update(Object obj) {
	// getEntityManager().getTransaction().begin();
	// getEntityManager().merge(obj);
	// getEntityManager().getTransaction().commit();
	// return true;
	// }
}