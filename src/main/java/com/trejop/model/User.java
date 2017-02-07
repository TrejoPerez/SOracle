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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author publico
 */
@Entity
@Table(name="Usuario")
public class User implements Serializable{
    @Id
    @GenericGenerator(name="generatorUSERS",strategy="sequence-identity",parameters=@Parameter(name="sequence",value="USERS_SEQ"))
    @GeneratedValue(generator ="generatorUSERS" )
    private Integer id;
    private String username;
    private String edad;
    @OneToOne
    @JoinTable(name="usuario_direccioni",joinColumns = @JoinColumn(name="id_direccion"),inverseJoinColumns = @JoinColumn(name="id_usuario"))
    private UserAddress userAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }
    
    
}
