/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.bootcamp.belajarspringboot.controller;

import com.tabeldata.bootcamp.belajarspringboot.dao.sistemorderdao;
import com.tabeldata.bootcamp.belajarspringboot.model.keranjang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Home
 */
@RestController
@RequestMapping("/api/order")
public class sistemordercontroller {
    
    @Autowired
    private sistemorderdao dao;
    
    @PostMapping("/")
    public ResponseEntity<keranjang> save(@RequestBody keranjang brg){
        dao.save(brg);
        return ResponseEntity.ok().build();
    }
}
