create table itau.produto (
codigo_produto integer not null auto_increment primary key,
nome_produto varchar(50) not null,
quantidade_produto integer(4) not null,
valor_unitario_produto decimal(8,2) not null);

describe itau.produto;

select * from itau.produto;

insert into itau.produto (nome_produto , quantidade_produto , valor_unitario_produto )
values
("Batedeira", 100, 128.50),
("Geladeira", 100, 1890.50),
("Fogao", 100, 1890.50),
("Microondas", 50, 485.99);

select * from itau.produto;

describe itau.produto;

use itau;
alter table produto add column cidade varchar(20) null;

update produto set cidade = "São Paulo" where codigo_produto in (1,2,3);
update produto set cidade = "Rio de Janeiro" where codigo_produto in (4,5,6);

select codigo_produto, nome_produto, (quantidade_produto * valor_unitario_produto) as total from produto;
SELECT 
    cidade,
    SUM(quantidade_produto * valor_unitario_produto) AS total
FROM
    produto
WHERE
    cidade IS NOT NULL
GROUP BY cidade;

select * from produto where cidade is not null

alter table produto add marca_produtos varchar(40) ;
alter table produto drop marca_produtos;
alter table produto rename column marca_produtos to marca_produto; 
alter table produto modify marca_produtos varchar(50) not null;

update produto set marca_produtos = "brastempX" where codigo_produto in (4,5,6);
update produto set marca_produtos = "electroluxY" where codigo_produto in (1,2,3);

select marca_produto, count(*) as qtde from produto group by marca_produto;
select marca_produto, count(*) as qtde , SUM(quantidade_produto * valor_unitario_produto) AS total
from produto group by marca_produto;

