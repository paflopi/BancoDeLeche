/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.controllers;

import org.blh.habilitacion.entities.Usuario;
import org.hibernate.Hibernate;

/**
 *
 * @author Gonza
 */
public class UsuarioController extends AbstractController<Usuario> {

    @Override
    public Class<Usuario> className() {
        return Usuario.class;
    }

    @Override
    public void initialize(Usuario entity) {
        Hibernate.initialize(entity.getPerfil());
    }
    
    @Override
    public void beforeAll(){
        super.composite = true;
    }
    
}
