/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import java.util.ArrayList;
import java.util.Iterator;
import javax.ws.rs.core.MultivaluedMap;
import org.blh.habilitacion.controllers.CentrosController;
import org.blh.habilitacion.entities.Centros;
import org.blh.habilitacion.restclient.UserClient;
import org.json.simple.JSONObject;
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
public class centrosTest {
    
    public centrosTest() {
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
     @Ignore //Test Success at 30/06/2015
     public void allCentros() {
         
     }
     
     @Test
     @Ignore
     public void postTest(){
         UserClient uc = new UserClient("","");
         ClientResponse resp = uc.response("centros/add/1/2/3");
         assertNotNull(resp);
         System.out.println(resp.getEntity(String.class));
     }
}
