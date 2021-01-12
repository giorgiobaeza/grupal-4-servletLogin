--DROP PARA ELIMINAR LAS TABLAS
DROP TABLE accidente CASCADE CONSTRAINTS;

DROP TABLE administrativo CASCADE CONSTRAINTS;

DROP TABLE asesoria CASCADE CONSTRAINTS;

DROP TABLE asistentes CASCADE CONSTRAINTS;

DROP TABLE capacitacion CASCADE CONSTRAINTS;

DROP TABLE chequeo CASCADE CONSTRAINTS;

DROP TABLE cliente CASCADE CONSTRAINTS;

DROP TABLE detallechequeo CASCADE CONSTRAINTS;

DROP TABLE mejoras CASCADE CONSTRAINTS;

DROP TABLE pagos CASCADE CONSTRAINTS;

DROP TABLE profesional CASCADE CONSTRAINTS;

DROP TABLE usuario CASCADE CONSTRAINTS;

DROP TABLE visita CASCADE CONSTRAINTS;

--DROP PARA ELIMINAR SECUENCIAS
DROP SEQUENCE proyecto.mejoras_idmejoras_seq; 

DROP SEQUENCE proyecto.pagos_idpagos_seq; 

--SE CREA TABLA ACCIDENTE
CREATE TABLE accidente (
    idaccidente            NUMBER(9) NOT NULL,
    accifecha              DATE,
    accihora               DATE,
    accilugar              VARCHAR2(50) NOT NULL,
    acciorigen             VARCHAR2(100),
    acciconsecuencias      VARCHAR2(100),
    cliente_rutcliente   NUMBER(9) NOT NULL
)
LOGGING;

ALTER TABLE accidente ADD CONSTRAINT accidente_pk PRIMARY KEY ( idaccidente );

--SE CREA TABLA ADMINISTRATIVO Y SU PK
CREATE TABLE administrativo (
    run          NUMBER(9) NOT NULL,
    nombres      VARCHAR2(30) NOT NULL,
    apellidos    VARCHAR2(50) NOT NULL,
    email        VARCHAR2(50) NOT NULL,
    area         VARCHAR2(50) NOT NULL,
    usuario_run  NUMBER(9) NOT NULL
)
LOGGING;

ALTER TABLE administrativo ADD CONSTRAINT administrativo_pk PRIMARY KEY ( run );

--SE CREA TABLA ASESORIA Y SU PK
CREATE TABLE asesoria (
    idasesoria          NUMBER(9) NOT NULL,
    fecha               DATE NOT NULL,
    motivo              VARCHAR2(100) NOT NULL,
    profesional_run   NUMBER(9) NOT NULL
)
LOGGING;

ALTER TABLE asesoria ADD CONSTRAINT asesoria_pk PRIMARY KEY ( idasesoria );

--SE CREA TABLA ASISTENTES Y SU PK
CREATE TABLE asistentes (
    idasistente                  NUMBER(9) NOT NULL,
    asistnombrecompleto          VARCHAR2(100) NOT NULL,
    asistedad                    NUMBER(3) NOT NULL,
    asistcorreo                  VARCHAR2(70),
    asisttelefono                VARCHAR2(20),
    capacitacion_idcapacitacion  NUMBER(9) NOT NULL
)
LOGGING;

ALTER TABLE asistentes ADD CONSTRAINT asistentes_pk PRIMARY KEY ( idasistente );

--SE CREA TABLA CAPACITACION Y SU PK
CREATE TABLE capacitacion (
    idcapacitacion         NUMBER(9) NOT NULL,
    capfecha               DATE,
    caphora                DATE,
    caplugar               VARCHAR2(50) NOT NULL,
    capduracion            NUMBER(3),
    cliente_rutcliente   NUMBER(9) NOT NULL
)
LOGGING;

ALTER TABLE capacitacion ADD CONSTRAINT capacitacion_pk PRIMARY KEY ( idcapacitacion );

--SE CREA TABLA CHEQUEO Y SU PK
CREATE TABLE chequeo (
    idchequeo      NUMBER(9) NOT NULL,
    nombrechequeo  VARCHAR2(50) NOT NULL
)
LOGGING;

ALTER TABLE chequeo ADD CONSTRAINT chequeo_pk PRIMARY KEY ( idchequeo );

