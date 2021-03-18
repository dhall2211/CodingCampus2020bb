-- 1. Liste aller Autos
SELECT *
FROM Car; 


-- 2. Liste aller Motoren
SELECT *
FROM Engine; 


-- 3. Liste aller Automarken
SELECT DISTINCT brand -- DISTINCT fasst Redundanzen zusammen
FROM Car; 


-- 4. Liste aller Ausführungen von Autos (Auto + Motor) (JOIN)
SELECT concat(Car.brand, ", ",  Car.type) AS Car, Engine.name AS Engine
FROM CarEngine
JOIN Car ON Car.id = CarEngine.CarId
JOIN Engine ON Engine.id = CarEngine.EngineId;


-- 5. Liste aller Autos inkl. ihrer Ausführungen (auch weenn sie keinen Motor haben)  (OUTER JOIN)
SELECT concat(Car.brand, ", ",  Car.type) AS Car, Engine.name AS Engine
FROM Car
LEFT JOIN CarEngine ON Car.id = CarEngine.CarId
LEFT JOIN Engine ON CarEngine.EngineId = Engine.id;


-- 6. Liste aller Motoren mit Autos (auch wenn sie kein Auto haben) (OUTER JOIN)
SELECT Engine.name AS Engine, concat(Car.brand, ", ",  Car.type) AS Car
FROM Engine
LEFT JOIN CarEngine ON Engine.id = CarEngine.CarId
LEFT JOIN Car ON CarEngine.EngineId = Car.id;


-- 7. Liste aller Motoren und Autos (egal, ob sie einen Motor oder ein Auto haben) (FULL OUTER JOIN)
SELECT concat(Car.brand, " ", Car.type) as car, Engine.name as engine
FROM Car
LEFT JOIN carengine ON Car.id = carEngine.CarId
LEFT JOIN engine ON carEngine.EngineId = Engine.id
UNION
SELECT concat(Car.brand, " ", Car.type) as Car, Engine.name as Engine
FROM Engine
LEFT JOIN carEngine ON Engine.id = carEngine.EngineId
LEFT JOIN car ON carEngine.CarId = Car.id;


-- 8. Liste aller Ausführungen (Auto + Motor) mit Motorenleistung >= 150 (where)
SELECT concat(Car.brand, ", ",  Car.type) AS Car, Engine.name AS Engine
FROM CarEngine
JOIN Car ON Car.id = CarEngine.CarId
JOIN Engine ON Engine.id = CarEngine.EngineId
WHERE power >= 150;


-- 8.1. Liste aller Ausführungen (Auto + Motor) mit Motorenleistung zwischen 150 und 250 (where)
SELECT concat(Car.brand, ", ",  Car.type) AS Car, Engine.name AS Engine
FROM CarEngine
JOIN Car ON Car.id = CarEngine.CarId
JOIN Engine ON Engine.id = CarEngine.EngineId
WHERE power between 150 and 250;

-- 8.2.  Liste aller Ausführungen (Auto + Motor) mit Motorenleistung >= 150 (where), sortiert nach Leistung absteigend
SELECT concat(Car.brand, ", ",  Car.type) AS Car, Engine.name AS Engine
FROM CarEngine
JOIN Car ON Car.id = CarEngine.CarId
JOIN Engine ON Engine.id = CarEngine.EngineId
WHERE power >= 150 
ORDER BY power DESC;


-- 9. Liste aller Automarken mit Motoren deren Leistung >= 200 (distinct, where)
SELECT DISTINCT Car.brand
FROM car
LEFT JOIN CarEngine ON Car.id = CarEngine.CarId
LEFT JOIN Engine ON CarEngine.EngineId = Engine.id
WHERE power >= 200;


-- 10. Automarken, die 2 oder mehr Ausführungen (Auto + Motor) haben (group by, having, count)
SELECT Car.brand, count(*)
FROM CarEngine
JOIN Car ON Car.id = CarEngine.CarId
JOIN Engine ON Engine.id = CarEngine.EngineId
GROUP BY brand
having count(*) >=2;

-- 11. stärkster Motor (max, subquery)
SELECT *
FROM Engine
WHERE power = (SELECT max(power)
FROM Engine);

-- 11.1 stärkster Motor (order by, limit)
SELECT *
FROM Engine
ORDER BY power DESC
LIMIT 1;

-- 12. schwächster Motor (min, subquery)car
SELECT *
FROM Engine
WHERE power = (SELECT min(power)
FROM Engine);


