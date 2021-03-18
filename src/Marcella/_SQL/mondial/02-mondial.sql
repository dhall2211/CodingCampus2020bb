-- 1. Durch welche Ländern fließt der Rhein?
SELECT country.name
FROM country
JOIN geo_river ON country.code = geo_river.Country
WHERE geo_river.River = 'Rhein'
GROUP BY country.name;

-- 2. Welche Ländern liegen am Bodensee?
SELECT country.name
FROM country
JOIN geo_lake ON country.code = geo_lake.Country
WHERE geo_lake.Lake = 'Bodensee'
GROUP BY country.name;

-- 3. Durch welche Ländern fließt der Rhein, die NICHT am Bodensee liegen?
SELECT c 
FROM (
	SELECT country.name c FROM country
	JOIN geo_river ON country.code = geo_river.Country
	WHERE geo_river.River = 'Rhein') A
WHERE c NOT IN (
	SELECT country.name FROM country
	JOIN geo_lake ON country.code = geo_lake.Country
	WHERE geo_lake.Lake = 'Bodensee') 
GROUP BY c;

-- alternativ
SELECT country.name
FROM (
	SELECT geo_river.Country R FROM geo_River
	WHERE geo_river.River = 'Rhein') A
JOIN country ON country.code = A.R    
WHERE A.R NOT IN (
	SELECT geo_lake.Country FROM geo_Lake
	WHERE geo_lake.Lake = 'Bodensee') 
GROUP BY country.name;

-- 4. Welche Sprachen sind offizielle Sprachen in Europa die keine Sprache sind in anderen Kontinenten?
SELECT distinct language.Name FROM language
JOIN encompasses ON language.Country = encompasses.Country
WHERE encompasses.Continent = 'Europe'
AND language.name NOT IN (
	SELECT distinct language.Name FROM language
	JOIN encompasses ON language.Country = encompasses.Country
	WHERE encompasses.Continent <> 'Europe');
        
-- 5. Wie viele Ländern verwenden mindensten 2 ofiziellen Sprachen?
SELECT count(*) FROM ( 
	SELECT language.Country, count(language.Name) languageCount FROM language
	GROUP BY language.Country) AS LC
WHERE languageCount >= 2;

-- 6. Alle Länder in Europa welche ausschließlich 1 Sprache verwenden?
SELECT Country.Name FROM (
	SELECT language.Country, count(language.Name) languageCount FROM language
	JOIN encompasses ON language.Country = encompasses.Country
	WHERE encompasses.Continent = 'Europe'
	GROUP BY language.Country) AS LC
    JOIN country ON LC.Country = Country.code
WHERE languageCount = 1;

-- 7. Erstelle eine Abfrage die als Ergebnis "Schönes Wochenenede!" wünscht
SELECT 'Schönes Wochenenede!' AS Wunsch;