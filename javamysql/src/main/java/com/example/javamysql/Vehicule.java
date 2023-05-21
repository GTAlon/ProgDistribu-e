package com.example.javamysql;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicule {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	private String marque;
	private String modele;
	private int puissance;
	private String couleur;
	private int siege;
	private float prix;
	
	public Vehicule(String marque,String modele,int puissance,String couleur,int siege,float prix) {
		this.marque = marque;
		this.modele = modele;
		this.puissance = puissance;
		this.couleur = couleur;
		this.siege = siege;
		this.prix = prix;
		}

	
	public Vehicule() {

		}
	
	@Override
	public String toString() {
		return "Flotte [marque=" + marque + ", modele=" + modele + ", puissance=" + puissance + ", couleur=" + couleur
				+ ", siege=" + siege + ", prix=" + prix + "€]";
	}
	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public int getPuissance() {
		return puissance;
	}


	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}


	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public int getSiege() {
		return siege;
	}


	public void setSiege(int siege) {
		this.siege = siege;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}
}
