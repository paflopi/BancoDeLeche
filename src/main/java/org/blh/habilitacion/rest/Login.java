/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import org.blh.habilitacion.controllers.LoginController;
import org.blh.habilitacion.entities.Usuario;
import org.json.simple.JSONObject;

/**
 *
 * @author Gonza
 */
@Path("user")
public class Login {
    
    @POST
    @Produces("application/json")
    @Path("login/{username}/{password}")
    public Response login(@PathParam("username") String username, @PathParam("password") String password, @Context HttpServletRequest request){
        JSONObject resp = new JSONObject();
        Usuario u = LoginController.login(username, password);
        if(u != null){
            resp.put("status", "connected");
            resp.put("message", "Success login!");
        }
        return Response.status(200).entity(resp).header("Access-Control-Allow-Origin", request.getHeader("origin"))
			.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
                        .header("Access-Control-Allow-Credentials", "true")
                        .header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept")
			.build();
    }
}
