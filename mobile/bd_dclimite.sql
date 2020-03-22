create database if not exists DCLimite;
use DCLimite;

create table if not exists perguntas(
id int not null auto_increment,
pergunta varchar(250) not null,
resposta varchar(100) not null,
dificuldade Enum('F','M','D') not null,
alternativa2 varchar(100) not null,
alternativa3 varchar(100) not null,
alternativa4 varchar(100) not null,
primary Key (id)
);

create table if not exists usuarios(
iduser int not null auto_increment,
nickname varchar(20) not null,
email varchar(55) not null,
senha varchar(12) not null,
pontuacao int,
primary key (iduser)
);

insert into perguntas(id,pergunta,resposta,alternativa2,alternativa3,alternativa4,dificuldade)
values(null,'No início da série a qual deus nordico os gemios haviam se dedicado?','Loki','Odin','Thor','Sif','F'),
	  (null,'Qual o nome do navio que devia ser evitado a qualquer custo, segundo o Johann:','O Ceifeiro','O Cruzeiro','O Justiceiro','O Cesteiro','F'),
	  (null,'Qual a especie do Dragão, na qual o dente era a chave do Olho de Dragão?','Fantasma da Neve','Canção da Morte','Terror dos Mares','Terror das Neves','F');

drop database dclimite;