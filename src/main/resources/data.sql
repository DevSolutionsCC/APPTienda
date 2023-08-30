-- Insertando o Actualizando Authorities:

MERGE INTO authorities (username, authority) KEY(username) VALUES ('user2','USER'); 
MERGE INTO authorities (username, authority) KEY(username) VALUES ('admin2','ADMIN');
MERGE INTO productos (nombre, descripcion, precio) KEY(nombre) VALUES ('Nombre del Producto2', 'Descripción del Producto2', 99.990);
