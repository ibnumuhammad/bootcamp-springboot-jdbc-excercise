/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
idbarang character varying not null primary key,
    namabarang character varying not null,
    jumlahbarang character varying not null,
    totalharga character varying
 */
package com.tabeldata.bootcamp.belajarspringboot.dao;

import com.tabeldata.bootcamp.belajarspringboot.model.cekbarang;
import com.tabeldata.bootcamp.belajarspringboot.model.keranjang;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Home
 */
@Repository
@Transactional(readOnly= true)
public class sistemorderdao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Transactional
    public void save(keranjang brg){
        String barangquery = "insert into keranjang(idbarang, namabarang, jumlahbarang,totalharga) values (?, ?, ?, ?)";
        this.jdbcTemplate.update(barangquery, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                 ps.setString(1, brg.getIdbarang());
                 ps.setString(2, brg.getJumlahbarang());
                 ps.setString(3, brg.getTotalharga());
                 ps.setString(4, brg.getNamabarang().getIdproduk());
            }
        });
        
        
        String belanjaquery = "insert into cekbarang(idbenda, jenisbenda, hargabenda, alamattujuan) values (?, ?, ?, ?)";
        this.jdbcTemplate.batchUpdate(belanjaquery, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
           cekbarang barang = brg.getCekbarang().get(i);
           ps.setString(1, barang.getAlamattujuan().getAlamatpelanggan());
            }

            @Override
            public int getBatchSize() {
                return brg.getCekbarang().size();
            }
        });
    }
}
