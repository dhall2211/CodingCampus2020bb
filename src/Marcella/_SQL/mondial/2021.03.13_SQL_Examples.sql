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
*/


/*
Lukas: 3 Tabelle miteinander verknüpfen?

select distinct Capital, Sea.Name, Sea.Depth
from country
join located on country.code = located.Country
join sea on located.Sea = Sea.Name
*/


/* Alex: Top 10 dichtester bewohnes Bundesländer in Deutschland 
select Province.Name, ROUND(province.Population/province.Area,2) AS PopulationDensity
from province
join country on province.Country = Country.code
where country.Name = 'Germany'
order by PopulationDensity DESC
limit 10;
*/

/* Irene: 10 Länder geordnet nach dem längsten Fluss (Land der Quelle)
select River.Name, Country.Name
from river 
left join geo_source on geo_source.River = river.Name
left join country on country.code = geo_source.Country
order by Length DESC limit 10;
*/

/* Eric: Alle Nachbarländer von Österreich, die keine nachbarländer von der Schweiz 
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
*/

/* Bokhee: Niedrigste Bevölkerungsdicte in Asien
select Country.Name, round(Population / Area, 2) PopDens
from encompasses
join country on encompasses.Country = Country.code
where encompasses.Continent = 'Asia' and Percentage > 50
order by PopDens ASC;
*/

/* Ali: 10 Länder mit den Meisten nachbarländern
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

/* Lösung Klaus 
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
group by lang
order by nativeSpeaker DESC;
*/

/* Marcella: - */













