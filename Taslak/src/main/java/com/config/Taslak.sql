create database Taslak;

create table user(
id int auto_increment,
name varchar(25),
username varchar(25),
constraint pk_User primary key(id));

create table book(
id int auto_increment,
uid int,
name varchar(25),
author varchar(25),
constraint fk_Usr foreign key(uid) references user(id),
constraint pk_Book primary key(id)); 