/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.bootcamp.belajarspringboot.model;

/**
 *idproduk character varying not null primary key,
    namaproduk character varying not null,
    hargaproduk character varying not null
 * @author Home
 */
public class dataproduk {
   
    private String idproduk;
    private String namaproduk;
    private String hargaproduk;

    /**
     * @return the idproduk
     */
    public String getIdproduk() {
        return idproduk;
    }

    /**
     * @param idproduk the idproduk to set
     */
    public void setIdproduk(String idproduk) {
        this.idproduk = idproduk;
    }

    /**
     * @return the namaproduk
     */
    public String getNamaproduk() {
        return namaproduk;
    }

    /**
     * @param namaproduk the namaproduk to set
     */
    public void setNamaproduk(String namaproduk) {
        this.namaproduk = namaproduk;
    }

    /**
     * @return the hargaproduk
     */
    public String getHargaproduk() {
        return hargaproduk;
    }

    /**
     * @param hargaproduk the hargaproduk to set
     */
    public void setHargaproduk(String hargaproduk) {
        this.hargaproduk = hargaproduk;
    }
    
    
}
