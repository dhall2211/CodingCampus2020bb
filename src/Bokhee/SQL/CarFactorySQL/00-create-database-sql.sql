
DROP DATABASE IF exists CarFactory;
CREATE DATABASE CarFactory;

USE CarFactory;

DROP TABLE  IF EXISTS Car;
CREATE TABLE Car(
id int auto_increment primary key,
brand varchar(30) NOT NULL,
type varchar(50) NOT NULL
);

DROP TABLE IF EXISTS Engine;
CREATE TABLE Engine (
id int auto_increment primary key,
name varchar(50) NOT NULL,
type varchar(30) NOT NULL,
power int 
);

DROP TABLE IF EXISTS CarEngine;
CREATE TABLE CarEngine(
carID int,
engineID int,
primary key(carID, engineID),
Foreign key(carID) references car(Id),
foreign key(engineID) references engine(Id)
);

CREATE INDEX CarEngine_I1
on CarEngine (carId);

CREATE INDEX CarEngine_I2
on CarEngine (engineId);

