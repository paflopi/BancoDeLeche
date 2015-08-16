/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.beans;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.blh.habilitacion.controllers.LoginController;
import org.blh.habilitacion.entities.Usuario;
import org.jasypt.util.text.BasicTextEncryptor;

/**
 *
 * @author Gonza
 */
@ManagedBean(name="login", eager=true)
@SessionScoped
@Stateful
public class LoginBean {

    private String username;
    private String password;
    private String message;
    private boolean connected = false;
    private Usuario user = null;
    private String wronUser;
    private BasicTextEncryptor encrypt = new BasicTextEncryptor();
    
    public LoginBean(){
        encrypt.setPassword("jajkaN18");
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getWronUser() {
        return wronUser;
    }

    public void setWronUser(String wronUser) {
        this.wronUser = wronUser;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = encrypt.encrypt(username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = encrypt.encrypt(password);
    }
    
    public void loggin() throws IOException{
        if(username == null || password == null || username.length() == 0 || password.length() == 0){
            wronUser = null;
            message = "Lo siento, debe ingresar un usuario y una contraseña válida";
        }
        else{
            user = LoginController.login(this.getUsername(), this.getPassword());
            if(user != null){
                wronUser = null;
                connected = true;
                FacesContext.getCurrentInstance().getExternalContext().redirect("templates/principal.xhtml");
            }
            else{
                connected = false;
                message = null;
                wronUser = "Error: usuario o contraseña incorrecta";
            }
        }
    }

    public void logout(){
        message = null;
        user = null;
        connected = false;
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("../home.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void check() throws IOException{
        if(!connected){
            FacesContext.getCurrentInstance().getExternalContext().redirect("../home.xhtml");
        }
    }
    
    public void checkHome() throws IOException{
        if(connected){
            FacesContext.getCurrentInstance().getExternalContext().redirect("templates/principal.xhtml");
        }
    }
}
