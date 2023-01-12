create database if not exists sistriagem;

use sistriagem;

create table if not exists sis_perfil(
id int(11) not null auto_increment,
descricao varchar(15) not null,
primary key(id)
);

create table if not exists sis_usuario(
id int(11) not null auto_increment,
nome varchar(255) not null unique,
login varchar(50) not null unique,
senha varchar(25) not null,
perfil_id int(11),
primary key (id),
foreign key (perfil_id) references sis_perfil(id)
);

create table if not exists sis_contato(
id int(11) not null auto_increment,
tipo varchar(15) not null,
numero varchar(10) not null,
primary key (id)
);

create table if not exists sis_endereco(
id int(11) not null auto_increment,
cep varchar(8) not null,
logradouro varchar(255) not null,
numero varchar(5) not null,
bairro varchar(20) not null,
complemento varchar(255),
estado char(2) not null,
primary key (id)
);

create table if not exists sis_paciente(
id int(11) not null auto_increment,
nome varchar(255) not null unique,
cpf varchar(14) not null unique,
sexo char(2) not null,
data_nascimento date not null,
endereco_id int(11) not null,
contato_id int(11) not null,
primary key(id, cpf),
foreign key(endereco_id) references sis_endereco(id),
foreign key(contato_id) references sis_contato(id)
);

create table if not exists sis_medico(
id int(11) not null auto_increment,
nome varchar(255) not null unique,
especialidade varchar(50) not null,
crm varchar(15) not null,
uf_crm char(2) not null,
primary key(id)
);


create table if not exists sis_consulta(
id int(11) not null auto_increment,
paciente_id int(11) not null,
medico_id int(11) not null,
nome_consulta varchar(255) not null,
cid int(11) not null,
horario datetime not null,
primary key (id),
foreign key (paciente_id) references sis_paciente(id),
foreign key (medico_id) references sis_medico(id)
);

insert into sis_perfil (id,descricao) VALUES(1,'administrador');

