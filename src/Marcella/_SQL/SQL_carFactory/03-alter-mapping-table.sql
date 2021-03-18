/* Erweitern der Tabelle CarEngine um die Produktionsdauer in Tagen (assembleDays), welches zum Pflichtfeld wird.
   Dabei sinnvolle Werte für die bestehenden Daten wählen.
    1. ALTER TABLE (ADD COLUMN)
    2. UPDATE (SET assembleDays)
    3. ALTER TABLE (assembleDays NOT NULL)
*/

-- 1. ALTER TABLE (ADD COLUMN)
ALTER TABLE CarEngine
ADD assembleDays int;

-- 2. UPDATE (SET assembleDays)
UPDATE CarEngine
SET assembleDays = 3
WHERE CarId = 1 and EngineId = 2;

UPDATE CarEngine
SET assembleDays = 3
WHERE CarId = 1 and EngineId = 5;

UPDATE CarEngine
SET assembleDays = 5
WHERE CarId = 2 and EngineId = 1;

UPDATE CarEngine
SET assembleDays = 5
WHERE CarId = 2 and EngineId = 2;

UPDATE CarEngine
SET assembleDays = 4
WHERE CarId = 3 and EngineId = 1;

UPDATE CarEngine
SET assembleDays = 6
WHERE CarId = 4 and EngineId = 3;

UPDATE CarEngine
SET assembleDays = 3
WHERE CarId = 5 and EngineId = 4;

UPDATE CarEngine
SET assembleDays = 20
WHERE CarId = 6 and EngineId = 5;

UPDATE CarEngine
SET assembleDays = 5
WHERE CarId = 6 and EngineId = 6;

-- 3. ALTER TABLE (assembleDays NOT NULL)
ALTER TABLE CarEngine MODIFY assembleDays int NOT NULL;



