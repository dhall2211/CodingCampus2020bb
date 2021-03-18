/* Erweitern der Tabelle CarEngine um die Produktionsdauer in Tagen (assembleDays), welches zum Pflichtfeld wird.
   Dabei sinnvolle Werte für die bestehenden Daten wählen.
*/
use CarFactory;

-- 1. ALTER TABLE (ADD COLUMN)
alter table CarEngine add column AssembleDays int;

-- 2. UPDATE (SET assembleDays)
update CarEngine set AssembleDays = 3
where EngineId in (3,4,5,6);

update CarEngine set AssembleDays = 2
where EngineId = 1;

update CarEngine set AssembleDays = 4
where EngineId = 2;

-- 3. ALTER TABLE (assembleDays NOT NULL)
alter table CarEngine modify AssembleDays int not null;