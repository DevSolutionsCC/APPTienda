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


MERGE INTO proveedores (nombre,informacion_contacto) KEY(nombre) VALUES('ProvedorPRueba','Esto es una prueba');

INSERT INTO clientes (nombre, direccion, informacion_contacto)
SELECT 'Juan Pérez', 'Calle Falsa 123', 'Teléfono: 123-456-7890'
WHERE NOT EXISTS (SELECT 1 FROM clientes WHERE nombre = 'Juan Pérez');



INSERT INTO carritos (cliente_id)
SELECT id FROM clientes WHERE nombre = 'Juan Pérez';


INSERT INTO productos (descripcion, nombre,precio)
SELECT 'Producto', 'descripcion', 00
WHERE NOT EXISTS (SELECT 1 FROM productos  WHERE nombre = 'Producto');

INSERT INTO pedidos (descripcion, nombre,precio)
SELECT 'Producto', 'descripcion', 00
WHERE NOT EXISTS (SELECT 1 FROM productos  WHERE nombre = 'Producto');


INSERT INTO PEDIDOS (FECHA_PEDIDO, CLIENTE_ID) VALUES (CURRENT_DATE, 1);


INSERT INTO RESENAS_CALIFICACIONES (CALIFICACION, COMENTARIO, PRODUCTO_ID) 
VALUES (4, 'Buen producto', 1);

INSERT INTO DETALLES_PEDIDOS (CANTIDAD, PEDIDO_ID, PRODUCTO_ID) 
VALUES (2, 1, 1);

INSERT INTO PROMOCIONES (NOMBRE, DESCUENTO, FECHA_INICIO, FECHA_FIN) 
VALUES ('Descuento Verano', 10.0, '2023-07-01', '2023-07-31');
