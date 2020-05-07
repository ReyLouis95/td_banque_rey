package com.iut.td_banque_rey.models;

import org.junit.Before;

public class TestCompte {

	private Compte compteAvec;
	private Compte compteSans;
	
	@Before
	public void setUp() {
		compteAvec = new CompteAvecDecouvert(100000, "2", 40);
		compteSans = new CompteSansDecouvert(5000, "3");
	}
}
