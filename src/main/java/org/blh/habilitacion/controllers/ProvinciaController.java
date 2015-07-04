/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import org.blh.habilitacion.entities.Provincia;
import org.blh.habilitacion.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Gonza
 */
public class ProvinciaController extends AbstractController<Provincia> {

    @Override
    public Class<Provincia> className() {
        return Provincia.class;
    }

    @Override
    public void initialize(Provincia entity) {
        Hibernate.initialize(entity.getLocalidads());
    }
    
    @Override
    public void beforeAll(){
        super.composite = true;
    }
}
