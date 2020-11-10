/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBconnection;
import Models.modelUser;
import DBconnection.connection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mike_
 * 
 * @param user
 * @return 
 */
public class userDAO {
    /**
     * Inserta un usuario en la base de datos
     *
     * @param user
     * @return
     */
    public static int insertUser(modelUser user) {
        try {
            Connection con = connection.getConnection();
            // En el proyecto solo podran hacer uso de Store Procedures
            // No llamadas directas como esta
            // Esta linea prepara la llamada a la base de datos para insertar
            // Cada ? significa un valor a ser remplazado
            CallableStatement statement = con.prepareCall("INSERT INTO user (userID, userName, userPwd) VALUES (?,?,?)");
            //Primero para el id del usuario
            statement.setInt(1, user.getId());
            // Remplazamos el primer parametro por el nombre
            statement.setString(2, user.getUserName());
            // El tercero por la contraseña
            statement.setString(3, user.getPwd());
            // El ultimo por la url de la imagen
           // statement.setString(3, user.getUrlImage());
            // Ejecuta el Statement y retorna cuantos registros
            // fueron actualizados
            return statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("hasta aqui llegue");
        } finally {
        }
        return 0;
    }

//    public static List<UserModel> getUsers() {
//        List<UserModel> users = new ArrayList<>();
//        try {
//            Connection con = DbConnection.getConnection();
//            CallableStatement statement = con.prepareCall("SELECT * FROM user");
//            ResultSet resultSet = statement.executeQuery();
//            // Si el resultSet tiene resultados lo recorremos
//            while (resultSet.next()) {
//                // Obtenemos el valor del result set en base al nombre de la
//                // columna
//                String name = resultSet.getString("nameUser");
//                String password = resultSet.getString("password");
//                String urlImage = resultSet.getString("urlImage");
//                // Agregamos el usuario a la lista
//                users.add(new UserModel(name, password, urlImage));
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            return users;
//        }
//    }
}
