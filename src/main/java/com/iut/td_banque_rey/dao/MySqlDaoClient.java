package com.iut.td_banque_rey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.iut.td_banque_rey.connection.MySqlConnection;
import com.iut.td_banque_rey.interfaces.IClientDao;
import com.iut.td_banque_rey.models.Client;
import com.mysql.cj.exceptions.RSAException;

public class MySqlDaoClient implements IClientDao{

	private static MySqlDaoClient instance;
	private static Connection connection = MySqlConnection.getInstance();
	
	public MySqlDaoClient() {
		this.connection = MySqlConnection.getInstance();
	}
	
	public static MySqlDaoClient getInstance() {
		if(instance == null) {
			instance = new MySqlDaoClient();
		}
		return instance;
	}
	
	@Override
	public void create(Client objet) {
		String requete = "insert into client (nom, adresse) values (?, ?) ";
		try {
			PreparedStatement preparedStatement =connection.prepareStatement(requete);
			preparedStatement.setString(1, objet.getNom());
			preparedStatement.setString(2, objet.getAdresse());
		   	preparedStatement.execute();
		   	preparedStatement.close();
		} catch (SQLException e) {
		   e.printStackTrace();
		}
	}

	@Override
	public void update(Client objet) {
		String requete = "update client set nom = ?, adresse = ? where id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(requete);
			preparedStatement.setString(1, objet.getNom());
			preparedStatement.setString(2, objet.getAdresse());
			preparedStatement.setString(3, objet.getNumClient());
			preparedStatement.execute();
			preparedStatement.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
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
