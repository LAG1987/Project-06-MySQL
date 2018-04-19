/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;

/**
 *
 * @author Luis G
 */
public class ticketDatabase
{

    /**
     * @return the databaseName
     */
    public Connection getDatabaseName()
    {
        return databaseName;
    }

    /**
     * @param databaseName the databaseName to set
     */
    public void setDatabaseName(Connection databaseName)
    {
        this.databaseName = databaseName;
    }
    private Connection databaseName;
    
    private ticketDatabase()
    {
        try
        {
            
            this.databaseName = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ticketdatabase?useSSL=false",
                                "root", "Angel1987!");
            System.out.println("connection established");
            
        }catch(Exception e)
        {
            System.out.println("System did not connect");
        }
    }
    
    private static ticketDatabase singletonDatabase = new ticketDatabase();
    
    public static ticketDatabase getSingletonDatabase()
    {
        return singletonDatabase;
    }
    
}
