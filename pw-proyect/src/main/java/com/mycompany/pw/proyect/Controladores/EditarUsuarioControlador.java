/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pw.proyect.Controladores;

import com.mycompany.pw.proyect.Dao.usuarioDao;
import com.mycompany.pw.proyect.Modelos.modeloUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author larev
 */
@WebServlet(name = "EditarUsuarioControlador", urlPatterns = {"/EditarUsuarioControlador"})
public class EditarUsuarioControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditarUsuarioControlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditarUsuarioControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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

        String editUsuario = request.getParameter("editusuario");
        String editnombre = request.getParameter("editNombre");
        String editapellidos = request.getParameter("editApellido");
        String editRedSocial = request.getParameter("editContacto");

        //String editpath = request.getServletContext().getRealPath("");
        modeloUsuario usuario = new modeloUsuario(editnombre, editapellidos, editUsuario, editRedSocial);

        if (usuarioDao.editarusuario(usuario) == 1 && usuarioDao.buscarUsuario(usuario) != null) {
            //obtenemos el usuario ya con la informacion corregida
            // Enviamos el request a index.jsp con la informacion 
            request.setAttribute("usuario", usuario);
            request.getRequestDispatcher("perfilUsuario.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("fail.jsp").forward(request, response);
        }

        request.setAttribute("usuario", usuario);
        request.getRequestDispatcher("perfilUsuario.jsp").forward(request, response);   
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
