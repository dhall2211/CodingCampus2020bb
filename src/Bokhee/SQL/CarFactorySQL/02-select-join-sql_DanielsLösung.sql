use carfactory;
-- 1. Liste aller Autos
/*select *
from car;

-- 2. Liste aller Motoren
select *
from engine;

-- 3. Liste aller Automarken (keine Duplikate)
select distinct brand
from car;

-- 4. Liste aller Ausführungen von Autos (Auto + Motor) (JOIN)
select concat(car.brand, " ", car.type) as car, engine.name as engine
from carengine
join car on car.id = carengine.carId
join engine on engine.id = carengine.engineId;

-- 4. in "alter" Schreibweise (nicht SQL-92)
select concat(car.brand, " ", car.type) as car, engine.name as engine
from car, carengine, engine
where car.id = carengine.carId
and engine.id = carengine.engineId;

-- 5. Liste aller Autos inklusive ihrer Ausführungen (auch wenn sie keinen Motor haben) (OUTER JOIN)
select concat(car.brand, " ", car.type) as car, engine.name as engine
from car
left join carengine on car.id = carengine.carId
left join engine on carengine.engineId = engine.id;

-- 6. Liste aller Motoren mit Autos, auch wenn sie kein Auto haben (OUTER JOIN)
select engine.name as engine, concat(car.brand, " ", car.type) as car
from engine
left join carengine on engine.id = carengine.engineId
left join car on carengine.carId = car.id;

-- 7. Liste aller Motoren und Autos, egal ob die ein Motorr oder ein Auto haben (FULL OUTER JOIN über UNION)
select concat(car.brand, " ", car.type) as car, engine.name as engine
from car
left join carengine on car.id = carengine.carId
left join engine on carengine.engineId = engine.id
UNION
select concat(car.brand, " ", car.type) as car, engine.name as engine
from engine
left join carengine on engine.id = carengine.engineId
left join car on carengine.carId = car.id;

-- 8. Liste aller Ausführungen (Auto + Motor) mit Motorenleistung >= 150 (where)
select concat(car.brand, " ", car.type) as car, engine.name as engine, power
from carengine
join car on car.id = carengine.carId
join engine on engine.id = carengine.engineId
where power >= 150;

-- 8.1. Liste aller Ausführungen mit Motorenleistung zwischen 150 und 250 (where, between)
select concat(car.brand, " ", car.type) as car, engine.name as engine, power
from carengine
join car on car.id = carengine.carId
join engine on engine.id = carengine.engineId
where power between 150 and 250;

-- 8.2. Liste aller Ausführungen (Auto + Motor) mit Motorenleistung >= 150 (where), sortiert nach der Leistung absteigend
select concat(car.brand, " ", car.type) as car, engine.name as engine, power
from carengine
join car on car.id = carengine.carId
join engine on engine.id = carengine.engineId
where power >= 150
order by power desc;

-- 9. Liste aller Hersteller mit Motoren deren Leistung >= 200 (distinct, where)
select distinct car.brand, engine.power as power
from car
join carengine on carengine.carId = car.id
join engine on carengine.engineId = engine.id
where engine.power >= 200;

-- 10. Automarken, die 2 oder mehr Ausführungen (Auto + Motor) haben (group by, having, count)
select car.brand, count(car.brand)
from carengine
right join car on car.id = carengine.carId
join engine on engine.id = carengine.engineId
group by brand
having count(*) >= 1;

-- 11. stärkster Motor (max, subquery)
select car.brand, car.type, engine.power as power
from engine
join carengine on carengine.engineid = engine.id
join car on car.id = carengine.carid
where power = (select max(power)
				from engine);*/
/*
-- 12. schwächster Motor (min, subquery) A:
select car.brand, car.type, engine.power as power
from engine
join carengine on carengine.engineid = engine.id
join car on car.id = carengine.carid
where power = (select power 
				from engine
                limit 1);
-- 12. schwächster Motor (min, subquery) B:               

select car.brand, car.type, engine.power as power
from engine
join carengine on carengine.engineid = engine.id
join car on car.id = carengine.carid
where power = (select  min(power)
				from engine
                );*/
                
/*-- 1. wie viel Tage dauert die Produktion der 3 "stärksten" (meisten Leistung) Autos?
select car.brand, car.type, engine.power as power, carengine.assembleDays
from carengine
join engine on carengine.engineid = engine.id
join car on car.id = carengine.carid
order by power desc
limit 3;*/

-- Daniels Vorschlag
select  sum(top3power.assembleDays)
from (select assembleDays
		from carengine
		join car on car.id = carengine.carid
		join engine on engine.id = carengine.engineid
		order by engine.power desc
		limit 3) top3power;

select car.brand, car.type, assembleDays
		from carengine
		join car on car.id = carengine.carid
		join engine on engine.id = carengine.engineid
		order by engine.power desc
		limit 3;


-- 2. Liste mit dem stärksten Auto pro MarkeassembleDays                