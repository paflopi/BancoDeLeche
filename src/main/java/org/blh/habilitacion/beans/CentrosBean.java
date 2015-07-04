/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.beans;

import com.sun.jersey.core.util.MultivaluedMapImpl;
import javax.faces.bean.ManagedBean;
import javax.ws.rs.core.MultivaluedMap;
import org.blh.habilitacion.restclient.UserClient;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author Gonza
 */
@ManagedBean(name = "centros")
public class CentrosBean {
    
    private String nombre;
    private String domicilio;
    private String telefono;
    private Boolean addFlag = false;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    private JSONArray centros;

    public JSONArray getCentros() {
        if(centros == null){
            UserClient uc = new UserClient("","");
            centros = (JSONArray)JSONValue.parse(uc.response("centros/all").getEntity(String.class));
        }
        return centros;
    }

    public Boolean getAddFlag() {
        return addFlag;
    }

    public void setAddFlag(Boolean addFlag) {
        this.addFlag = addFlag;
    }
    
    public Boolean addCentro(){
        Boolean output = false;
        if(nombre != null && domicilio != null && telefono != null){
            UserClient uc = new UserClient("","");
            MultivaluedMap params = new MultivaluedMapImpl();
            params.add("nombre", nombre);
            params.add("domicilio", domicilio);
            params.add("telefono", telefono);
            JSONObject resp = (JSONObject)JSONValue.parse(uc.response("centros/add/" + nombre + "/" + domicilio + "/" + telefono).getEntity(String.class));
            if(resp != null && resp.get("status").toString().equals("OK")){
                output = true;
                addFlag = true;
                JSONObject nuevo = new JSONObject();
                nuevo.put("id", nombre);
                nuevo.put("domicilio", domicilio);
                nuevo.put("telefono", telefono);
                centros.add(nuevo);
            }
        }
        return output;
    }

    public void setCentros(JSONArray centros) {
        this.centros = centros;
    }
    
    
}
