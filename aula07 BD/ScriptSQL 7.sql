create database backup;
use backup;
create table backup.clientes select * from itau.clientes;
create table backup.funcionario select * from itau.funcionario;
create table backup.marca select * from itau.marca;

drop table backup.cliente;
drop table backup.funcionario;
drop table backup.marca;

describe itau.marca;
insert into itau.marca (nome_marca) values ("xxLG") ,( "xxXP") , ("xxYY");

select * from itau.marca;
select count(*) as qtde_itau from itau.marca;
select * from backup.marca;
select count(*) as qtde_backup from backup.marca;

select count(*) as qtde_itau_clientes from itau.clientes;
select count(*) as qtde_backup_clientes from backup.clientes;
delete from itau.clientes;

insert into itau.clientes select * from backup.clientes;

drop table itau.clientes;
create table itau.clientes select * from backup.clientes;
