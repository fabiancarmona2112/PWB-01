/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pw.proyect.Utils;

/**
 *
 * @author mike_
 */
public class fileUtils {
    public static String RUTE_USER_IMAGE = "assets/img";
    
    public static String GetExtension(String contentType){
        
        switch(contentType){
            case "image/png":
                return ".png";
            case "image/jpeg":
                return "jpeg";
            case "video/mp4":
                return ".mp4";
        }
        
        return ".ext";
    }
}
