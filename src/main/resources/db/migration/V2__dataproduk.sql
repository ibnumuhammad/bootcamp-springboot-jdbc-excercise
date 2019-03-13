/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Home
 * Created: Mar 13, 2019
 */

create table dataproduk(
    idproduk character varying not null primary key,
    namaproduk character varying not null,
    hargaproduk character varying not null
);

insert into dataproduk(idproduk, namaproduk, hargaproduk) values
('snack','wafer','1000'),
('makanan','coklat','1000'),
('minuman','sirop','1000');