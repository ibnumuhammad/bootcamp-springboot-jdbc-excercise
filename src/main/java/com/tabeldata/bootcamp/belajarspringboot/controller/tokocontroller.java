/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.bootcamp.belajarspringboot.controller;

import com.tabeldata.bootcamp.belajarspringboot.dao.tokodao;
import com.tabeldata.bootcamp.belajarspringboot.model.datatoko;
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
@RequestMapping("/api/toko")
public class tokocontroller {
    private final Logger console = LoggerFactory.getLogger(tokocontroller.class);
    @Autowired
    private tokodao dao;
    
    @GetMapping(path="/xml/list", produces = MediaType.APPLICATION_XML_VALUE)
    public List<datatoko>findallxml(){
        return dao.listtoko();
    }
    
    @GetMapping(path = "/json/list")
    public List<datatoko> findalljson(){
        return dao.listtoko();
    }
    
}
