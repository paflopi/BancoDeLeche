/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.controllers;

import java.util.List;
import org.blh.habilitacion.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Gonza
 */
public abstract class AbstractController<T> {
    
    protected static SessionFactory sf;
    protected boolean composite = false;
    
    public List<T> all(){
        sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        List<T> l = s.createCriteria(className()).list();
        beforeAll();
        if(composite){
            for(T o : l){
                initialize(o);
            }
        }
        s.close();
        return l;
    }

    
    public abstract Class<T> className();
    
    public abstract void initialize(T entity);
    
    public void beforeAll(){}
    
    public void afterAll(){}
}
