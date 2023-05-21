package com.autovente.Concessionnaire;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoVente {

	Flotte flotte = new Flotte();
	Vehicule v1 = new Vehicule("Mercedes","Classe A",306,"Noir",5,45000);
	Vehicule v2 = new Vehicule("Audi","S3",310,"Blanc",5,35000);
	Vehicule v3 = new Vehicule("BMW","Serie 1",300,"Noir",5,47000);

	
	public AutoVente() {
		flotte.addVehicule(v1);
	}

	//@GetMapping("/")
	@RequestMapping(path = "/autovente", method = RequestMethod.GET)
	public String autovente() {
		AutoVente auto = new AutoVente();
		return flotte.toString();
	}
	public static void main(String[] args) {		
	}

}
