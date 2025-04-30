DROP DATABASE IF EXISTS login;

CREATE DATABASE login;

USE login;

DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios(
	id_usu INT PRIMARY KEY NOT NULL,
    nom_usu VARCHAR (100) NOT NULL,
    passwd VARCHAR (100) NOT NULL
);


INSERT INTO usuarios (id_usu, nom_usu, passwd) VALUES (1, 'admin', 'admin');

