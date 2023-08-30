
/*
Empresa        :  LibrosDigitales
Software       :  Sistema de Ventas
DBMS           :  Oracle
Esquema        :  ventas
Script         :  Crea el esquema con sus respectivas tablas
Responsable    :  Ing. Eric Gustavo Coronel Castillo
Telefono       :  (511) 9966-64457
Email          :  gcoronelc@gmail.com
Blog           :  http://gcoronelc.blogspot.com
*/

-- Valido pa partir de la version 12

ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;

-- =============================================
-- CRACIÓN DEL USUARIO
-- =============================================

DECLARE
	N INT;
	COMMAND VARCHAR2(200);
BEGIN
	COMMAND := 'DROP USER SISTEMAVENTAS CASCADE';
	SELECT COUNT(*) INTO N
	FROM DBA_USERS
	WHERE USERNAME = 'SISTEMAVENTAS';
	IF ( N = 1 ) THEN
		EXECUTE IMMEDIATE COMMAND;
	END IF;
END;
/

CREATE USER SISTEMAVENTAS IDENTIFIED BY admin;
ALTER USER SISTEMAVENTAS QUOTA UNLIMITED ON USERS;
GRANT CONNECT, RESOURCE, CREATE VIEW TO SISTEMAVENTAS;


-- =============================================
-- CONECTARSE A LA APLICACIÓN
-- =============================================

CONNECT SISTEMAVENTAS/admin


-- =============================================
-- CREACION DE TABLAS DE LOGUEO
-- =============================================

CREATE TABLE EMPLEADO
(
	idemp                INTEGER NOT NULL ,
	nombre               VARCHAR2(50) NOT NULL ,
	apellido             VARCHAR2(50) NOT NULL ,
	usuario              VARCHAR2(20) NOT NULL ,
	clave                VARCHAR2(20) NOT NULL ,
	CONSTRAINT pk_empleado PRIMARY KEY( idemp ) ,
	CONSTRAINT u_empleado_usuario UNIQUE (usuario)
);


CREATE SEQUENCE sq_empleado
INCREMENT BY 1
START WITH 1000;


insert into empleado(idemp,nombre,apellido,usuario,clave) 
values(sq_empleado.NextVal,'CLAUDIA','RAMOS','claudia','123456');

insert into empleado(idemp,nombre,apellido,usuario,clave) 
values(sq_empleado.NextVal,'ANGELICA','TORRES','angelica','123456');

insert into empleado(idemp,nombre,apellido,usuario,clave) 
values(sq_empleado.NextVal,'KARLA','GUTIERREZ','karla','123456');

commit;


-- =============================================
-- CREACION DE TABLAS DEL CATALOGO
-- =============================================


CREATE TABLE CATEGORIA
(
	idcat                INTEGER NOT NULL ,
	nombre               VARCHAR2(100) NOT NULL ,
	CONSTRAINT pk_categoria PRIMARY KEY( idcat ) ,
	CONSTRAINT u_categoria_nombre UNIQUE( nombre )
);


insert into categoria(idcat,nombre) values(1,'LINEA BLANCA');
insert into categoria(idcat,nombre) values(2,'MENAJE');
insert into categoria(idcat,nombre) values(3,'CAMA');
insert into categoria(idcat,nombre) values(4,'MUEBLES');
insert into categoria(idcat,nombre) values(5,'ROPA DE DAMAS');
insert into categoria(idcat,nombre) values(6,'ROPA DE CABELLEROS');
insert into categoria(idcat,nombre) values(7,'ROPA DE SEÑORITAS');
insert into categoria(idcat,nombre) values(8,'ROPA DE NIÑOS');
insert into categoria(idcat,nombre) values(9,'ROPA DE NIÑAS');
insert into categoria(idcat,nombre) values(10,'ELECTRODOMESTICOS');
insert into categoria(idcat,nombre) values(11,'COMPUTO');
commit;

CREATE SEQUENCE sq_categoria
INCREMENT BY 1
START WITH 12;


CREATE TABLE PRODUCTO
(
	idprod               INTEGER NOT NULL ,
	idcat                INTEGER NOT NULL ,
	nombre               VARCHAR2(100) NOT NULL ,
	precio               NUMBER(10,2) NOT NULL ,
	stock                INTEGER NOT NULL ,
	CONSTRAINT  PK_PRODUCTO PRIMARY KEY (idprod) ,
	CONSTRAINT FK_PRODUCTO_CATEGORIA FOREIGN KEY (idcat) REFERENCES CATEGORIA (idcat)
);


