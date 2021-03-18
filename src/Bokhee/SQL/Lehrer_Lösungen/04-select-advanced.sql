-- 1. wie viel Tage dauert die Produktion der 3 "stärksten" (meisten Leistung) Autos?
select sum(assembleDays)
from (select assembleDays
		from carengine
		join car on car.id = carengine.carId
		join engine on engine.id = carengine.engineId
		order by power desc
		limit 3) top3power;

-- 2. Liste mit dem stärksten Auto pro Marke (greatest-n-per-group)
