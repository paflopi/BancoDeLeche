/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

/**
 *
 * @author Gonza
 */
public class MyResponse {
    
    public static Response getResponse(int status, Object entity, HttpServletRequest request){
        return Response.status(status).entity(entity).header("Access-Control-Allow-Origin", request.getHeader("origin"))
			.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
                        .header("Access-Control-Allow-Credentials", "true")
                        .header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept")
			.build();
    }
}
