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
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import org.blh.habilitacion.controllers.CentrosController;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Gonza
 */
@Path("centros")
public class Centros {
    
    @GET
    @Produces("application/json")
    @Path("all")
    public Response all(@Context HttpServletRequest request){
        CentrosController cc = new CentrosController();
        ArrayList<org.blh.habilitacion.entities.Centros> centros = (ArrayList<org.blh.habilitacion.entities.Centros>) cc.all();
        Gson resp = new Gson();
        return MyResponse.getResponse(200, resp.toJson(centros), request);
    }
    
    @GET
    @Produces("application/json")
    @Path("add/{nombre}/{domicilio}/{telefono}")
    public Response add(@PathParam("nombre") String nombre, @PathParam("domicilio") String domicilio, @PathParam("telefono") String telefono, @Context HttpServletRequest request){
        JSONObject resp = new JSONObject();
        Boolean addFlag = CentrosController.add(nombre, domicilio, telefono);
        if(addFlag){
            resp.put("status", "OK");
            resp.put("message", "Center added! Success!");
        }
         return MyResponse.getResponse(200, resp, request);
    }
}
