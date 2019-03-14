/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.bootcamp.belajarspringboot.dao;

import com.tabeldata.bootcamp.belajarspringboot.model.dataproduk;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Home
 */
@Repository
@Transactional(readOnly = true)

public class produkdao {
    @Autowired
    private JdbcTemplate jdbc;
    
    public List<dataproduk> listproduk(){
        String sql = "select* from dataproduk";
        return this.jdbc.query(sql, new produkrowmapper());
    }
    
    private class produkrowmapper implements RowMapper<dataproduk>{
        
        @Override
        public dataproduk mapRow(ResultSet rs, int rowNum) throws SQLException{
            dataproduk produk = new dataproduk();
            produk.setIdproduk(rs.getString("idproduk"));
            produk.setNamaproduk(rs.getString("namaproduk"));
            produk.setHargaproduk(rs.getString("hargaproduk"));
            produk.setJumlahproduk(rs.getString("jumlahproduk"));
            return produk;
        }
    }
}
