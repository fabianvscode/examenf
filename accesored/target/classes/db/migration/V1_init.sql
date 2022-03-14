CREATE TABLE usered
(
  id_user VARCHAR PRIMARY KEY NOT NULL,
  nombre VARCHAR DEFAULT NULL,
  email VARCHAR DEFAULT NULL,
  pass VARCHAR DEFAULT NULL,
  statu VARCHAR DEFAULT NULL

);

CREATE TABLE status
(
id_role VARCHAR PRIMARY KEY NOT NULL,
statu VARCHAR(500) NOT NULL,
description VARCHAR(500) NOT NULL
);

insert into status(statu, description) VALUES('1', 'ACTIVO');
insert into status(statu, description) VALUES('0', 'SUSPENDIDO');



