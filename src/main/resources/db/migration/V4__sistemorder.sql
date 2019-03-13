/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Home
 * Created: Mar 13, 2019
 */

create table keranjang(
    idbarang character varying not null primary key,
    namabarang character varying not null,
    jumlahbarang character varying not null,
    totalharga character varying 
);

alter table keranjang
add constraint fk_keranjang_dataproduk_id foreign key (namabarang)
references dataproduk(idproduk) on update cascade on delete restrict;


create table cekbarang(
    idbenda character varying not null primary key,
    jenisebenda character varying,
    hargabenda character varying,
    alamattujuan character varying
);

alter table cekbarang
add constraint fk_cekbarang_id foreign key (idbenda)
references keranjang(idbarang) on update cascade on delete restrict;

alter table cekbarang
add constraint fk_cekbarang_datapelanggan_id foreign key (alamattujuan)
references datapelanggan(idpelanggan) on update cascade on delete cascade; 