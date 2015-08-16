/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blh.habilitacion.util;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 *
 * @author Gonza
 */
public class EncObject {
    private String value;
    private BasicTextEncryptor encrypt = new BasicTextEncryptor();
    
    public EncObject(String value){
        this.encrypt.setPassword("jajkaN17");
        this.setValue(value);
    }
    
    public void setValue(String value){
        this.value = encrypt.encrypt(value);
    }
    
    public String getValue(){
        return encrypt.decrypt(value);
    }
}
