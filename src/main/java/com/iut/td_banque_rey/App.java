package com.iut.td_banque_rey;

import com.iut.td_banque_rey.dao.DaoClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		DaoClient instance = new DaoClient();
		instance.getClientById(42);
    }
}
