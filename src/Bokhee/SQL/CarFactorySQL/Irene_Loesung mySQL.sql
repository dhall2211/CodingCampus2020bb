/*
1. Durch welche Ländern fließt der Rhein?
2. Welche Ländern liegen am Bodensee?
3. Durch welche Ländern fließt der Rhein, die NICHT am Bodensee liegen?
4. Welche Sprachen sind offizielle Sprachen in Europa die keine Sprache sind in anderen Kontinenten?
5. Wie viel Ländern verwenden mindensten 2 ofiziellen Sprachen?
6. Wie viele Ländern in Europa verwenden ausschließlich 1 Sprache?
7. Erstelle eine Abfrage die als Ergebnis "Schönes Wochenenede!" wünscht
*/

-- 1. Durch welche Ländern fließt der Rhein?
select distinct Country.Name
from geo_river
left join country on country.code = geo_river.Country
WHERE geo_river.River = 'Rhein'
ORDER BY Country.Name;

-- 2. Welche Ländern liegen am Bodensee?
select distinct Country.Name
from geo_lake
left join country on country.code = geo_lake.Country
WHERE geo_lake.Lake= 'Bodensee'
ORDER BY Country.Name;

-- 3. Durch welche Ländern fließt der Rhein, die NICHT am Bodensee liegen?
select distinct Country.Name
from geo_river
left join country on country.code = geo_river.Country
WHERE geo_river.River = 'Rhein' AND Country NOT IN (
select distinct Country
from geo_lake
WHERE geo_lake.Lake= 'Bodensee')
ORDER BY Country.Name;

-- 4. Welche Sprachen sind offizielle Sprachen in Europa die keine Sprache sind in anderen Kontinenten?
select distinct language.Name lang from language
join country on language.Country = country.code
join encompasses on encompasses.Country = Country.code
where Continent = 'Europe' AND language.Name NOT IN (
select language.Name lang from language
join country on language.Country = country.code
join encompasses on encompasses.Country = Country.code
where Continent != 'Europe'
)
order by lang;

-- 5. Wie viel Ländern verwenden mindensten 2 ofiziellen Sprachen?
select distinct Country.Name
from language
left join country on country.code = language.Country
WHERE language.Percentage < 100
ORDER BY Country.Name;


-- 6. Wie viele Ländern in Europa verwenden ausschließlich 1 Sprache?
select Country.Name
from language
left join country on country.code = language.Country
join encompasses on encompasses.Country = Country.code
WHERE language.Percentage = 100 AND Continent = 'Europe'
ORDER BY Country.Name;

-- 7. Erstelle eine Abfrage die als Ergebnis "Schönes Wochenenede!" wünscht
SELECT 'ein schönes Wochenende!' as 'Ich wünsche euch';