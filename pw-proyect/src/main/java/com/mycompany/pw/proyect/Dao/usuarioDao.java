/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pw.proyect.Dao;

import com.mycompany.pw.proyect.Modelos.modeloUsuario;
import com.mycompany.pw.proyect.Utils.conexionDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mike_
 */
public class usuarioDao {
    
    public static int insertarUsuario(modeloUsuario usuario){
        try{
            Connection conn = conexionDB.getConnection();
            CallableStatement statement = conn.prepareCall("call sp_insertar_usuario(?,?,?,?,?,?)");
            statement.setString(1,usuario.getNombre());
            statement.setString(2,usuario.getApellido());
            statement.setString(3,usuario.getCorreo());
            statement.setString(4,usuario.getContrasenia());
            statement.setString(5,usuario.getNombreUsuario());
            statement.setString(6,usuario.getUrlImage());
            
            return statement.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            
        }
        return 0;
    }
    
}
