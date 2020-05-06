package com.iut.td_banque_rey.interfaces;

import java.util.List;

public interface IDao<T> {

	void create(T objet);

	void update(T objet);

	void delete(T objet);

	T read();

	List<T> getList();
	
}


