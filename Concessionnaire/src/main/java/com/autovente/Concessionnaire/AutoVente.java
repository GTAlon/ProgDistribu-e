package com.autovente.Concessionnaire;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoVente {

	Flotte flotte = new Flotte();
	Vehicule v1 = new Vehicule("Mercedes","Classe A",306,"Noir",5,45000);
	
	public AutoVente() {
		flotte.addVehicule(v1);
	}

	//@RequestMapping(path = "/hello", method = RequestMethod.GET)
	@GetMapping("/")
	public String test() {
		AutoVente auto = new AutoVente();
		return flotte.toString();
	}
	public static void main(String[] args) {		
	}

}
