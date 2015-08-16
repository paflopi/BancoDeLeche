/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.beans;

import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import org.blh.habilitacion.controllers.LoginController;
import org.blh.habilitacion.entities.Usuario;
 
/**
 *
 * @author KevinArnold
 */
@ManagedBean
@RequestScoped
public class MbLogin {
 
    private String usuario;
    private String contrasenia;
    private final HttpServletRequest httpServletRequest;
    private final FacesContext faceContext;
    private FacesMessage facesMessage;
     
    public MbLogin() throws IOException 
    {
        faceContext=FacesContext.getCurrentInstance();
        httpServletRequest=(HttpServletRequest)faceContext.getExternalContext().getRequest();
        if(httpServletRequest.getSession().getAttribute("sessionUsuario")!=null)
        {
            facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO, "Primero debe iniciar sesión", null);
            faceContext.addMessage(null, facesMessage);
            faceContext.getExternalContext().redirect("acceso.xhtml");
        }
    }
     
    public String login()
    {
        Usuario user = LoginController.login(usuario, contrasenia);
        if(user != null)
        {
            httpServletRequest.getSession().setAttribute("sessionUsuario", usuario);
//            facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO, "Acceso Correcto", null);
//            faceContext.addMessage(null, facesMessage);
            return "acceso";
        }
        else
        {
            facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contraseña incorrecto", null);
            faceContext.addMessage(null, facesMessage);
            return "index";
        }
    }
 
    public String getUsuario() {
        return usuario;
    }
 
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
 
    public String getContrasenia() {
        return contrasenia;
    }
 
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }    
}