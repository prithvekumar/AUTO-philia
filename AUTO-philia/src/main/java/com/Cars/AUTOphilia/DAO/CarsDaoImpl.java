package com.Cars.AUTOphilia.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.Cars.AUTOphilia.Entities.*;


@Transactional
@Repository
public class CarsDaoImpl implements CarsDao{
	

	@Autowired
	EntityManager em;
	

	@Override
	public List<Cars> findallcars() {
		String qStr = "SELECT p FROM Cars p";
		TypedQuery<Cars> query = em.createQuery(qStr,Cars.class);
		List<Cars> t = query.getResultList();
		System.out.println(t);
		return t;
		
	}

	@Override
	public List<Cars> findcarsbymodel(String model) {
		String qStr = "SELECT p FROM Cars p where p.amodel=:pmodel";
		TypedQuery<Cars> query = em.createQuery(qStr,Cars.class);
		query.setParameter("pmodel",model);
		List<Cars> t = query.getResultList();
		System.out.println(t);
		return t;
		
	}

	@Override
	public List<Cars> findallbybrand(String brand) {
		String qStr = "SELECT p FROM Cars p where p.abrand=:pbrand";
		TypedQuery<Cars> query = em.createQuery(qStr,Cars.class);
		query.setParameter("pbrand",brand);
		List<Cars> t = query.getResultList();
		System.out.println(t);
		return t;
		
	}

	@Override
	public List<Cars> findallbybudget(double start, double end) {
		String qStr = "SELECT p FROM Cars p where p.aprice between :pstart and :pend";
		TypedQuery<Cars> query = em.createQuery(qStr,Cars.class);
		query.setParameter("pstart",start);
		query.setParameter("pend",end);
		List<Cars> t = query.getResultList();
		System.out.println(t);
		return t;
	}

	@Override
	public List<Cars> findallbystring(String brand, String model, double budget) {
		String qStr = "SELECT p FROM Cars p where p.abrand like :pbrand and p.amodel like :pmodel and p.aprice between :pstart and :pend";
		TypedQuery<Cars> query = em.createQuery(qStr,Cars.class);
		if(brand.equals("Any")) {
			String x = "%";
			query.setParameter("pbrand",x);
		}
		else {
			query.setParameter("pbrand",brand);
		}
		
		query.setParameter("pmodel",model);
		query.setParameter("pstart",0.0);
		query.setParameter("pend",budget);
		List<Cars> t = query.getResultList();
		System.out.println(t);
		return t;
	}

	@Override
	public List<Colors> getcolorsbycarid(long carid) {
		String qStr = "SELECT p FROM Colors p where p.Carid = :pcarid";
		TypedQuery<Colors> query = em.createQuery(qStr,Colors.class);
		query.setParameter("pcarid",carid);
		List<Colors> t = query.getResultList();
		System.out.println(t);
		return t;
	}

	@Override
	public List<EngineType> getvariantsbycarid(long carid) {
		String qStr = "SELECT p FROM EngineType p where p.Carid = :pcarid";
		TypedQuery<EngineType> query = em.createQuery(qStr,EngineType.class);
		query.setParameter("pcarid",carid);
		List<EngineType> t = query.getResultList();
		System.out.println(t);
		return t;
	}

	@Override
	public List<Cars> getcardetailsbyid(long carid) {
		String qStr = "SELECT p FROM Cars p where p.acarid=:pid";
		TypedQuery<Cars> query = em.createQuery(qStr,Cars.class);
		query.setParameter("pid",carid);
		List<Cars> t = query.getResultList();
		System.out.println(t);
		return t;
	}

	@Override
	public Long addtocomparetable(Compare car) {
		em.persist(car);
		String qStr = "SELECT count(p) FROM Compare p";
		Query query = em.createQuery(qStr);
		Long t = (Long) query.getSingleResult();
		System.out.println(t);
		return t;
	}

	@Override
	public List<Compare> getcomparedetails() {
		String qStr = "SELECT p FROM Compare p";
		TypedQuery<Compare> query = em.createQuery(qStr,Compare.class);
		List<Compare> t = query.getResultList();
		return t;
	}

	@Override
	public Long getcountofcompare() {
		String qStr = "SELECT count(p) FROM Compare p";
		Query query = em.createQuery(qStr);
		Long t = (Long) query.getSingleResult();
		System.out.println(t);
		return t;
	}

	@Override
	public int removefromcompare(long carid) {
		em.remove(em.find(Compare.class, carid));
		return 1;
	}

	@Override
	public List<Dealers> getdealers(String brand, String loc) {
		String qStr = "SELECT p FROM Dealers p where p.daddress =:ploc and p.dbrand like :pbrand";
		TypedQuery<Dealers> query = em.createQuery(qStr,Dealers.class);
		query.setParameter("ploc",loc);
		if(brand.equals("Any")) {
			String x = "%";
			query.setParameter("pbrand",x);
		}
		else {
			query.setParameter("pbrand",brand);
		}
		List<Dealers> t = query.getResultList();
		return t;
	}

	@Override
	public List<Usedcars> getusedcars(String brand, String loc) {
		String qStr = "SELECT p FROM Usedcars p where p.loc =:ploc and p.brand like :pbrand";
		TypedQuery<Usedcars > query = em.createQuery(qStr,Usedcars.class);
		query.setParameter("ploc",loc);
		if(brand.equals("Any")) {
			String x = "%";
			query.setParameter("pbrand",x);
		}
		else {
			query.setParameter("pbrand",brand);
		}
		List<Usedcars> t = query.getResultList();
		return t;
	}

	@Override
	public List<Usedcars> getusedcarsbymodel(String model, String loc) {
		String qStr = "SELECT p FROM Usedcars p where p.loc =:ploc and p.model like :pmodel";
		TypedQuery<Usedcars > query = em.createQuery(qStr,Usedcars.class);
		query.setParameter("ploc",loc);
		if(model.equals("Any")) {
			String x = "%";
			query.setParameter("pmodel",x);
		}
		else {
			query.setParameter("pmodel",model);
		}
		List<Usedcars> t = query.getResultList();
		return t;
	}

	@Override
	public int valuateurcar(Valuate car) {
		em.persist(car);
		return 1;
	}

	@Override
	public int fixurcar(Fix car) {
		em.persist(car);
		return 1;
	}

	@Override
	public List<Updates> updates() {
		String qStr = "SELECT p FROM Updates p";
		TypedQuery<Updates> query = em.createQuery(qStr,Updates.class);
		List<Updates> t = query.getResultList();
		return t;
	}
	
	
	

}
