/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import org.blh.habilitacion.entities.Centros;
import org.blh.habilitacion.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 *
 * @author Gonza
 */
public class CentrosController extends AbstractController<Centros> {
   
    public static Boolean add(String nombre, String domicilio, String telefono){
        Boolean resp = false;
        try {
            sf = HibernateUtil.getSessionFactory();
            Session s = sf.openSession();
            Transaction tx = s.beginTransaction();
            int idMax = 0;
            Centros max = (Centros)s.createCriteria(Centros.class).addOrder(Order.desc("idCentro")).setMaxResults(1).uniqueResult();
//            if(max != null){
//                idMax = max.getIdCentro() + 1;
//            }
//            Centros p = new Centros();
//            p.setIdCentro(idMax);
//            p.setNombreCentro(nombre);
//            p.setDomicilioCentro(domicilio);
//            p.setTelefonoCentro(telefono);
//            s.persist(p);
//            tx.commit();
//            s.close();
//            resp = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    @Override
    public Class className() {
        return Centros.class;
    }

    @Override
    public void initialize(Centros entity) {
        Hibernate.initialize(entity.getEntregadebiberonacentros());
        Hibernate.initialize(entity.getConsentimientos());
    }
    
    @Override
    public void beforeAll(){
        super.composite = true;
    }
}