--SE CREA TABLA CLIENTE Y SU PK
CREATE TABLE cliente (
    rutcliente        NUMBER(9) NOT NULL,
    clinombres        VARCHAR2(30) NOT NULL,
    cliapellidos      VARCHAR2(50) NOT NULL,
    clitelefono       VARCHAR2(20) NOT NULL,
    cliafp            VARCHAR2(30),
    clisistemasalud   VARCHAR2(20),
    clidireccion      VARCHAR2(100) NOT NULL,
    clicomuna         VARCHAR2(50) NOT NULL,
    cliedad           NUMBER(3) NOT NULL,
    usuario_run         NUMBER(9) NOT NULL
)
LOGGING;

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( rutcliente  );

--SE CREA TABLA DETALLE DE CHEQUEO Y SU PK
CREATE TABLE detallechequeo (
    cumple_observaciones  VARCHAR2(120) NOT NULL,
    visita_idvisita       NUMBER(9) NOT NULL,
    chequeo_idchequeo     NUMBER(9) NOT NULL
)
LOGGING;

ALTER TABLE detallechequeo ADD CONSTRAINT detallechequeo_pk PRIMARY KEY ( visita_idvisita,
                                                                          chequeo_idchequeo );
--SE CREA TABLA DE MEJORAS Y SU PK
CREATE TABLE mejoras (
    idmejoras            NUMBER(9) NOT NULL,
    actividad            VARCHAR2(100) NOT NULL,
    descripcion          VARCHAR2(100),
    plazo                NUMBER(4) NOT NULL,
    asesoria_idasesoria  NUMBER(9) NOT NULL
)
LOGGING;

ALTER TABLE mejoras ADD CONSTRAINT mejoras_pk PRIMARY KEY ( idmejoras );

--SE CREA TABLA DE PAGOS Y SU PK
CREATE TABLE pagos (
    idpagos                NUMBER(9) NOT NULL,
    fechapago              DATE NOT NULL,
    monto                  NUMBER NOT NULL,
    mes                    VARCHAR2(20) NOT NULL,
    año                    NUMBER(4) NOT NULL,
    cliente_rutcliente   NUMBER(9) NOT NULL
)
LOGGING;

ALTER TABLE pagos ADD CONSTRAINT pagos_pk PRIMARY KEY ( idpagos );

--SE CREA TABLA DE PROFESIONALES Y SU PK
CREATE TABLE profesional (
    run                 NUMBER(9) NOT NULL,
    nombres             VARCHAR2(30) NOT NULL,
    apellidos           VARCHAR2(50) NOT NULL,
    telefono            NUMBER(11) NOT NULL,
    tituloprofesional   VARCHAR2(50) NOT NULL,
    proyecto            VARCHAR2(50) NOT NULL,
    usuario_run           NUMBER(9) NOT NULL
)
LOGGING;

ALTER TABLE profesional ADD CONSTRAINT profesional_pk PRIMARY KEY ( run  );

--SE CREA TABLA DE USUARIOS Y SU PK
CREATE TABLE usuario (
    nombre           VARCHAR2(30) NOT NULL,
    apellido         VARCHAR2(50) NOT NULL,
    fechanacimiento  DATE NOT NULL,
    run              NUMBER(9) NOT NULL,
    tipousuario      VARCHAR2(20)
)
LOGGING;

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( run );

--SE CREA TABLA VISITA Y SU PK
CREATE TABLE visita (
    idvisita               NUMBER(9) NOT NULL,
    visfecha               DATE NOT NULL,
    vishora                DATE,
    vislugar               VARCHAR2(50) NOT NULL,
    viscomentarios         VARCHAR2(250) NOT NULL,
    cliente_rutcliente   NUMBER(9) NOT NULL
)
LOGGING;

ALTER TABLE visita ADD CONSTRAINT visita_pk PRIMARY KEY ( idvisita );

--SE ALTERA TABLA ACCIDENTE CON SU FK
ALTER TABLE accidente
    ADD CONSTRAINT accidente_cliente_fk FOREIGN KEY ( cliente_rutcliente  )
        REFERENCES cliente  ( rutcliente  );

--SE ALTERA TABLA ADMINISTRATIVO CON SU FK
ALTER TABLE administrativo
    ADD CONSTRAINT administrativo_usuario_fk FOREIGN KEY ( usuario_run )
        REFERENCES usuario ( run )
    NOT DEFERRABLE;

