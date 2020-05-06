package com.iut.td_banque_rey;

import com.iut.td_banque_rey.dao.MySqlDaoClient;
import com.iut.td_banque_rey.models.Client;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		MySqlDaoClient instance = MySqlDaoClient.getInstance();
		instance.create(new Client("a", "a", "a"));
		instance.update(new Client("1","LOUIS","NICE"));
    }
}
