use myproject;

create table mtb310_ag_financeiro(
   id_agente integer not null auto_increment,  
   nome_agente varchar(100),
   volume_transacional float,
   constraint pk_agente primary key (id_agente)
);

create table mtb310_transaction(
    id_transacao integer not null auto_increment,
    data_hora datetime,
    dispositivo integer,
    valor_solic float,
    valor_aut  float,
    status integer,
    ag_financeiro integer not null,
    constraint pk_trans primary key (id_transacao),
    constraint fk_agente foreign key (ag_financeiro) references mtb310_ag_financeiro(id_agente)
);


insert into mtb310_ag_financeiro values 
    (null, 'xxxS CLUB Mastercard',1),
    (null, 'xxxRA Cartoes VISA',2),
    (null, 'xxxEFOUR Credito Master',3);
    
    
    