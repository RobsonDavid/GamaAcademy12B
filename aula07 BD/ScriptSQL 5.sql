use itau;
 CREATE TABLE `Produtos` (
	`cod_produto` int NOT NULL AUTO_INCREMENT,
	`nom_produto` varchar(50) NOT NULL,
	`cod_marca` int NOT NULL,
	PRIMARY KEY (`cod_produto`)
);

CREATE TABLE `Marca` (
	`cod_marca` int NOT NULL AUTO_INCREMENT,
	`nome_marca` varchar(30) NOT NULL,
	PRIMARY KEY (`cod_marca`)
);

ALTER TABLE `Produtos` ADD CONSTRAINT `Produtos_fk0` FOREIGN KEY (`cod_marca`) REFERENCES `Marca`(`cod_marca`);

select * from marca;
select * from produtos;

insert into produtos ( nom_produto, cod_marca) values ("Mouse", 5);
insert into marca (nome_marca) values ("Microsoft") , ("Epson") , ("HP");
delete from marca where cod_marca = 5; -- foreign 1o produto e depois a marca
delete from marca where cod_marca = 6; 
 delete from produtos where cod_marca = 4; delete from marca where cod_marca = 4; -- foreign 1o produto e depois a marca

select p.nom_produto, p.cod_marca, m.nome_marca from itau.produtos as p join itau.marca as m  on p.cod_marca = m.cod_marca;
select p.nom_produto, p.cod_marca, m.nome_marca from itau.produtos as p , itau.marca as m  where p.cod_marca = m.cod_marca;