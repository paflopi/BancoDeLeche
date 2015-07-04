/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import org.blh.habilitacion.beans.ClientBean;
import org.blh.habilitacion.controllers.ProvinciaController;
import org.blh.habilitacion.entities.Provincia;
import org.blh.habilitacion.restclient.UserClient;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Gonza
 */
public class provinciasTest {
    
    private static ArrayList<Provincia> p;
//    private static ClientBean cb;
    
    public provinciasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void allProvincias() {
        ProvinciaController pc = new ProvinciaController();
        ArrayList<Provincia> l = (ArrayList<Provincia>) pc.all();
        Gson json = new Gson();
        System.out.println(json.toJson(l));
    }
}
