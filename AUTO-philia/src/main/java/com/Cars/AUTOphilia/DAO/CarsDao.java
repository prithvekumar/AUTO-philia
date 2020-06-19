package com.Cars.AUTOphilia.DAO;

import java.util.List;
import com.Cars.AUTOphilia.Entities.*;

public interface CarsDao {
	
	public List<Cars> findallcars();
	
	public List<Cars> findallbybudget(double start, double end);
	
	public List<Cars> findcarsbymodel(String model);
	
	public List<Cars> findallbybrand(String brand);
	
	public List<Cars> findallbystring(String brand,String model,double budget);
	
	public List<Colors> getcolorsbycarid(long carid);
	
	public List<EngineType> getvariantsbycarid(long carid);
	
	public List<Cars> getcardetailsbyid(long carid);
	
	public Long addtocomparetable(Compare car);
	
	public List<Compare> getcomparedetails();
	
	public Long getcountofcompare();
	
	public List<Dealers> getdealers(String brand, String loc);
	
	public int removefromcompare(long carid);
	
	public List<Usedcars> getusedcars(String brand, String loc);
	
	public List<Usedcars> getusedcarsbymodel(String model, String loc);
	
	public int valuateurcar(Valuate car);

	public int fixurcar(Fix car);
	
	public List<Updates> updates();
	
	
}
