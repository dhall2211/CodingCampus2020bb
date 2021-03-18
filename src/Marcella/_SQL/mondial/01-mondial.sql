use mondial;

-- 1. Alle Ländern mit Haupstadt Größer als 5'000'000 Einwohner
SELECT country.name, city.name, city.population
FROM country
JOIN city on city.name = country.Capital
WHERE city.Population > 5000000
ORDER BY city.Population DESC;

-- 2. Alle Ländern mit Hauptstadt mit Anfangbuchstaben 'B' oder 'C' oder 'D'
SELECT country.name, country.Capital
FROM country
WHERE Capital LIKE 'B%' OR Capital LIKE 'C%' OR Capital LIKE 'D%';

-- 3. Alle Städte in Österreich (in der Schweiz)
SELECT city.name
FROM city
JOIN country on country.Code = city.Country
WHERE country.name = 'Austria';

SELECT city.name
FROM city
JOIN country on country.Code = city.Country
WHERE country.name = 'Switzerland';

-- 4. Anzahl Städte pro Land (Länder sind alphabetisch sortiert)
SELECT country.name, count(city.name)
FROM city
JOIN country on country.Code = city.Country
GROUP BY country.name
ORDER BY country.name ASC;

-- 5. Alle Länder die Nachbarländer zu Österreich (der Schweiz) sind
SELECT Country.name
FROM (
	SELECT Country1 c FROM borders WHERE Country2 = 'A'
	UNION
	SELECT Country2 c FROM borders WHERE Country1 = 'A'
) A
JOIN Country ON Code = a.c;

SELECT Country.name
FROM (
	SELECT Country1 c FROM borders WHERE Country2 = 'CH'
	UNION
	SELECT Country2 c FROM borders WHERE Country1 = 'CH'
) A
join Country on Code = a.c;

-- 6. Alle Ländern die Nachbarland von Österreich sind, aber nicht von der Schweiz
select Country.Name
FROM (
	SELECT Country1 c FROM borders WHERE Country2 = 'A'
	UNION
	SELECT Country2 c FROM borders WHERE Country1 = 'A'
) A
JOIN Country ON Code = a.c
LEFT JOIN
(
	SELECT Country1 c FROM borders WHERE Country2 = 'CH'
	UNION
	SELECT Country2 c FROM borders WHERE Country1 = 'CH'
	UNION
	SELECT 'CH' c
) B on a.c = b.c
WHERE b.c IS NULL;

-- alternativ
SELECT Country.Name
FROM (
	SELECT Country1 c FROM borders WHERE Country2 = 'A'
	UNION
	SELECT Country2 c FROM borders WHERE Country1 = 'A'
) A
JOIN Country ON Code = a.c
WHERE c NOT IN 
(
	SELECT Country1 c FROM borders WHERE Country2 = 'CH'
	UNION
	SELECT Country2 c FROM borders WHERE Country1 = 'CH'
    UNION
    SELECT 'CH' c
);

-- 7. Top 10 Ländern mit den meisten Nachbarländern
SELECT Country.Name, count(*) countryCount
FROM (
	SELECT Country1 l, country2 n FROM borders
	UNION
	SELECT Country2 l, country1 n FROM borders
) A
JOIN country ON country.code = A.l
GROUP BY l
ORDER BY countryCount DESC
LIMIT 10;

-- Lösung Klaus 
SELECT country c, SUM(neighbours) AS n FROM
(
(SELECT country1 AS country, count(country2) AS neighbours FROM borders
GROUP BY country)
UNION ALL
(SELECT country2 AS country, count(country1) AS neighbours FROM borders
GROUP BY country)
) AS sum
GROUP BY c
ORDER BY n DESC
LIMIT 10;


-- 8. Top 10 dichtesten bewohntes Land
SELECT country.name, ROUND(country.Population / country.area, 2) PopPer 
FROM country
ORDER BY PopPer DESC
Limit 10;

-- 9. Top 10 dichtesten bewohnten Bundesland in Deutschland -- siehe province Tabelle
SELECT province.name, ROUND(province.population / province.area, 2) PopPerPro
FROM province
JOIN country ON country.code = province.country
WHERE country.name = 'Germany'
ORDER BY PopPerPro DESC
Limit 10;




