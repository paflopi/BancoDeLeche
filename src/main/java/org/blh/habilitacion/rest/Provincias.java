/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.rest;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import org.blh.habilitacion.controllers.AbstractController;
import org.blh.habilitacion.controllers.ProvinciaController;
import org.blh.habilitacion.entities.Localidad;
import org.blh.habilitacion.entities.Provincia;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
        List<Provincia> l = pc.all();
        JSONArray lista = new JSONArray();
        for(Provincia p : l){
            JSONObject prov = new JSONObject();
            prov.put("nombre", p.getNombreProvincia());
            prov.put("id", p.getIdprovincia());
            JSONArray localidades = new JSONArray();
            for (Iterator it = p.getLocalidads().iterator(); it.hasNext();) {
                Localidad loc = (Localidad) it.next();
                JSONObject locali = new JSONObject();
                locali.put("id", loc.getId().getIdlocalidad());
                locali.put("nombre", loc.getNombreLocalidad());
                locali.put("codigo_postal", loc.getCp());
                localidades.add(locali);
            }
            prov.put("localidades", localidades);
            lista.add(prov);
        }
        System.out.println(lista.toString());
        return MyResponse.getResponse(501,lista, request);
    }
}
