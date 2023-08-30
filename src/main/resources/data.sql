-- Insertando o Actualizando Authorities:

MERGE INTO authorities (username, authority) KEY(username) VALUES ('user2','USER'); 
MERGE INTO authorities (username, authority) KEY(username) VALUES ('admin2','ADMIN');
MERGE INTO categorias_productos (nombre) KEY(nombre) VALUES ('Abrigos');
MERGE INTO categorias_productos (nombre) KEY(nombre) VALUES ('Chaquetas');
MERGE INTO categorias_productos (nombre) KEY(nombre) VALUES ('Tops y Poleras');
MERGE INTO categorias_productos (nombre) KEY(nombre) VALUES ('Faldas');
MERGE INTO categorias_productos (nombre) KEY(nombre) VALUES ('Pantalones y Calzas');
MERGE INTO categorias_productos (nombre) KEY(nombre) VALUES ('Accesorios');
MERGE INTO categorias_productos (nombre) KEY(nombre) VALUES ('Blusas');
MERGE INTO categorias_productos (nombre) KEY(nombre) VALUES ('prueba');
