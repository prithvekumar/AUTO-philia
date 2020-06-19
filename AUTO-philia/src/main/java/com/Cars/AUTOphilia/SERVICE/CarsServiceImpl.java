package com.Cars.AUTOphilia.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Cars.AUTOphilia.DAO.CarsDaoImpl;
import com.Cars.AUTOphilia.Entities.*;

@Transactional
@Service
public class CarsServiceImpl implements CarsService {
	
	@Autowired
	CarsDaoImpl cd;
	

	@Override
	public List<Cars> findallcars() {
		return cd.findallcars();
	}

	@Override
	public List<Cars> findcarsbymodel(String model) {
		return cd.findcarsbymodel(model);
	}

	@Override
	public List<Cars> findallbybrand(String brand) {
		return cd.findallbybrand(brand);
	}

	@Override
	public List<Cars> findallbybudget(double start, double end) {
		return cd.findallbybudget(start,end);
	}

	@Override
	public List<Cars> findallbystring(String brand, String model, double budget) {
		return cd.findallbystring(brand, model, budget);
	}

	@Override
	public List<Colors> getcolorsbycarid(long carid) {
		return cd.getcolorsbycarid(carid);
	}

	@Override
	public List<EngineType> getvariantsbycarid(long carid) {
		return cd.getvariantsbycarid(carid);
	}

	@Override
	public List<Cars> getcardetailsbyid(long carid) {
		return cd.getcardetailsbyid(carid);
	}

	@Override
	public Long addtocomparetable(Compare car) {
		return cd.addtocomparetable(car);
	}

	@Override
	public List<Compare> getcomparedetails() {
		return cd.getcomparedetails();
	}

	public Long getcountofcompare() {
		return cd.getcountofcompare();
	}

	@Override
	public int removefromcompare(long carid) {
		return cd.removefromcompare(carid);
	}

	public List<Dealers> getdealers(String brand, String loc) {
		return cd.getdealers(brand, loc);
	}

	@Override
	public List<Usedcars> getusedcars(String brand, String loc) {
		return cd.getusedcars(brand, loc);
	}

	@Override
	public List<Usedcars> getusedcarsbymodel(String model, String loc) {
		return cd.getusedcarsbymodel(model, loc);
	}

	@Override
	public int valuateurcar(Valuate car) {
		return cd.valuateurcar(car);
	}

	@Override
	public int fixurcar(Fix car) {
		return cd.fixurcar(car);
	}

	@Override
	public List<Updates> updates() {
		return cd.updates();
	}
	
	
	

}
