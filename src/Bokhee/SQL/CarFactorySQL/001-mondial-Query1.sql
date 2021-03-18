use mondial;
/*
SELECT * FROM city
order by city.population desc;

-- 1. Alle Ländern mit Haupstadt Größer als 5'000'000 Einwohner

select country.capital, country.name as country, city.population
from country
join city on city.name = country.capital
where city.population >= 5000000
order by city.population desc;

-- 2. Alle Ländern mit Hauptstadt mit Anfangbuchstaben 'B' oder 'C' oder 'D'
select country.name, country.capital 
from country
where capital like 'b%' or capital like 'c%' or capital like 'd%' 
order by capital;

-- 3. Alle Städte in Österreich (in der Schweiz)

select city.name
from city
where country = 'CH' ;

select city.name
from city
where country = (select Code from country where Name = 'Switzerland') ;



-- 4. Anzahl Städte pro Land (Länder sind alphabetisch sortiert)
select country.name, count(*) citytotal
from city
join country on country.code = city.country
group by country.name
order by citytotal  desc ;
*/

-- 5. Alle Nachbarländern von Österreich (von der Schweiz) -- siehe borders Tabelle
select * from borders;
select * from country;



select country.name as country,borders.country2 as border 
from country 
join borders on  borders.country1 = country.code 
where country.code = 'CH';




-- Maecella 6. Alle Ländern die Nachbarland von Österreich sind, aber nicht von der Schweiz
select country.name as country,borders.country2 as neighborCountry 
from country 
join borders on  borders.country1 = country.code 
where country.code = 'D' and borders.country2 <> 'CH';




-- 6. Alle Ländern die Nachbarland von Österreich sind, aber nicht von der Schweiz
select Country.Name
FROM (
    SELECT Country1 c FROM borders WHERE Country2 = 'D'
    UNION
    SELECT Country2 c FROM borders WHERE Country1 = 'D'
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
/*

-- 7. Top 10 Ländern mit den meisten Nachbarländern
select country.name, count(borders.country2) as neighborCountry 
from country
join borders on borders.country1 = country.code
group by country.name 
order by count(borders.country2) desc
limit 10; */



-- 8. Top 10 dichtesten bewohntes Land
/*select country.name as country, country.area / country.population as dencity
from country
order by mod(country.area/ country.population)
limit 10 ;

-- 9. Top 10 dichtesten bewohnten Bundesland in Deutschland -- siehe province Tabelle


-- 10. Top 10 Ländern mit dem meisten Bundesländer



/*
Mihael: -
Samet: Alle Städte von Österreich auflisten

select city.Name
from city
join country on country.code = city.Country
where country.name = 'Austria';

select city.Name
from city
where city.Country = (select code from country where name = 'Austria');
/


/
Lukas: 3 Tabelle miteinander verknüpfen?

select distinct Capital, Sea.Name, Sea.Depth
from country
join located on country.code = located.Country
join sea on located.Sea = Sea.Name
/


/ Alex: Top 10 dichtester bewohnes Bundesländer in Deutschland 
select Province.Name, ROUND(province.Population/province.Area,2) AS PopulationDensity
from province
join country on province.Country = Country.code
where country.Name = 'Germany'
order by PopulationDensity DESC
limit 10;
/

/ Irene: 10 Länder geordnet nach dem längsten Fluss (Land der Quelle)
select River.Name, Country.Name
from river 
left join geo_source on geo_source.River = river.Name
left join country on country.code = geo_source.Country
order by Length DESC limit 10;
/

/ Eric: Alle Nachbarländer von Österreich, die keine nachbarländer von der Schweiz 
select Country.Name
from
(
    select Country2 c from borders where country1 = 'A'
    UNION
    select Country1 c from borders where country2 = 'A'
) A
join country on A.c = country.code
Where A.c not in (
    select Country2 c from borders where country1 = 'CH'
    UNION
    select Country1 c from borders where country2 = 'CH'
    UNION
    select 'CH' c
);
/

/ Bokhee: Niedrigste Bevölkerungsdicte in Asien
select Country.Name, round(Population / Area, 2) PopDens
from encompasses
join country on encompasses.Country = Country.code
where encompasses.Continent = 'Asia' and Percentage > 50
order by PopDens ASC;
/

/ Ali: 10 Länder mit den Meisten nachbarländern
select country.Name, COUNT(*) na
from (
    select Country1 l, Country2 n from borders
    UNION
    select Country2 l, Country1 n from borders
) A
join Country on country.code = A.l
GROUP BY l
order by na DESC
limit 10
*/

/*
Sabrina: Welche Sprache hat in Europa die größten Anteil


select lang, SUM(nativeSpeaker) nativeSpeaker 
from
(
	select round(Population*language.Percentage/100) nativeSpeaker, language.Name lang, country.name countryName from language
	join country on language.Country = country.code
	join encompasses on encompasses.Country = Country.code
	where Continent = 'Europe'
) A
group by langencompasses
order by nativeSpeaker DESC;
*/