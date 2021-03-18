-- 1. wie viel Tage dauert die Produktion der 3 "stärksten" (meisten Leistung) Autos?
SELECT sum(assembleDays)
FROM (select assembleDays
		FROM carEngine
		JOIN car ON car.id = carengine.carId
		JOIN Engine on Engine.id = CarEngine.EngineId
		ORDER BY power DESC
		LIMIT 3) top3power;

-- 2. Liste mit dem stärksten Auto pro Marke (greatest-n-per-group)
