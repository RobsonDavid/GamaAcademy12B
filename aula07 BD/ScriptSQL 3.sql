create database unibanco;
create table unibanco.clientes select * from itau.clientes;
select * from unibanco.clientes;
drop table itau.clientes;
create table itau.clientes (
codigo_cliente int not null , 
nome_cliente varchar(50) not null,
cpf_cliente char(11) not null, 
endereco_cliente varchar(80) not null,
bairro_cliente varchar(20) not null,
estado_cliente char(2) not null,
idade_cliente integer(3) not null,
ddd_cliente char(3) not null,
telefone char(9) not null,
agencia char(4) not null,
conta_corrente char(5) not null,
digito_verificador int(1) not null,
email_cliente varchar(80) not null,
data_modificacao_registro date not null,
primary key (codigo_cliente, cpf_cliente));

describe itau.clientes;

/*
x varchar(50) "José da Silva"  - digitou 13 dos 50 - utiliza 13
y char(50)    "José da silva"  -digitou 13 dos 50 - utlizar 50: 13 digitados e 37 brancos
w text(50) = igual char
*/


insert into itau.clientes 
( codigo_cliente  ,nome_cliente ,cpf_cliente ,endereco_cliente ,bairro_cliente ,estado_cliente ,idade_cliente ,ddd_cliente ,telefone ,agencia ,conta_corrente ,digito_verificador ,email_cliente ,data_modificacao_registro )
select codigo_cliente  ,nome_cliente ,"000" ,endereco_cliente ,bairro_cliente ,"XX" ,idade_cliente ,"000" ,"9999 9999" ,"1500" ,"05201" ,2 ,email_cliente , current_date() 
from unibanco.clientes;

select * from itau.clientes
