/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cordissignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ianse
 */
public class connectDB {

    public static Connection getConnection() { //starts connection between Java
        java.sql.Connection connection = null;
        try //open the connection to the MySQL server
        {
            System.out.println("CONNECT");
            Connection Connection = DriverManager.getConnection("jdbc:sqlite:cordissignup.db");
            System.out.println("CONNECTION MADE");
        } catch (SQLException e) //check for connection error
        {
            System.out.println("ERROR: MySQL Connection Failed!");
        }
        System.out.println("RETURN");
        return connection;

    }

}
