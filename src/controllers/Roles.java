/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Roles {
    private int idRol;
    private String rol;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    //METODOS DE BASES DE DATOS 
    public static String[] consultarRoles()
    {
        
        ConexionMySQL mysql = new ConexionMySQL();
        Connection conexion =  mysql.conectar();
        
        String consulta = "SELECT * FROM roles";
        String rolesBD[];
        String tmpRoles[]  = new String[0];
        
        Statement manejadorQuery;
        
        try 
        {
            manejadorQuery = conexion.createStatement();
            
            ResultSet resultados = manejadorQuery.executeQuery(consulta);
            
            resultados.last();
            int filas = resultados.getRow();
            
            resultados.beforeFirst();
            
            rolesBD = new String[filas];
            int i =0;
            while(resultados.next())
            {
                rolesBD[i]= resultados.getString("ROL");
                i++;
            }
          tmpRoles = rolesBD;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
        return tmpRoles;        
    }    
    
}
