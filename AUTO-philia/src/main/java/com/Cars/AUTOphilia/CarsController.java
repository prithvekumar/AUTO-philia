package com.Cars.AUTOphilia;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Cars.AUTOphilia.SERVICE.CarsServiceImpl;
import com.Cars.AUTOphilia.Entities.*;

@ControllerAdvice
@RestController
@CrossOrigin(origins = "*")
public class CarsController {

	@Autowired
	CarsServiceImpl carservice;
	
	@GetMapping(path="/findall")
	public List<Cars> findall(){
		return carservice.findallcars();
	}
	
	@GetMapping(path="/findallbymodel/{model}")
	public List<Cars> findallbymodel(@PathVariable String model){
		return carservice.findcarsbymodel(model);
	}
	
	@GetMapping(path="/findallbybrand/{brand}")
	public List<Cars> findallbybrand(@PathVariable String brand){
		return carservice.findallbybrand(brand);
	}
	
	@GetMapping(path="/findallbybudget/{start}/{end}")
	public List<Cars> findallbybudget(@PathVariable double start,@PathVariable double end){
		return carservice.findallbybudget(start, end);
	}
	
	@GetMapping(path="/findallbystring/{brand}/{model}/{budget}")
	public List<Cars> findallbystring(@PathVariable String brand,@PathVariable String model,@PathVariable double budget){
		return carservice.findallbystring(brand, model, budget);
	}
	
	@GetMapping(path="/getcolorsbyid/{carid}")
	public List<Colors> getcolorsbyid(@PathVariable long carid){
		return carservice.getcolorsbycarid(carid);
	}
	
	@GetMapping(path="/getvariantsbyid/{carid}")
	public List<EngineType> getvariantsbyid(@PathVariable long carid){
		return carservice.getvariantsbycarid(carid);
	}
	
	@GetMapping(path="/getcardetails/{carid}")
	public List<Cars> getcardetails(@PathVariable long carid){
		return carservice.getcardetailsbyid(carid);
	}
	
	@PostMapping(path="/addtocomparetable")
	public Long addtocomparetable(@RequestBody Cars car){
		Compare comp = new Compare(car);
		return carservice.addtocomparetable(comp);
		
	}
	
	@GetMapping(path="/getcomparedetails")
	public List<Compare> getcardetails(){
		return carservice.getcomparedetails();
	}
	
	@GetMapping(path="/getcountofcompare")
	public Long getcountofcompare(){
		return carservice.getcountofcompare();
	}
	
	@GetMapping(path="/removefromcompare/{carid}")
	public int removefromcompare(@PathVariable long carid){
		return carservice.removefromcompare(carid);
	}
	
	@GetMapping(path="/getdealers/{brand}/{loc}")
	public List<Dealers> getdealers(@PathVariable String brand,@PathVariable String loc){
		return carservice.getdealers(brand,loc);
	}
	
	@GetMapping(path="/getusedcars/{brand}/{loc}")
	public List<Usedcars> getusedcars(@PathVariable String brand,@PathVariable String loc){
		return carservice.getusedcars(brand,loc);
	}
	
	@GetMapping(path="/getusedcarsbymodel/{model}/{loc}")
	public List<Usedcars> getusedcarsbymodel(@PathVariable String model,@PathVariable String loc){
		return carservice.getusedcarsbymodel(model,loc);
	}
	
	@PostMapping(path="/valuateurcar")
	public int valuateurcar(@RequestBody Valuate car){
		return carservice.valuateurcar(car);
	}
	
	@PostMapping(path="/fixurcar")
	public int fixurcar(@RequestBody Fix car){
		return carservice.fixurcar(car);
	}
	
	@GetMapping(path="/updates")
	public List<Updates> updates(){
		return carservice.updates();
	}
}
