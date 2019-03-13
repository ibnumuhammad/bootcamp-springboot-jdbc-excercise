/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.bootcamp.belajarspringboot.model;

import java.util.ArrayList;
import java.util.List;

/**
 *idbarang character varying not null primary key,
    namabarang character varying not null,
    jumlahbarang character varying not null,
    totalharga character varying
 * @author Home
 */
public class keranjang {
    private String idbarang;
    private dataproduk namabarang;
    private String jumlahbarang;
    private String totalharga;
    private List<cekbarang> cekbarang = new ArrayList<cekbarang>(); 

    /**
     * @return the idbarang
     */
    public String getIdbarang() {
        return idbarang;
    }

    /**
     * @param idbarang the idbarang to set
     */
    public void setIdbarang(String idbarang) {
        this.idbarang = idbarang;
    }

    /**
     * @return the namabarang
     */
    public dataproduk getNamabarang() {
        return namabarang;
    }

    /**
     * @param namabarang the namabarang to set
     */
    public void setNamabarang(dataproduk namabarang) {
        this.namabarang = namabarang;
    }

    /**
     * @return the jumlahbarang
     */
    public String getJumlahbarang() {
        return jumlahbarang;
    }

    /**
     * @param jumlahbarang the jumlahbarang to set
     */
    public void setJumlahbarang(String jumlahbarang) {
        this.jumlahbarang = jumlahbarang;
    }

    /**
     * @return the totalharga
     */
    public String getTotalharga() {
        return totalharga;
    }

    /**
     * @param totalharga the totalharga to set
     */
    public void setTotalharga(String totalharga) {
        this.totalharga = totalharga;
    }

    /**
     * @return the cekbarang
     */
    public List<cekbarang> getCekbarang() {
        return cekbarang;
    }

    /**
     * @param cekbarang the cekbarang to set
     */
    public void setCekbarang(List<cekbarang> cekbarang) {
        this.cekbarang = cekbarang;
    }

   
    
    
    
    
}
