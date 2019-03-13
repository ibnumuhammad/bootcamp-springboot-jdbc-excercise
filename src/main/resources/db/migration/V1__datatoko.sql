/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Home
 * Created: Mar 13, 2019
 */

create table datatoko(
    idtoko character varying not null primary key,
    namatoko character varying not null,
    alamattoko character varying not null
);

insert into datatoko(idtoko, namatoko, alamattoko) values
('001','matahari-silau','sukajadi'),
('002','bulan-bersinar','sukamiskin'),
('003','lampupetromax-menyilaukan','sukabirus');