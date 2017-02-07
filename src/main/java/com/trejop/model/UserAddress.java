/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trejop.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author publico
 */
@Entity
@Table(name="user_address")
public class UserAddress implements Serializable{
    @Id
    @GenericGenerator(name="generatorUserAddress",strategy="sequence-identity",parameters=@Parameter(name="sequence",value="UADDRESS_SEQ"))
    @GeneratedValue(generator = "generatorUserAddress")
    private Integer id;
    private String direccion;
    private String cp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
    
}
