CREATE DATABASE MARKETPLACE CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE MARKETPLACE;

CREATE TABLE articulo (
  id_articulo INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  precio DECIMAL(10,2) NULL,
  stock INT NULL,
  PRIMARY KEY (id_articulo));

CREATE TABLE usuario (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(100) NULL,
  password VARCHAR(100) NULL,
  PRIMARY KEY (id_usuario));

CREATE TABLE pedido (
  id_pedido INT NOT NULL AUTO_INCREMENT,
  fecha DATE NOT NULL,
  nombre VARCHAR(100) NOT NULL,
  id_usuario INT NOT NULL,
  PRIMARY KEY (id_pedido),
    FOREIGN KEY (id_usuario)
    REFERENCES usuario (id_usuario));

CREATE TABLE articulo_pedido (
  id_articulo_pedido INT NOT NULL AUTO_INCREMENT,
  cantidad INT NULL,
  id_articulo INT NOT NULL,
  id_pedido INT NOT NULL,
  PRIMARY KEY (id_articulo_pedido),
    FOREIGN KEY (id_articulo)
    REFERENCES articulo (id_articulo),
    FOREIGN KEY (id_pedido)
    REFERENCES pedido (id_pedido));