--SE ALTERA TABLA ASESORIA CON SU FK
ALTER TABLE asesoria
    ADD CONSTRAINT asesoria_profesional_fk FOREIGN KEY ( profesional_run  )
        REFERENCES profesional ( run  )
    NOT DEFERRABLE;

--SE ALTERA TABLA ASISTENTE CON SU FK
ALTER TABLE asistentes
    ADD CONSTRAINT asistentes_capacitacion_fk FOREIGN KEY ( capacitacion_idcapacitacion )
        REFERENCES capacitacion ( idcapacitacion )
    NOT DEFERRABLE;

--SE ALTERA TABLA CAPACITACION CON SU FK
ALTER TABLE capacitacion
    ADD CONSTRAINT capacitacion_cliente_fk FOREIGN KEY ( cliente_rutcliente  )
        REFERENCES cliente ( rutcliente  )
    NOT DEFERRABLE;

--SE ALTERA TABLA CLIENTE CON SU FK
ALTER TABLE cliente
    ADD CONSTRAINT cliente_usuario_fk FOREIGN KEY ( usuario_run )
        REFERENCES usuario ( run )
    NOT DEFERRABLE;

--SE ALTERA TABLA DETALLE DE CHEQUEO CON SUS FK
ALTER TABLE detallechequeo
    ADD CONSTRAINT detallechequeo_chequeo_fk FOREIGN KEY ( chequeo_idchequeo )
        REFERENCES chequeo ( idchequeo )
    NOT DEFERRABLE;
ALTER TABLE detallechequeo
    ADD CONSTRAINT detallechequeo_visita_fk FOREIGN KEY ( visita_idvisita )
        REFERENCES visita ( idvisita )
    NOT DEFERRABLE;

--SE ALTERA TABLA MEJORAS CON SU FK
ALTER TABLE mejoras
    ADD CONSTRAINT mejoras_asesoria_fk FOREIGN KEY ( asesoria_idasesoria )
        REFERENCES asesoria ( idasesoria )
    NOT DEFERRABLE;

--SE ALTERA TABLA PAGOS CON SU FK
ALTER TABLE pagos
    ADD CONSTRAINT pagos_cliente_fk FOREIGN KEY ( cliente_rutcliente  )
        REFERENCES cliente ( rutcliente  )
    NOT DEFERRABLE;

--SE ALTERA TABLA PROFESIONAL CON SU FK 
ALTER TABLE profesional
    ADD CONSTRAINT profesional_usuario_fk FOREIGN KEY ( usuario_run )
        REFERENCES usuario ( run )
    NOT DEFERRABLE;

--SE ALTERA TABLA VISITA CON SU FK
ALTER TABLE visita
    ADD CONSTRAINT visita_cliente_fk FOREIGN KEY ( cliente_rutcliente  )
        REFERENCES cliente ( rutcliente  )
    NOT DEFERRABLE;

--SE CREA SECUENCIA PARA TABLA MEJORAS
CREATE SEQUENCE mejoras_idmejoras_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER mejoras_idmejoras_trg BEFORE
    INSERT ON mejoras
    FOR EACH ROW
    WHEN ( new.idmejoras IS NULL )
BEGIN
    :new.idmejoras := mejoras_idmejoras_seq.nextval;
END;
/
--SE CREA SECUENCIA PARA TABLA PAGOS
CREATE SEQUENCE pagos_idpagos_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER pagos_idpagos_trg BEFORE
    INSERT ON pagos
    FOR EACH ROW
    WHEN ( new.idpagos IS NULL )
BEGIN
    :new.idpagos := pagos_idpagos_seq.nextval;
END;
/

--SE CREAN REGISTROS PARA TABLA USUARIOS
INSERT INTO usuario values ('rosita', 'rosales', TO_DATE('02/10/1980', 'DD/MM/YYYY'), 123123456, 'cliente');
INSERT INTO usuario values ('juanita', 'flores', TO_DATE('31/01/1978', 'DD/MM/YYYY'), 123456456, 'cliente');
INSERT INTO usuario values ('emilio', 'perez', TO_DATE('15/10/1974', 'DD/MM/YYYY'), 111123456, 'cliente');
INSERT INTO usuario values ('joaquin', 'moralez', TO_DATE('22/06/1990', 'DD/MM/YYYY'), 182345673, 'administrativo');
INSERT INTO usuario values ('manuel', 'lopez', TO_DATE('05/02/1988', 'DD/MM/YYYY'), 178883994, 'administrativo');
INSERT INTO usuario values ('olga', 'medina', TO_DATE('12/12/1983', 'DD/MM/YYYY'), 165556732, 'administrativo');
INSERT INTO usuario values ('carlos', 'carmona', TO_DATE('13/01/1990', 'DD/MM/YYYY'), 912345678, 'profesional');
INSERT INTO usuario values ('alfredo', 'perez', TO_DATE('12/12/1992', 'DD/MM/YYYY'), 159806431, 'profesional');
INSERT INTO usuario values ('felipe', 'flores', TO_DATE('30/05/1998', 'DD/MM/YYYY'), 912456778, 'profesional');

