CREATE DEFINER=`root`@`localhost` PROCEDURE `restore_clientes`()
BEGIN
-- insert into itau.clientes select * from backup.clientes; ??

drop table itau.clientes;
create table itau.clientes select * from backup.clientes;


END