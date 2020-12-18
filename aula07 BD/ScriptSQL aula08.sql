create database aula08;

describe aula08.user;

use aula08;

insert into aula08.user values (null, "123456", "fulano@aol.com", "Fulano", "Abc#1");
insert into aula08.user values (null, "111111", "mary@aol.com", "Mary", "Xyz#1");

select * from aula08.user;

select * from aula08.user where email like 'fred%';

describe aula08.anuncio;
insert into aula08.anuncio values (null, "venda carro mno", 10000);
select * from aula08.anuncio;
