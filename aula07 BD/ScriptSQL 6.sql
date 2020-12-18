use itau;
create table itau.cargos(
cod_cargo char(2) not null,
nome_cargo varchar(50) not null,
valor_cargo decimal(8,2) not null,
primary key (cod_cargo));

create table itau.funcionario(
matricula int not null auto_increment,
nome_funcionario varchar(50) not null,
cod_cargo char(2) not null,
primary key (matricula),
foreign key (cod_cargo) references cargos(cod_cargo));

insert into itau.cargos
(cod_cargo,nome_cargo,valor_cargo)
values
("C1","Analista de Sistemas",6500.50),
("C2","DBA em banco de dados",7580.00),
("C3","Gerente de CPD",5980.00),
("C4","Estagiário Jovem Aprendiz",1850.00);

insert into itau.funcionario
(nome_funcionario,cod_cargo)
values
("Bruno Moreira","C1"),
("Caetano Jesus","C2"),
("Diego Vinicius","C2"),
("Robson David","C3"),
("Ana Carolina","C3"),
("Ricardo A. Bontempo","C4");

select * from itau.cargos;
select * from itau.funcionario;
select f.nome_funcionario, c.nome_cargo, c.valor_cargo
-- select *
from itau.funcionario as f, itau.cargos as c 
where f.cod_cargo = c.cod_cargo;

select f.nome_funcionario, c.nome_cargo, c.valor_cargo
from itau.funcionario as f inner join itau.cargos as c 
on f.cod_cargo = c.cod_cargo;
select f.nome_funcionario, c.nome_cargo, c.valor_cargo
from itau.funcionario as f left join itau.cargos as c 
on f.cod_cargo = c.cod_cargo;
select f.nome_funcionario, c.nome_cargo, c.valor_cargo
from itau.funcionario as f right join itau.cargos as c 
on f.cod_cargo = c.cod_cargo;

select  c.nome_cargo, count(f.nome_funcionario) as qtde
from itau.funcionario as f right join itau.cargos as c 
on (f.cod_cargo = c.cod_cargo)
group by c.nome_cargo;

select  c.nome_cargo, count(f.nome_funcionario) as qtde, sum(c.valor_cargo) as valor
from  itau.cargos as c left join itau.funcionario as f 
on (f.cod_cargo = c.cod_cargo)
group by c.cod_cargo;