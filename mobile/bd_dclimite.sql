create database if not exists DCLimite;
use DCLimite;

create table if not exists perguntas(
id int not null auto_increment,
pergunta varchar(200) not null,
respota varchar(250) not null,
dificuldade Enum('F','M','D'),
primary Key (id)
);
drop database dclimite;