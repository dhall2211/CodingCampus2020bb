use carfactory;
-- 1. Liste aller Autos

/*SELECT *
from car;

select * 
from engine;

-- 3. Liste aller Automarken
select distinct brand
from car;

-- 4. Liste aller Ausführungen von Autos (Auto + Motor) (inner Join)
select concat(car.brand, " ", car.type ) as car, engine.name as Engine
from carengine
join car
on car.id = carengine.carId
join engine 
on engine.id = carengine.engineId;


-- 5. Liste aller Autos inklusivev ihrer Ausführungen (auch wenn sie keinen Motor haben)
 select concat(car.brand, " ", car.type ) as car, engine.name as Eng
 -- car.type, engine.power
 from car
 left join carengine 
 on car.id = carengine.carid
 left join 
 engine on  engine.id = carengine.engineid ;
 
-- 6. Liste aller Motoren mit Autos, auch wenn sie kein Auto haben (AUTO JOIN)
 select concat(car.brand, " ", car.type ) as car, engine.name as Eng
 -- car.type, engine.power
 from engine
 left join carengine 
 on engine.id = carengine.engineid
 left join car 
 on car.id = carengine.carid ;

-- 7. Liste aller Motoren und Autos, egal ob die ein Motor oder ein Auto haben (FULL OUTER JOIN)
select *
from carengine
full join car on carengine.carid = car.carid
join engine on careigine.engine.id = engine.engineid;car


-- Daniels lösung
select concat(car.brand, " ", car.type) as car, engine.name as engine
from car
left join carengine on car.id = carengine.carId
left join engine on carengine.engineId = engine.id
UNION
select concat(car.brand, " ", car.type) as car, engine.name as engine
from engine
left join carengine on carengine.engineId = engine.id 
left join car on car.id = carengine.carId ;

-- 8. Liste aller Ausführungen (Auto + Motor) mit Motorenleistung >= 150 (where)
select concat(car.brand," ",car.type) as car, engine.name as engine, engine.power as power
from car
left join carengine on carengine.carid = car.id
left join engine on engine.id = carengine.engineid
where engine.power >= 150;

-- 8. Daniels Loesung
select concat(car.brand," ", car.type) as car, engine.name as engine,
engine.power as power 
from engine
join carengine on engine.id = carengine.engineid
join car on car.id = carengine.carid
where power >=150; */

/*-- 8.1. Liste aller Ausführungen mit Motorenleistung zwischen 150 und 250 (where)
select concat(car.brand," ", car.type) as car, engine.name as engine,
engine.power as power 
from engine
join carengine on engine.id = carengine.engineid
join car on car.id = carengine.carid
where power between 150 und 250;*/

-- 9. Liste aller Hersteller mit Motoren deren Leistung >= 200 (distinct, where)

-- 10. Automarken, die 2 oder mehr Ausführungen (Typen) haben (group by, having, count)

-- 11. stärkster Motor (max, subquery)

-- 12. schwächster Motor (min, subquery)


-- 1. wie viel Tage dauert die Produktion der 3 "stärksten" (meisten Leistung) Autos?
select  sum(top3power.assembleDays)
from (select assembleDays
		from carengine
		join car on car.id = carengine.carid
		join engine on engine.id = carengine.engineid
		order by engine.power desc
		limit 3) top3power;

-- bokhee Lösung

/*
select car.brand, car.type, sum(carengine.assembleDays) as Produk_Dauer
from carengine
left join car on car.id = carengine.carid
right join engine on engine.id = carengine.engineid
order by engine.power asc
limit 3;
*/


-- 2. Liste mit dem stärksten Auto pro Marke
/*select max(power), car.brand
from car
right join engine on carengine.engineid = engine.id
left join carengine on carengine.carid = car.id
group by car.brand
where engine.power;*/



