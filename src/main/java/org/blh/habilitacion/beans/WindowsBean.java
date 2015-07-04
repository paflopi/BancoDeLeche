/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.beans;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gonza
 */
@ManagedBean(name="windows",eager=true)
public class WindowsBean {
    
    public void redirectTo(String url) throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect(url);
    }
}
