/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DBconnection.connection;
import DBconnection.userDAO;
import Models.modelUser;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Este servlet controlara los Usuarios, verifiquen el web.xml
 * este es el primer archivo en llamarse, alli exsite un apartado llamado
 * welcome file list donde pueden colocar que archivo quieren que sea el primero
 * en ser cargado
 * en este momento es este
 * @author magoc
 */
@WebServlet(name = "User", urlPatterns = {"/User"})
@MultipartConfig(maxFileSize = 1000 * 1000 * 5, maxRequestSize = 1000 * 1000 * 25, fileSizeThreshold = 1000 * 1000)
public class User extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // Obtenemos los usuarios del DAO
//        List<UserModel> users = UserDAO.getUsers();
//        // Lo agregamos como atributo al request
//        request.setAttribute("users", users);
//        // Enviamos el request a index.jsp con la informacion
//        request.getRequestDispatcher("index.jsp").forward(request, response);
//    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtenemos el nombre debe coincidir con el name del input
        String name = request.getParameter("Name");
        // Obtenemos el contraseña debe coincidir con el name del input
        String password = request.getParameter("Password");       
        modelUser user = new modelUser(name, password,8);
        userDAO.insertUser(user);
        // Retornamos al index
        response.sendRedirect("profile.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