--SE CREAN REGISTROS PARA TABLA CLIENTES
INSERT INTO cliente values (123456748, 'rosita', 'rosales', 5555555, 'modelo', 'fonasa', 'calle c', 'colina', 40, 123123456);
INSERT INTO cliente values (129467767, 'juanita', 'flores', 6666666, 'modelo', 'fonasa', 'calle 3', 'colina', 42, 123456456);
INSERT INTO cliente values (456874578, 'emilio', 'perez', 5556663, 'modelo', 'fonasa', 'calle a', 'valparaiso', 46, 111123456);

--SE CREAN REGISTROS PARA TABLA CAPACITACION
INSERT INTO capacitacion values(1, TO_DATE('02/11/2020', 'DD/MM/YYYY'), TO_DATE('12:00:00' , 'HH24:MI:SS'), 'colina', 120, 123456748);
INSERT INTO capacitacion values(2, TO_DATE('04/08/2020', 'DD/MM/YYYY'), TO_DATE('12:00:00' , 'HH24:MI:SS'), 'colina', 60, 129467767);
INSERT INTO capacitacion values(3, TO_DATE('12/07/2020', 'DD/MM/YYYY'), TO_DATE('12:00:00' , 'HH24:MI:SS'), 'colina', 80, 456874578);

--SE CREAN REGISTROS PARA TABLA ASISTENTES
INSERT INTO asistentes values(1, 'Juan Miguel Henriquez Vera', 55, 'jhenriquez@gmail.com', 888777999, 1);
INSERT INTO asistentes values(2, 'Irene Belén García Mena', 45, 'Irene.Ga@gmail.com', 888666633, 2);
INSERT INTO asistentes values(3, 'Daniel Matías Correa Ruiz', 35, 'danimati@gmail.com', 888999888, 3);

--SE CREAN REGISTROS PARA TABLA VISITA
INSERT INTO visita values(1, TO_DATE('02/11/2020', 'DD/MM/YYYY'), TO_DATE('12:00:00' , 'HH24:MI:SS'), 'colina', 'muy limpio', 123456748);
INSERT INTO visita values(2, TO_DATE('31/07/2020', 'DD/MM/YYYY'), TO_DATE('15:00:00' , 'HH24:MI:SS'), 'colina', 'no tan limpio', 129467767);
INSERT INTO visita values(3, TO_DATE('15/08/2020', 'DD/MM/YYYY'), TO_DATE('17:00:00' , 'HH24:MI:SS'), 'colina', 'limpio', 456874578);

--SE CREAN REGISTROS PARA TABLA CHEQUEO
INSERT INTO chequeo values(1, 'chequeo 1');
INSERT INTO chequeo values(2, 'chequeo 2');
INSERT INTO chequeo values(3, 'chequeo 3');

--SE CREAN REGISTROS PARA TABLA DETALLE CHEQUEO
INSERT INTO detallechequeo values('si, cumple', 1, 1);
INSERT INTO detallechequeo values('si, cumple', 2, 2);
INSERT INTO detallechequeo values('no, cumple', 3, 3);

--SE CREAN REGISTROS PARA TABLA ACCIDENTE
INSERT INTO accidente values (1, TO_DATE('15/04/2003', 'DD/MM/YYYY'), TO_DATE('13:00:00' , 'HH24:MI:SS'), 'colina', 'laboral', 'leve', 123456748);
INSERT INTO accidente values (2, TO_DATE('20/07/2010', 'DD/MM/YYYY'), TO_DATE('14:30:00' , 'HH24:MI:SS'), 'colina', 'laboral', 'leve', 129467767);
INSERT INTO accidente values (3, TO_DATE('08/02/2000', 'DD/MM/YYYY'), TO_DATE('18:45:00' , 'HH24:MI:SS'), 'colina', 'laboral', 'leve', 456874578);
INSERT INTO accidente values (4, TO_DATE('25/08/2013', 'DD/MM/YYYY'), TO_DATE('10:15:00' , 'HH24:MI:SS'), 'colina', 'laboral', 'leve', 456874578);
INSERT INTO accidente values (5, TO_DATE('13/09/2020', 'DD/MM/YYYY'), TO_DATE('13:00:00' , 'HH24:MI:SS'), 'colina', 'laboral', 'leve', 456874578);

