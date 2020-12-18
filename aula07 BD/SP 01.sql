CREATE DEFINER=`root`@`localhost` PROCEDURE `backup`()
BEGIN
-- apaga as tabelas
drop table backup.clientes;
drop table backup.funcionario;
drop table backup.marca;

-- atualiza o backup
create table backup.clientes select * from itau.clientes;
create table backup.funcionario select * from itau.funcionario;
create table backup.marca select * from itau.marca;


END