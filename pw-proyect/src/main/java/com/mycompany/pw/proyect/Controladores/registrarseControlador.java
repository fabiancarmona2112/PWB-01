/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pw.proyect.Controladores;

import com.mycompany.pw.proyect.Dao.usuarioDao;
import com.mycompany.pw.proyect.Modelos.modeloUsuario;
import com.mycompany.pw.proyect.Utils.fileUtils;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author mike_
 */
@WebServlet(name = "registrarseControlador", urlPatterns = {"/registrarseControlador"})
@MultipartConfig(maxFileSize = 1000 * 1000 * 5, maxRequestSize = 1000 * 1000 * 25, fileSizeThreshold = 1000 * 1000)
public class registrarseControlador extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

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
       String nombre = request.getParameter("Name");
       String apellidos = request.getParameter("Last-Name");
       String correo = request.getParameter("Email");
       String contrasenia = request.getParameter("Password");
       String nombreUsuario = request.getParameter("userName");
       String path = request.getServletContext().getRealPath("");
       File fileSaveDir = new File(path + fileUtils.RUTE_USER_IMAGE);
       if(!fileSaveDir.exists()){
           fileSaveDir.mkdir();
       }
       Part file = request.getPart("imagen");
       String contentType = file.getContentType();
       String nameImage = file.getName() + System.currentTimeMillis() + fileUtils.GetExtension(contentType);
       String fullPath = path + fileUtils.RUTE_USER_IMAGE + "/" + nameImage;
       file.write(fullPath);
       modeloUsuario usuario = new modeloUsuario(nombre, apellidos, correo, contrasenia, nombreUsuario, fileUtils.RUTE_USER_IMAGE + "/" + nameImage);
       if(usuarioDao.insertarUsuario(usuario)==1){
           response.sendRedirect("index.jsp");
       }else{
           request.getRequestDispatcher("fail.jsp").forward(request, response);           
       }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
