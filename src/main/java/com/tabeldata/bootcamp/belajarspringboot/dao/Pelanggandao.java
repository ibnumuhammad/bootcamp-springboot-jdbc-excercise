/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.bootcamp.belajarspringboot.dao;

import com.tabeldata.bootcamp.belajarspringboot.model.datapelanggan;
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
@Transactional (readOnly = true)
public class Pelanggandao {
  @Autowired
  private JdbcTemplate jdbc;
  
  public List<datapelanggan> listpelanggan(){
      String sql= "select* from datapelanggan";
      return this.jdbc.query(sql, new pelangganrowmapper());
  }
  
  private class pelangganrowmapper implements RowMapper<datapelanggan>{
      
      @Override
      public datapelanggan mapRow(ResultSet rs, int rowNum) throws SQLException{
          datapelanggan pelanggan = new datapelanggan();
          pelanggan.setIdpelanggan(rs.getString("idpelanggan"));
          pelanggan.setNamapelanggan(rs.getString("namapelanggan"));
          pelanggan.setAlamatpelanggan(rs.getString("alamatpelanggan"));
          return pelanggan;
      }
  }
}
