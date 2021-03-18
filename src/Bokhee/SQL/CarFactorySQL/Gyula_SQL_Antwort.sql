select car.brand, car.type, engine.power
from engine
join carengine on engine.id = carengine.engineID
join car on car.id = carengine.carID
join (
	select brand, max(power) maxPower
	from engine
	join carengine on engine.id = carengine.engineID
	join car on car.id = carengine.carID
	group by brand
) maxPowerBrand on car.brand = maxPowerBrand.brand
where engine.power = maxPowerBrand.maxPower

/*
select brand, car.type, assembleDays from engine
join carengine on engine.id = carengine.engineID
join car on car.id = carengine.carID
order by power DESC
limit 3;
*/