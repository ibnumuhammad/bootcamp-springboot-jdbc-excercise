/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Home
 * Created: Mar 13, 2019
 */

create table datapelanggan(
    idpelanggan character varying not null primary key,
    namapelanggan character varying not null,
    alamatpelanggan character varying not null
);

insert into datapelanggan(idpelanggan, namapelanggan, alamatpelanggan) values 
('001','ujang','bojongsoang'),
('002','asep','bojongkoneng'),
('003','suep','bojongkenyot')
;