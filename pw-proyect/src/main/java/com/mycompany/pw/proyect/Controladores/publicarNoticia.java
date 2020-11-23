/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pw.proyect.Controladores;

import com.mycompany.pw.proyect.Dao.noticiaDao;
import com.mycompany.pw.proyect.Dao.usuarioDao;
import com.mycompany.pw.proyect.Modelos.modeloNoticia;
import com.mycompany.pw.proyect.Modelos.modeloUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mike_
 */
@WebServlet(name = "publicarNoticia", urlPatterns = {"/publicarNoticia"})
@MultipartConfig(maxFileSize = 1000 * 1000 * 5, maxRequestSize = 1000 * 1000 * 25, fileSizeThreshold = 1000 * 1000)
public class publicarNoticia extends HttpServlet {


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
        
        
          request.getRequestDispatcher("succes.jsp").forward(request, response);   
//         System.out.println("entro");
//         
//         //obtengo el nombre y la contraeña del form         
//       String nombreUsuario = request.getParameter("nombreUsuario");       
//       
//       //instancio mi modelo usuario para enviarselo al DAO
//       modeloUsuario usuario = new modeloUsuario();
//       //le doy los valoes de mis parametros
//       usuario.setNombreUsuario(nombreUsuario);
//
//        // Obtenemos los usuarios del DAO
//       modeloUsuario logeado = usuarioDao.getUser(usuario);
//       
//       if (logeado != null ){
//        // Lo agregamos como atributo al request
//        request.setAttribute("usuario", usuario);
//        // Enviamos el request a index.jsp con la informacion   
//        request.getRequestDispatcher("publicarContenido.jsp").forward(request, response);
//        //request.getRequestDispatcher("perfilUsuario.jsp").forward(request, response);
//       }else{
//        request.getRequestDispatcher("fail.jsp").forward(request, response);           
//       }
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
        String[] imagenes = new String[4];
        
        String titulo = request.getParameter("titulo");
        String desc = request.getParameter("descripcionCorta");
        imagenes[0] = request.getParameter("imagenCabecera");
        String contenido = request.getParameter("contenido");
        String categoria = request.getParameter("categoria");
        imagenes[1] = request.getParameter("imagenCentral");
        imagenes[2] = request.getParameter("imagenFinal");
        String autor = request.getParameter("nombreUsuario");
        
        modeloNoticia noticia = new modeloNoticia(titulo, desc, contenido, categoria, autor);
        boolean bandera = false;
        if (noticiaDao.insertarNoticia(noticia) == 1){
            
            //noticia.setNoticia(noticiaDao.getIdNoticia(noticia));
            if(noticia.getNoticia() != 0){
                noticia.setImagenes(imagenes);
                for(int imgPos = 1; imgPos<4; imgPos++){
                    if(noticiaDao.setImagenes(noticia, imgPos) != 1){                         
                        break;                        
                    }
                  bandera = true;
                }
            }
            
            if(bandera){
                request.setAttribute("noticia",noticia);
                response.sendRedirect("succes.jsp");
            }else if (!bandera){
                response.sendRedirect("fail.jsp");                
            }
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
