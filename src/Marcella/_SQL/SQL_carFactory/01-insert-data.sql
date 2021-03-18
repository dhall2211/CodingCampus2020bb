SET SQL_SAFE_UPDATES = 0;

DELETE FROM CarEngine;
DELETE FROM Car;
DELETE FROM Engine;


INSERT INTO Car (id, brand, type)
VALUES 
(1, "VW", "Golf"),
(2, "VW", "Passat"),
(3, "Tesla", "X"),
(4, "Ferrari", "F40"),
(5, "Trabant", "601"),
(6, "Fiat", "500"),
(7, "Opel", "Prototyp v3");


INSERT INTO Engine (id, name, type, power)
VALUES 
(1, "Brushless v1", "Elektro", 50),
(2, "TDI 5.0", "Diesel", 200),
(3, "V12", "Benzin", 350),
(4, "T45", "Benzin", 45),
(5, "V6", "Benzin", 150),
(6, "V8", "Benzin", 250),
(7, "Hamsterrad", "Hamster", null);


INSERT INTO CarEngine (carId, EngineId)
VALUES 
(1, 2),
(1, 5),
(2, 1),
(2, 2),
(3, 1),
(4, 3),
(5, 4),
(6, 5), 
(6, 6);