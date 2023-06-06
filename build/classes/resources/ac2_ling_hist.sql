create database if not exists ControleTech;
use ControleTech;

drop table if exists funcionarios;
drop table if exists terceiros;

create table usuarios(
	id 				int				not null	primary key 	auto_increment,
    nome			varchar(70)		not null,
    email			varchar(50)		not null,
    cpf				varchar(14)		not null,
    sexo			varchar(20) 	not null,
    celular			varchar(14)		not null,
    senha			varchar(50)		not null
);

create table funcionarios(
	id 				int 			not null 	primary key 	auto_increment,
	nome 			varchar(70) 	not null,
	email 			varchar(50) 	not null,
	cpf 			varchar(14) 	not null,
	sexo 			varchar(20) 	not null,
	data_nasc 		date 			not null,
	endereco 		varchar(100) 	not null,
	cidade 			varchar(45) 	not null,
	estado 			varchar(2) 		not null,
	carteira_trab 	varchar(45) 	not null,
	data_ingresso 	date 			not null,
	salario 		float(8,2)		not null
);

create table terceiros(
	rg 				varchar(14) 	not null 	primary key,
	nome 			varchar(70) 	not null,
    celular			varchar(14)		not null,
	sexo 			varchar(20) 	not null,
	data_nasc		date 			not null,
    data_in			date			not null,
    data_out		date			not null,
    setor			varchar(45)		not null
);


insert into funcionarios (id, nome, email, celular, cpf, sexo, data_nasc, endereco, cidade, estado, carteira_trab, data_ingresso, salario) values (default, 'Gabriel', 'yamaya.gabriel@gmail.com', 
'(15)99682-2413', '464.188.358-08', 'Masculino', date'2003-09-29', 'Rua Major João Elias 85', 'Sorocaba', 'SP', '44455566652', date'2022-12-05', 1506.00);
insert into terceiros (rg, nome, celular, sexo, data_nasc, setor) values ('57.107.620-7', 'Gabriel Queiroz Pereira Yamaya', '(15)99682-2413', 'Masculino', date'2023-05-14', 'Almoxarifado');

delimiter $
create procedure UpdFuncionarios(
	id1 			int,
    nome1 			varchar(70),
    email1			varchar(50),
    celular1		varchar(14),
    cpf1			varchar(14),
    sexo1 			varchar(20),
    data_nasc1 		date,
    endereco1		varchar(100),
    cidade1			varchar(45),
    estado1			varchar(2),
    carteira_trab1	varchar(45),
    data_ingresso1	date,
    salario1		float
	) 
begin
    if (nome1 != null) then
		update funcionarios set nome = nome1 where id = id1;
        end if;
	if (email1 != null) then
		update funcionarios set email = email1 where id = id1;
        end if;
	if (cpf1 != null) then
		update funcionarios set cpf = cpf1 where id = id1;
        end if;
	if (sexo1 != null) then
		update funcionarios set sexo = sexo1 where id = id1;
        end if;
	if (data_nasc1 != null) then
		update funcionarios set data_nasc = data_nasc1 where id = id1;
        end if;
	if (endereco1 != null) then
		update funcionarios set endereco = endereco1 where id = id1;
        end if;
	if (cidade1 != null) then
		update funcionarios set cidade = cidade1 where id = id1;
        end if;
	if (estado1 != null) then
		update funcionarios set estado = estado1 where id = id1;
        end if;
    if (carteira_trab1 != null) then
		update funcionarios set carteira_trab = carteira_trab1 where id = id1;    
        end if;
	if (data_ingresso1 != null) then
		update funcionarios set data_ingresso = data_ingresso1 where id = id1;
        end if;
    if (salario1 != null) then
		update funcionarios set salario = salario1 where id = id1;  
        end if;
end$
delimiter ;