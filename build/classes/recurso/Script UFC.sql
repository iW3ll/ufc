create database cadastroP;

use cadastroP;

create table pessoas(
id  int auto_increment,
data_nascimento Date not null,
nome varchar(50) not null
);

select *from pessoas;
