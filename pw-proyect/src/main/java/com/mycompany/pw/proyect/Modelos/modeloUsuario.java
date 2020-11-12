/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pw.proyect.Modelos;

/**
 *
 * @author mike_
 */
public class modeloUsuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private String nombreUsuario;
    private String urlImage;

    public modeloUsuario() {
    }

    public modeloUsuario(String nombre, String apellido, String correo, String contrasenia, String nombreUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nombreUsuario = nombreUsuario;        
    }

    public modeloUsuario(String nombre, String apellido, String correo, String contrasenia, String nombreUsuario, String urlImage) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nombreUsuario = nombreUsuario;
        this.urlImage = urlImage;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    
}