CREATE SEQUENCE sq_producto
INCREMENT BY 1
START WITH 100;

insert into producto(idprod,idcat,nombre,precio,stock)
values(sq_producto.nextval,1,'COCINA',900.0,456);

insert into producto(idprod,idcat,nombre,precio,stock)
values(sq_producto.nextval,7,'PANTALON',150.0,4567);

insert into producto(idprod,idcat,nombre,precio,stock)
values(sq_producto.nextval,1,'REFRIGERADORA',1300.0,690);

insert into producto(idprod,idcat,nombre,precio,stock)
values(sq_producto.nextval,7,'POLO DE VERANO',95.00,150);

insert into producto(idprod,idcat,nombre,precio,stock)
values(sq_producto.nextval,6,'CAMISA COLOR VERDE',140.00,250);

insert into producto(idprod,idcat,nombre,precio,stock)
values(sq_producto.nextval,6,'CAMISA DE CUADROS PEQUEÑOS',140.00,350);

insert into producto(idprod,idcat,nombre,precio,stock)
values(sq_producto.nextval,6,'PANTALON MODELO A1',1180.00,450);

commit;



-- =============================================
-- CREACION DE TABLAS DE VENTAS
-- =============================================

CREATE TABLE VENTA
(
	idventa              INTEGER NOT NULL ,
	cliente              VARCHAR2(100) NOT NULL ,
	idemp                INTEGER NULL ,
	fecha                DATE NOT NULL ,
	importe              NUMBER(10,2) NOT NULL ,
	CONSTRAINT  PK_VENTA PRIMARY KEY (idventa) ,
	CONSTRAINT FK_VENTA_EMPLEADO FOREIGN KEY (idemp) REFERENCES EMPLEADO (idemp)
);

CREATE SEQUENCE sq_venta
INCREMENT BY 1
START WITH 1;


CREATE TABLE DETALLE
(
	idventa              INTEGER NOT NULL ,
	idprod               INTEGER NOT NULL ,
	cant                 NUMBER NOT NULL ,
	precio               NUMBER(10,2) NOT NULL ,
	subtotal             NUMBER(10,2) NULL ,
	CONSTRAINT  PK_DETALLE PRIMARY KEY (idventa,idprod) ,
	CONSTRAINT FK_DETALLE_PRODUCTO FOREIGN KEY (idprod) REFERENCES PRODUCTO(idprod) ,
	CONSTRAINT FK_DETALLE_VENTA FOREIGN KEY (idventa) REFERENCES VENTA (idventa)
);



-- =============================================
-- CREACION DE TABLAS DE PAGOS
-- =============================================


CREATE TABLE TIPO_PAGO
(
	idtipo               INTEGER NOT NULL ,
	nombre               VARCHAR2(50) NOT NULL ,
	CONSTRAINT  PK_TIPO_PAGO PRIMARY KEY (idtipo)
);


INSERT INTO TIPO_PAGO(IDTIPO,NOMBRE) VALUES(1,'EFECTIVO');
INSERT INTO TIPO_PAGO(IDTIPO,NOMBRE) VALUES(2,'TARJETA CREDITO');
INSERT INTO TIPO_PAGO(IDTIPO,NOMBRE) VALUES(3,'TARJETA DE DEBITO');
INSERT INTO TIPO_PAGO(IDTIPO,NOMBRE) VALUES(4,'CHEQUE');
INSERT INTO TIPO_PAGO(IDTIPO,NOMBRE) VALUES(5,'NOTA DE CREDITO');
INSERT INTO TIPO_PAGO(IDTIPO,NOMBRE) VALUES(6,'BONO EFECTIVO');
COMMIT;	


CREATE TABLE PAGO
(
	idventa              INTEGER NOT NULL ,
	item                 INTEGER NOT NULL ,
	idtipo               INTEGER NOT NULL ,
	detalle              VARCHAR2(50) NOT NULL ,
	importe              NUMBER(10,2) NOT NULL ,
	obs                  NVARCHAR2(1000) NOT NULL ,
	CONSTRAINT  PK_PAGO PRIMARY KEY (idventa,item) ,
	CONSTRAINT FK_PAGO_VENTA FOREIGN KEY (idventa) REFERENCES VENTA (idventa) ,
	CONSTRAINT FK_PAGO_TIPO FOREIGN KEY (idtipo) REFERENCES TIPO_PAGO (idtipo)
);


