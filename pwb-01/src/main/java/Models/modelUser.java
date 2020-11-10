/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author mike_
 */
public class modelUser {
    private String userName;
    private String pwd;
    private int id;

    public modelUser() {
    }

    public modelUser(String userName, String pwd, int id) {
        this.userName = userName;
        this.pwd = pwd;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPwd() {
        return pwd;
    }

    public int getId() {
        return id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
