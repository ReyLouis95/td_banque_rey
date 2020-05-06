package com.iut.td_banque_rey.models;

public class CompteAvecDecouvert extends Compte{

	private double decouvertAutorise;
	
	public CompteAvecDecouvert(double solde, String numCompte) {
		super(solde, numCompte);
	}
}
