create database if not exists ControleTech3;
use ControleTech3;

drop table if exists compras;
drop table if exists produtos;
drop table if exists fornecedores;
drop table if exists funcionarios;
drop table if exists usuarios;

create table usuarios(
	id 				int					not null		primary key 	auto_increment,
    nome			varchar(70)			not null,
    email			varchar(50)			not null,
    cpf				varchar(14)			not null,
    sexo			varchar(20)		 	not null,
    celular			varchar(14)			not null,
    senha			varchar(50)			not null
);

create table funcionarios(
	id 				int 				not null 		primary key 	auto_increment,
	nome 			varchar(70) 		not null,
	email 			varchar(50) 		not null,
    celular			varchar(14)			not null,
	cpf 			varchar(14) 		not null,
	sexo 			varchar(20) 		not null,
	data_nasc 		date 				not null,
	endereco 		varchar(100) 		not null,
	cidade 			varchar(45) 		not null,
	estado 			varchar(2) 			not null,
	data_ingresso 	date 				not null,
	salario 		float(8,2)			not null
);

create table fornecedores (
id_fornecedor			int				not null		primary key		auto_increment,
nome_fornecedor			varchar(70) 	not null,
cnpj					varchar(25),
descricao				varchar(300),
data_contrato			date,
celular					varchar(14),
email					varchar(75)
);

create table produtos (
id_produto				int		 		not null		primary key		auto_increment,
nome_produto			varchar(70)		not null,
quantidade_estoque		float			not null,
descricao				varchar(300),
data_validade			date,
preco					decimal(10,2),
id_fornecedor			int 			not null,
foreign key (id_fornecedor) 	references fornecedores (id_fornecedor)
);

insert into fornecedores values (1,"Microsoft","14.137.142/0001","Empresa de Software","1999/10/21","(11)97837-2323","contato@microsoft.com"),
								(2,"Adidas","45.648.123/0001","Empresa de Roupa","1998/11/08","(19)98456-8585","adidas@adidas.com");

create table compras(
id_compra 				int 			not null		primary key,
id_produto				int 			not null,
id_funcionario			int 			not null,
quantidade				float			not null,
data_compra				date			not null,
peso					float,
foreign key (id_produto) 		references produtos (id_produto),
foreign key (id_funcionario) 	references funcionarios (id)
);

