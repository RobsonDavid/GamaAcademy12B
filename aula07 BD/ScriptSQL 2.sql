create table itau.bck_cliente2 select * from itau.clientes; -- criar tabela de backup
select * from itau.bck_cliente;

delete from itau.clientes -- where codigo_cliente > 4;
select * from itau.clientes;
insert into itau.clientes
(codigo_cliente, nome_cliente, idade_cliente, email_cliente, endereco_cliente, bairro_cliente)

(select codigo_cliente, nome_cliente, idade_cliente, email_cliente, endereco_cliente, bairro_cliente from itau.bck_cliente);

select * from itau.clientes;

select * from itau.bck_cliente2;
drop table itau.bck_cliente2;