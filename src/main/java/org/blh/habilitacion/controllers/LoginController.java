/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.controllers;

import java.util.List;
import org.blh.habilitacion.entities.Usuario;
import org.blh.habilitacion.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Gonza
 */
public class LoginController {
    
    private static SessionFactory sf;
    
    public static Usuario login(String username, String pass){
        Usuario u = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            Session s = sf.openSession();
            u = (Usuario) s.createCriteria(Usuario.class).add(Restrictions.eq("username", username)).add(Restrictions.eq("password", pass)).setMaxResults(1).uniqueResult();
            Hibernate.initialize(u.getPerfil());
            Hibernate.initialize(u.getId());
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
}
