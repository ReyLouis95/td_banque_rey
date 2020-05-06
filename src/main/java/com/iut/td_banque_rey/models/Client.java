package com.iut.td_banque_rey.models;

public class Client {

	private String numClient;
	private String nom;
	private String adresse;
	
	public String getNumClient() {
		return numClient;
	}

	public void setNumClient(String numClient) {
		this.numClient = numClient;
	}

	public Client(String numClient, String nom, String adresse) {
		this.numClient = numClient;
		this.nom = nom;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}
