package com.example.demo;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MariaDBConnectionTest {

    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "rjsrkd";


    @Test
    public void testConnection() throws Exception{
        Class.forName(DRIVER);
        try(Connection cone = DriverManager.getConnection(URL, USER,PASSWORD)){
            System.out.println(cone);


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
