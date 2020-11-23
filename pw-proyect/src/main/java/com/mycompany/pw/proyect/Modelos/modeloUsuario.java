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
    private String rol;
    private int idTipoUsuario;
    private String rSocial;
    private String biografia;
    private int idUsuario;

    public modeloUsuario() {
    }


    public modeloUsuario(String nombre, String apellido, String correo, String contrasenia, String nombreUsuario, String urlImage, String rol, String rSocial, String biografia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nombreUsuario = nombreUsuario;
        this.urlImage = urlImage;
        this.rol = rol;
        this.rSocial = rSocial;
        this.biografia = biografia;
    }

    public modeloUsuario(String nombre, String apellido, String correo, String contrasenia, String nombreUsuario, String urlImage, String rol, String rSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nombreUsuario = nombreUsuario;
        this.urlImage = urlImage;
        this.rol = rol;
        this.rSocial = rSocial;        
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getrSocial() {
        return rSocial;
    }

    public void setrSocial(String rSocial) {
        this.rSocial = rSocial;
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
    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    
    
    
}
