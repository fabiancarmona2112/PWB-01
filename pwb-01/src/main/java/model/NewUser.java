/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mike_
 */
public class NewUser {
    private String _name;
    private String _lastName;
    private String _email;
    private String _password;
    private String _socialMedia;
    private String _userName;

    public NewUser(String _name, String _lastName, String _email, String _password, String _socialMedia, String _userName) {
        this._name = _name;
        this._lastName = _lastName;
        this._email = _email;
        this._password = _password;
        this._socialMedia = _socialMedia;
        this._userName = _userName;
    }
    
    public NewUser(){        
    }

    public String getName() {
        return _name;
    }

    public String getLastName() {
        return _lastName;
    }

    public String getEmail() {
        return _email;
    }

    public String getPassword() {
        return _password;
    }

    public String getSocialMedia() {
        return _socialMedia;
    }

    public String getUserName() {
        return _userName;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setLastName(String _lastName) {
        this._lastName = _lastName;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public void setSocialMedia(String _socialMedia) {
        this._socialMedia = _socialMedia;
    }

    public void setUserName(String _userName) {
        this._userName = _userName;
    }

    
    
}
