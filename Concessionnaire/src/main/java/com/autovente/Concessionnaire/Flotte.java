package com.autovente.Concessionnaire;

import java.util.ArrayList;

public class Flotte {

	
	private ArrayList<Vehicule> flotte;
	
	public Flotte() {
		this.flotte = new ArrayList<Vehicule>();
	}

	
	void addVehicule(Vehicule vehicule) {
		flotte.add(vehicule);
	}

	void addVehicule(String marque,String modele,int puissance,String couleur,int siege,float prix) {
		addVehicule(new Vehicule(marque,modele,puissance,couleur,siege,prix));
	}

	ArrayList<Vehicule> getFlotte(){
		return flotte;
	}


	@Override
	public String toString() {
		String s = "";
		for(Vehicule v : flotte)
		{
			s = v.toString();
		}
		return "Flotte = " + s ;
	}

}
