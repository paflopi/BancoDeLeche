/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.beans;

import com.sun.jersey.api.client.ClientResponse;
import java.beans.*;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.blh.habilitacion.restclient.RestClient;
import org.blh.habilitacion.restclient.UserClient;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author Gonza
 */
@ManagedBean(name="clientbean", eager=true)
public class ClientBean implements Serializable {

    private RestClient client = new UserClient("yogonza","america123.");
    
    public List<JSONObject> getProvincias(){
        return (JSONArray)JSONValue.parse(client.response("provincias/all").getEntity(String.class));
    }
//    
//    public List<JSONObject> getRodados(){
//        return (JSONArray)JSONValue.parse(client.response("rodado/all").getEntity(String.class));
//    }
    
}
