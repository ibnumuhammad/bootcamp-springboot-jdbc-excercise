/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.bootcamp.belajarspringboot.dao;

import com.tabeldata.bootcamp.belajarspringboot.model.datatoko;
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
public class tokodao {
    @Autowired
    private JdbcTemplate jdbc;
    
    public List<datatoko> listtoko(){
     String sql = "select * from datatoko";
    return this.jdbc.query(sql, new tokorowmapper());
    }
    
    
    private class tokorowmapper implements RowMapper<datatoko>{
        
        @Override
        public datatoko mapRow(ResultSet rs, int rowNum) throws SQLException {
            datatoko listtoko = new datatoko();
            listtoko.setIdtoko(rs.getString("idtoko"));
            listtoko.setNamatoko(rs.getString("namatoko"));
            listtoko.setAlamattoko(rs.getString("alamattoko"));
            return listtoko;
        }
    }
}
