/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.restclient;

import com.sun.jersey.api.client.ClientResponse;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Gonza
 */
public class UserClient extends RestClient {

    public UserClient(String username, String password) {
        super(username, password);
    }
}
