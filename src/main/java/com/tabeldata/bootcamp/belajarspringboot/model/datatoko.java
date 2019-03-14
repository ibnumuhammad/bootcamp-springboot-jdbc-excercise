/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.bootcamp.belajarspringboot.model;

/**
 *
 * @author Home
 */
public class datatoko {
   
    private String idtoko;
    private String namatoko;
    private String alamattoko;

    @Override
    public String toString(){
        return String.format("{idtoko: %s, namatoko: %s, alamattoko: %s", this.getIdtoko(), this.getNamatoko(), this.getAlamattoko());
    }
    /**
     * @return the idtoko
     */
    public String getIdtoko() {
        return idtoko;
    }

    /**
     * @param idtoko the idtoko to set
     */
    public void setIdtoko(String idtoko) {
        this.idtoko = idtoko;
    }

    /**
     * @return the namatoko
     */
    public String getNamatoko() {
        return namatoko;
    }

    /**
     * @param namatoko the namatoko to set
     */
    public void setNamatoko(String namatoko) {
        this.namatoko = namatoko;
    }

    /**
     * @return the alamattoko
     */
    public String getAlamattoko() {
        return alamattoko;
    }

    /**
     * @param alamattoko the alamattoko to set
     */
    public void setAlamattoko(String alamattoko) {
        this.alamattoko = alamattoko;
    }
    
    
}