--SE CREAN REGISTROS PARA TABLA PAGOS
INSERT INTO pagos values (1, TO_DATE('15/11/2020', 'DD/MM/YYYY'), 1000000, 'agosto', 2019, 123456748);
INSERT INTO pagos values (2, TO_DATE('17/10/2020', 'DD/MM/YYYY'), 50000, 'mayo', 2020, 129467767);
INSERT INTO pagos values (3, TO_DATE('05/12/2020', 'DD/MM/YYYY'), 650000, 'agosto', 2020, 456874578);

--SE CREAN REGISTROS PARA TABLA ADMINISTRATIVO
INSERT INTO administrativo values(182345673, 'joaquin esteban', 'morales abarca', 'joacomorales@gmail.com', 'ventas', 182345673 );
INSERT INTO administrativo values(178883994, 'manuel arturo', 'lopez fuentes', 'arturito@gmail.com', 'RR.HH.', 178883994);
INSERT INTO administrativo values(165556732, 'olga marina', 'medina troncoso', 'olguitamarina@gmail.com', 'finanzas',  165556732);

--SE CREAN REGISTROS PARA TABLA PROFESIONAL
INSERT INTO profesional values (912345678, 'Carlos saul', 'carmona soto', 56987361256, 'ing. comercial', 'construccion vespucio', 912345678);
INSERT INTO profesional values (159806431, 'alfredo alex', 'perez palacio', 56933814912, 'prevencionista de riesgo', 'reparacion matta ', 159806431);
INSERT INTO profesional values (912456778, 'felipe florencio', 'flores feliz', 56944982345, 'administracion de empresa', 'construccion grecia', 912456778);

--SE CREAN REGISTROS PARA TABLA ASESORIA 
INSERT INTO asesoria values (000345987, TO_DATE('15/09/2021','DD/MM/YYYY'), 'mala gestion', 912345678);
INSERT INTO asesoria values (000548791, TO_DATE('20/06/2021','DD/MM/YYYY'), 'mala comunicacion', 159806431);
INSERT INTO asesoria values (000451234, TO_DATE('01/03/2021','DD/MM/YYYY'), 'mala desempeño laboral', 912456778);

--SE CREAN REGISTROS PARA TABLA MEJORAS
insert into mejoras values (000000023, 'reunion para coordinar mejor la gestion', 'se les solicitara asistir a reunion para mejorar los aspectos', 5, 000345987);
insert into mejoras values (000000345, 'charla para mejorar la comunicacion', 'se les informara el dia y la hora para asistir a la charla', 4, 000548791);
insert into mejoras values (000000456, 'nuevos proedimientos de trabajo', 'se les llamara a reunion para informar nuevos procedimientos de trabajo', 12, 000451234);
--SE REALIZA UN COMMIT PARA CONFIRMAR DATOS
commit;

--SE REALIZAN LAS CONSULTAS
select a.asistnombrecompleto, a.asistedad, a.asistcorreo
from ((asistentes a
inner join capacitacion c ON c.idcapacitacion = a.capacitacion_idcapacitacion)
inner join cliente cl on cl.rutcliente = c.cliente_rutcliente)
where rutcliente = 123456748;

select ch.idchequeo, ch.nombrechequeo, d.cumple_observaciones
from (((chequeo ch
inner join detallechequeo d ON ch.idchequeo = d.chequeo_idchequeo)
inner join visita v on v.idvisita = d.visita_idvisita)
inner join cliente cl on cl.rutcliente = v.cliente_rutcliente)
where cl.clicomuna = 'valparaiso';

select a.idaccidente, a.accifecha, TO_CHAR(a.accihora, 'HH24:MI:SS'), a.accilugar, a.acciorigen,a.acciconsecuencias, c.clinombres, c.cliapellidos, c.clitelefono
from accidente a 
inner join cliente c ON c.rutcliente = a.cliente_rutcliente;







