DROP DATABASE IF EXISTS CarFactory;
CREATE DATABASE CarFactory;

USE CarFactory;

DROP TABLE IF EXISTS Car;
CREATE TABLE Car (
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
CREATE TABLE CarEngine (
    carId int,
    engineId int,
    PRIMARY KEY(carId, engineId),
    FOREIGN KEY (carId) REFERENCES Car(Id),
	FOREIGN KEY (engineId) REFERENCES Engine(Id)
);

CREATE INDEX CarEngine_I1
on CarEngine(CarId);

CREATE INDEX CarEngine_I2
on CarEngine(EngineId);