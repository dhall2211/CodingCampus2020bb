SELECT min(power) FROM carfactory.engine;


select car.brand, car.type, engine.power as power
from engine
join carengine on carengine.engineid = engine.id
join car on car.id = carengine.carid
where power = (select  min(power)
				from engine
                );