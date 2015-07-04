/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.rest;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import org.blh.habilitacion.controllers.AbstractController;
import org.blh.habilitacion.controllers.ProvinciaController;
import org.blh.habilitacion.entities.Provincia;

/**
 *
 * @author Gonza
 */
@Path("provincias")
public class Provincias {
    
    @GET
    @Produces("application/json")
    @Path("all")
    public Response all(@Context HttpServletRequest request){
        ProvinciaController pc = new ProvinciaController();
        ArrayList<Provincia> provincias = (ArrayList<Provincia>) pc.all();
        Gson resp = new Gson();
        return MyResponse.getResponse(200,resp.toJson(provincias), request);
    }
}
