/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.reserva.resources;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author Luis Bernal
 */
public class Conexion {
    private Connection con;
    private String url,user,pass;

    public Connection getCon() {
        try{
            if(this.getDataConnection())
            {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                this.con=DriverManager.getConnection(this.url,this.user,this.pass);
            }
        }
        catch(Exception e)
        {
            System.err.println("Error al conectar "+e.getMessage());
        }
        return con;
    }
    private boolean getDataConnection()
    {
        boolean resp =true;
        try
        {
            Properties prop=new Properties();
            try(InputStream file=Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"))
                    {
                        prop.load(file);
                        this.url=prop.getProperty("url");
                        this.user=prop.getProperty("user");
                        this.pass=prop.getProperty("password");
                        
                    }
            catch(Exception e)
            {
                System.err.println("Error al leer el archivo de conexion "+e.getMessage());
            }
                    
        }
        catch(Exception e)
        {}
        return resp;
    }
    
}
