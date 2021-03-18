SET SQL_SAFE_UPDATES = 0;

delete from CarEngine;
delete from Car;
-- truncate table Car;
insert into Car(id, brand, type)
values (1, "VW", "Golf"),
(2, "Tesla", "x"),
(3, "VW", "Passat"),
(4, "Farrari", "F40"),
(5, "Trabant", "P601"),
(6, "Fiat", "500"),
(7, "Opel", "Prototype v3");

delete from Engine;
insert into Engine (id, name, type, power)
values (1, "Elektromotor", "Elektro", 50),
(2,"TDI 5.0","Diesel", 200),
(3,"V12","Benzin", 350),
(4,"T56","Benzin", 45),
(5,"V6","Benzin", 150),
(6,"V8","Benzin", 250),
(7,"Hamsterrad","Hamster", 0);

delete from CarEngine;
insert into CarEngine (carId, engineId)
value (1,2),
(1,5),
(2,1),
(3,2),
(4,3),
(5,4),
(6,5),
(6,6);





