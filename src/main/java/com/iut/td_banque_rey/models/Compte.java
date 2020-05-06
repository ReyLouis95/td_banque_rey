package com.iut.td_banque_rey.models;

public class Compte {
	
	protected double solde;
	protected String numCompte;
	protected String numClient;
	
	public Compte(double solde, String numCompte) {
		this.solde = solde;
		this.numCompte = numCompte;
	}
	
	public void debiter(double montant) {
		this.solde = solde - montant;
	}
	
	public void crediter(double montant) {
		this.solde = solde + montant;
	}
	
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public String getNumCompteString() {
		return numCompte;
	}
	public void setNumCompteString(String numCompteString) {
		this.numCompte = numCompteString;
	}
	
}
