/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Gonza
 */
@FacesConverter("org.blh.habilitacion.util.Encrypter")
public class Encrypter implements Converter{

    private EncObject obj;
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        this.obj = new EncObject(value);
        return obj;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return obj.getValue();
    }
    
}
