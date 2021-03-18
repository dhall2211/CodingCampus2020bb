
use mondial;

select * from country;
select * from geo_lake;
select * from located;
select * from language;
select * from population;
select * from ethnicgroup;
select * from continent;
select * from locatedon;
select * from organization;
select * from politics;



-- 1. Durch welche Ländern fließt der Rhein?


select distinct country.name
from  geo_river
join country on geo_river.country = country.code
where geo_river.river = 'Rhein' ;

-- 2. Welche Ländern liegen am Bodensee?
select distinct country.name
from  geo_lake
join country on geo_lake.country = country.code
where geo_lake.lake = 'Bodensee' ;


-- 3. Durch welche Ländern fließt der Rhein, die NICHT am Bodensee liegen?


select distinct country.name
from  geo_river
join country on geo_river.country = country.code
where geo_river.river = 'Rhein' and country.name not in ( 
	select  country.name
	from  geo_lake
	join country on geo_lake.country = country.code
	where geo_lake.lake = 'Bodensee'
) ;
    


-- 4. Welche Sprachen sind offizielle Sprachen in Europa die keine Sprache sind in anderen Kontinenten?
select distinct language.name
from language
join encompasses on encompasses.Country = language.Country
where continent = 'Europe' and language.name not in 
	(
	select language.name
	from language
	join encompasses on encompasses.Country = language.Country
	where continent <> 'Europe'
    ) ;



-- Gyulas Loesung

select distinct language.name 
from language
join encompasses on language.Country = encompasses.Country
where Continent = 'Europe' and language.name not in(
	select language.name 
	from language
	join encompasses on language.Country = encompasses.Country
	where not Continent = 'Europe'
    /* where Continent <> 'Europe'*/
    );

-- 5. Wie viel Ländern verwenden mindensten 2 ofiziellen Sprachen?
select country, count(name)
from language
group by country
having count(name) >=2 ;

-- Eric
SELECT 
    name, COUNT(country)
FROM
    mondial.language
GROUP BY country
HAVING COUNT(country) >= 2;



-- 6. Wie viele Ländern in Europa verwenden ausschließlich 1 Sprache?

select country.name
from country
join encompasses on encompasses.country = country.code
join language on language.country = country.code
where language.Percentage = 100 and encompasses.continent = 'Europe'
order by country.name;



-- Irene
select Country.Name
from language
left join country on country.code = language.Country
join encompasses on encompasses.Country = Country.code
WHERE language.Percentage = 100 AND Continent = 'Europe'
ORDER BY Country.Name;

-- 7. Erstelle eine Abfrage die als Ergebnis "Schönes Wochenenede!" wünscht

select 	 'schönes Wochenende'as "verabschieden";

select 'bokhee' as 'Hallo';

#Allgemein에 메시지 보내기