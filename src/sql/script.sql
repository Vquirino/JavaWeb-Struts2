drop database if exists aula;
create database aula;
use aula;

create table pessoa(
	idpessoa		integer			auto_increment		primary key,
	nome			varchar(35)		not null,
	datanasc		date			not null
);

desc pessoa;