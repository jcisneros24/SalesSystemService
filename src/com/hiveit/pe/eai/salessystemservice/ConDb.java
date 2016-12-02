package com.hiveit.pe.eai.salessystemservice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConDb {
     public Connection getConnection()  {
        Connection con = null;
        String conector = "com.mysql.jdbc.Driver";                  
        String server = "localhost";
        String port = "3306";
        String db = "Dbss";
        String user = "root";
        String password = "";        
        String url = "jdbc:mysql://"+server+":"+port+"/"+db;
        
        try{
            Class.forName(conector);
            con= DriverManager.getConnection(url, user, password);           
            
        	}catch (final SQLException e) {
        		con=null;
	            if(e.getErrorCode() == 0){
	                JOptionPane.showMessageDialog(null, "El servidor de base de datos no responde.\n"
	                                                    + "Verifique que el servidor de base de datos este activo.\n"
	                                                    + "Tambien Verifique que exista la base de datos Dbss", 
	                                                    "Error: Coneccion Fallida.", JOptionPane.ERROR_MESSAGE);
	            }
        	}catch (final ClassNotFoundException e) {
        		con=null;
            	//throw new SQLException("Error de conexion:" + e.getMessage());
        	} 
        return con;
    }
}
