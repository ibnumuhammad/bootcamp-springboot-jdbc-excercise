/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.bootcamp.belajarspringboot.model;

/**
 *idpelanggan character varying not null primary key,
    namapelanggan character varying not null,
    alamatpelanggan character varying not null
 * @author Home
 */
public class datapelanggan {
   private String idpelanggan;
   private String namapelanggan;
   private String alamatpelanggan;

    /**
     * @return the idpelanggan
     */
    public String getIdpelanggan() {
        return idpelanggan;
    }

    /**
     * @param idpelanggan the idpelanggan to set
     */
    public void setIdpelanggan(String idpelanggan) {
        this.idpelanggan = idpelanggan;
    }

    /**
     * @return the namapelanggan
     */
    public String getNamapelanggan() {
        return namapelanggan;
    }

    /**
     * @param namapelanggan the namapelanggan to set
     */
    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    /**
     * @return the alamatpelanggan
     */
    public String getAlamatpelanggan() {
        return alamatpelanggan;
    }

    /**
     * @param alamatpelanggan the alamatpelanggan to set
     */
    public void setAlamatpelanggan(String alamatpelanggan) {
        this.alamatpelanggan = alamatpelanggan;
    }
   
   
}
