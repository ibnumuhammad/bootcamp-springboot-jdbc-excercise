/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.bootcamp.belajarspringboot.controller;

import com.tabeldata.bootcamp.belajarspringboot.dao.Pelanggandao;
import com.tabeldata.bootcamp.belajarspringboot.model.datapelanggan;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Home
 */
@RestController
@RequestMapping("/api/pelanggan")
public class pelanggancontroller {
    private final Logger console = LoggerFactory.getLogger(pelanggancontroller.class);
    @Autowired
    private Pelanggandao dao;
    
    @GetMapping(path = "/xml/list",produces = MediaType.APPLICATION_XML_VALUE)
    public List<datapelanggan> findallxml(){
        return dao.listpelanggan();
    }
    
    @GetMapping(path = "/json/list")
    public List<datapelanggan> findalljson(){
        return dao.listpelanggan();
    }
    
}
