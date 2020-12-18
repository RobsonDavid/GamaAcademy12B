drop table myproject.mtb310_usuario;
use myproject;
create table mtb310_usuario ( id integer not null auto_increment, nome varchar(50) not null, racf char(8) not null, 
email varchar(100) not null , foto varchar(20) not null, password varchar(20), primary key(id));

insert mtb310_usuario values (null, 'Wallace Queixas', 'wcampos', 'wallace.queixas@itau-unibanco.com.br', 
'/img/wcampos.jpeg', '12345678');

insert mtb310_usuario values (null, 'Robson David', 'reduard', 'robson.david@itau-unibanco.com.br', 
'/img/reduard.jpeg', 'ab12');

select * from mtb310_usuario;

update mtb310_usuario set racf  ='reduard' where id = 2;