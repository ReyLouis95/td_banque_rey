package com.iut.td_banque_rey.dao;

import java.sql.Connection;
import java.util.List;

import com.iut.td_banque_rey.connection.MySqlConnection;
import com.iut.td_banque_rey.interfaces.IClientDao;
import com.iut.td_banque_rey.models.Client;


public class DaoClient implements IClientDao{

private Connection db = null;
	
	public DaoClient() {
		this.db = MySqlConnection.getInstance();
	}
	
	@Override
	public void create(Client objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Client objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Client objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClientById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
