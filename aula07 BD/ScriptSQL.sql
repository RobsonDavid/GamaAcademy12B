-- create database itau;
-- use itau;
create table itau.clientes (
codigo_cliente integer not null primary key, 
nome_cliente varchar(50) not null,
idade_cliente integer(3) not null,
email_cliente varchar(80) not null
);
describe itau.clientes
insert into itau.clientes 
(codigo_cliente, nome_cliente, idade_cliente, email_cliente)
values 
(1, "Cliente Um", 40, "clienteum@aol.com"),
(2, "Cliente Dois", 18, "clientedois@aol.com"),
(3, "Cliente 333", 33, "cliente333@aol.com"),
(4, "Cliente 4", 44, "cliente4@aol.com");
select count(*) from itau.clientes
select * from itau.clientes
update itau.clientes set email_cliente = "clienteum111@aol.com.br" where codigo_cliente  =1;
delete from itau.clientes where codigo_cliente = 4;
select codigo_cliente, nome_cliente, idade_cliente from itau.clientes order by nome_cliente;
select nome_cliente, idade_cliente from itau.clientes where idade_cliente between 90 and 100 order by idade_cliente desc;
/* alter table itau.clientes rename column idade_cliente to age_clientes; 
alter table itau.clientes rename column age_clientes to idade_cliente ; */
use itau;
-- INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (5,"Charde Herman",81,"placerat@aptent.com"),(6,"Odysseus Burks",90,"Proin.nisl@Duiscursusdiam.net"),(7,"Kirk Z. Peters",100,"adipiscing@magna.edu"),(8,"Tara T. Mack",26,"purus.mauris@In.co.uk"),(9,"Venus Schroeder",49,"pede@Duiscursus.net"),(10,"Abbot Gibson",58,"Nam@senectusetnetus.net"),(11,"Shafira Q. Maldonado",97,"Curabitur.dictum@Proineget.ca"),(12,"Alan Moss",79,"mauris.a@facilisis.org"),(13,"Leila L. Key",25,"augue.malesuada.malesuada@rutrumurnanec.ca"),(14,"Griffin Hampton",40,"Aliquam.adipiscing@enim.com");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (15,"Sydnee H. Norman",53,"ipsum.ac@erat.co.uk"),(16,"Scott Mckee",72,"nec@liberoMorbi.net"),(17,"Baker Pitts",68,"rutrum@vitae.co.uk"),(18,"Blake Kinney",42,"metus@nibhDonecest.edu"),(19,"Adrian Calhoun",61,"mauris.Suspendisse@nibhdolor.ca"),(20,"Demetrius O. Becker",41,"tincidunt.pede@viverraMaecenas.org"),(21,"Brianna V. Barnett",43,"a@sodalespurus.net"),(22,"Brennan Davis",71,"rhoncus.Proin@mauris.edu"),(23,"Gisela Hewitt",35,"dignissim.Maecenas.ornare@eunullaat.com"),(24,"Noelle S. Zimmerman",70,"odio.auctor@Nam.org");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (25,"Dieter Buckner",79,"sed.sapien@Proin.org"),(26,"Donna Vega",22,"vehicula.et.rutrum@Maurisvestibulumneque.com"),(27,"Simon Meyer",56,"ante.dictum.mi@diam.org"),(28,"Mari Grant",26,"libero@vehiculaaliquet.com"),(29,"Joshua U. Giles",65,"commodo@lectusjustoeu.com"),(30,"Kelly P. Ballard",39,"eros.turpis.non@nonleoVivamus.net"),(31,"Harper C. Chase",51,"tincidunt.vehicula@ligulaconsectetuer.com"),(32,"Zephania Velasquez",20,"Sed@molestie.co.uk"),(33,"Nero V. Camacho",49,"non.vestibulum@enim.edu"),(34,"Claudia Stevens",44,"lacus.Etiam@blandit.com");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (35,"Bryar Gill",31,"dictum.eleifend@semegestasblandit.edu"),(36,"Devin Hale",85,"arcu.Vivamus@inaliquetlobortis.edu"),(37,"Reed A. Moses",59,"condimentum.eget.volutpat@disparturientmontes.co.uk"),(38,"Astra Y. White",45,"cursus@magnisdis.edu"),(39,"Yoko Bates",53,"lacus.Quisque@Sed.org"),(40,"Freya Roach",85,"vitae.posuere@mi.edu"),(41,"Germaine Lott",79,"sodales@liberoIntegerin.ca"),(42,"Oliver Gill",82,"eget.varius.ultrices@sit.org"),(43,"Nina A. Serrano",82,"fames.ac@Duis.ca"),(44,"John O. Burton",71,"nec.enim@eu.edu");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (45,"Vance Parsons",86,"nulla@viverraMaecenas.net"),(46,"Lenore Z. Rich",99,"erat.eget@aarcu.net"),(47,"Karen H. Sullivan",100,"cursus@pedenec.edu"),(48,"Baker D. Morrison",84,"neque.Morbi@Donec.net"),(49,"Kyra Taylor",33,"metus.In@sodalesnisi.edu"),(50,"Christopher K. Blackburn",37,"Suspendisse.sed@ultricesDuisvolutpat.ca"),(51,"Rinah P. Love",78,"Donec@sedhendrerit.ca"),(52,"Bert Q. Munoz",79,"Donec@eros.net"),(53,"Gloria D. Hunter",63,"venenatis@est.edu"),(54,"Hedwig Wiley",85,"dui@Nam.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (55,"Berk A. Bolton",89,"ut.lacus@ultrices.net"),(56,"Suki Black",56,"dolor.Fusce.mi@Donecsollicitudinadipiscing.co.uk"),(57,"Henry K. Weiss",90,"aliquet.metus@vitaesodales.ca"),(58,"Porter C. Robbins",82,"dui.lectus@Pellentesquehabitantmorbi.edu"),(59,"Anne Stein",70,"eget.dictum.placerat@sitametluctus.ca"),(60,"Desirae A. Foreman",47,"arcu.imperdiet.ullamcorper@acmattisvelit.net"),(61,"Bianca Hickman",49,"commodo.ipsum.Suspendisse@sodalesMauris.co.uk"),(62,"Colorado Whitley",99,"Mauris.magna.Duis@elit.org"),(63,"Ora W. Ewing",73,"lectus@mauris.org"),(64,"Raja Blankenship",61,"risus.quis.diam@Duis.com");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (65,"Trevor H. Finch",94,"velit@luctus.edu"),(66,"Donna J. Greene",84,"sit@vestibulumneque.com"),(67,"Cade Q. Hutchinson",83,"facilisis@Vivamus.net"),(68,"Sebastian G. Cross",58,"blandit.Nam@gravidaAliquamtincidunt.ca"),(69,"MacKenzie H. Hodges",58,"Fusce.aliquam.enim@Duis.com"),(70,"Demetrius Elliott",59,"ante.ipsum.primis@molestie.com"),(71,"Quinn Pearson",62,"bibendum.sed@nunc.com"),(72,"Audrey Parks",72,"nisi.Aenean@commodo.ca"),(73,"Susan R. Contreras",35,"tristique@risus.org"),(74,"Hunter Harmon",75,"tortor.Nunc.commodo@magna.org");
use itau;
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (75,"Tucker Franklin",74,"vel@penatibusetmagnis.ca"),(76,"Reagan Howell",64,"nunc@Curabiturut.ca"),(77,"Simone Shields",40,"metus.sit@id.org"),(78,"Abbot Cunningham",81,"penatibus.et@mi.com"),(79,"Tatyana N. Elliott",55,"pellentesque.eget@anteblanditviverra.ca"),(80,"Kylan X. Hull",28,"litora.torquent.per@Proin.co.uk"),(81,"Wynne D. Wilcox",35,"Mauris.ut.quam@liberoest.net"),(82,"Adrienne Chavez",39,"facilisis.lorem.tristique@eratEtiamvestibulum.edu"),(83,"Fleur Y. Russell",87,"odio.Phasellus@metus.com"),(84,"Emmanuel D. Walsh",85,"metus.facilisis.lorem@ametorciUt.net");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (85,"Kameko T. Fleming",81,"tortor@ornarefacilisis.ca"),(86,"Irma D. Maxwell",83,"mollis.Duis@elit.co.uk"),(87,"Burke K. Battle",95,"montes@milorem.edu"),(88,"Kieran T. Carrillo",52,"quam@dolor.co.uk"),(89,"Jocelyn I. Hayes",73,"hendrerit@euneque.com"),(90,"Joy J. Hahn",41,"Lorem@acurnaUt.edu"),(91,"Brendan Vazquez",89,"Nulla@tristique.edu"),(92,"Quinlan O. Bender",78,"dolor.elit.pellentesque@blandit.net"),(93,"Ina Terry",91,"urna.Nullam@etcommodo.co.uk"),(94,"Tanya Burks",68,"bibendum@Suspendisse.org");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (95,"Yolanda B. Blanchard",53,"purus.Duis.elementum@dictumplacerat.ca"),(96,"Mechelle T. Burch",22,"iaculis.quis.pede@augueacipsum.co.uk"),(97,"Miriam Mcgee",19,"Nunc@orciUtsagittis.co.uk"),(98,"Emerson K. Sparks",96,"a@aliquet.co.uk"),(99,"Quintessa N. Wilkins",88,"nisi.dictum.augue@aaliquet.com"),(100,"Kirsten Bean",73,"nunc.interdum.feugiat@fringillaporttitor.org"),(101,"Madeline Q. Fox",54,"a@dolorFuscemi.net"),(102,"Maggie Craig",58,"vitae.sodales@metussitamet.com"),(103,"Kirsten V. Malone",90,"tempor.bibendum@nislQuisquefringilla.org"),(104,"Murphy U. Duffy",22,"Etiam@Pellentesquehabitantmorbi.com");

select * from itau.clientes where idade_cliente >= 18 and idade_cliente <= 30 order by idade_cliente
select max(idade_cliente) from itau.clientes;
select * from itau.clientes where idade_cliente = (select max(idade_cliente) from itau.clientes); -- resolve da direita para esquerda
select * from itau.clientes where idade_cliente = (select min(idade_cliente) from itau.clientes); 

alter table itau.clientes add column    bairro_cliente varchar(80) not null;



update itau.clientes set endereco_cliente = "Rua Fabia, 111 - Lapa - São Paulo - SP" where codigo_cliente = 3;


select * from itau.clientes where idade_cliente in (20, 30, 40);

alter table itau.clientes add column endereco_cliente varchar(80) not null;

select * from itau.clientes where endereco_cliente <> "" 
-- is not null -- <> "" -- is not null;

update itau.clientes set bairro_cliente = "Lapa" where codigo_cliente = 3;
select * from itau.clientes where codigo_cliente = 3;

select * from itau.clientes where nome_cliente like "Cliente%";
select * from itau.clientes where nome_cliente like "%Cl%";
select * from itau.clientes where nome_cliente like "%s";