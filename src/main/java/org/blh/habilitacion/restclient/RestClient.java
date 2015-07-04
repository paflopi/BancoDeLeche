/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.restclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import javax.ws.rs.core.MediaType;
import org.json.simple.JSONObject;

public class RestClient {
    protected Client client;
    protected WebResource resource;
    protected static final String BASE_URI = "http://localhost:8080/BancoLecheHumana/rest";

    protected RestClient(String username, String password) {
        client = Client.create();
//        client.addFilter(new HTTPBasicAuthFilter(username,password));
        resource = client.resource(BASE_URI);
    }
    
    public static RestClient getClient(String username, String password){
        return new RestClient(username,password);
    }
    
    /**
     * 
     * @param path Represents a path for the request in API
     * @return Response in ClientResponse Jersey object
     */
    public ClientResponse response(String path){
        return resource.path(path).accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
    }
    
    public ClientResponse post(String path, Object params){
        return resource.path(path).accept(MediaType.APPLICATION_JSON).post(ClientResponse.class, params);
    }

}
