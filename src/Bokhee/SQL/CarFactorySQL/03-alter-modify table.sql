/* Erweitern der Tabelle CarEngine um die Produktionsdauer in Tagen (assembleDays), 
welches zum Pflichtfeld wird.
   Dabei sinnvolle Werte für die bestehenden Daten wählen.
   
   */
   Use carfactory;
   
   -- 1. ALTER TABLE (ADD COLUMN)

/*ALTER table carengine
ADD column AssenbleDays int;

alter table carengine drop AssenbleDays;*/

alter table carengine 
add column assembleDays int;

    -- 2. UPDATE (SET assembleDays)
    
    update Carengine set assembleDays = 3
    where engineID in (3,4,5,6);
    
     update Carengine set assembleDays = 2
    where engineID = 1;
    
     update Carengine set assembleDays = 4
    where engineID = 2;
    
    -- 3. ALTER TABLE (assembleDays NOT NULL)
    ALTER TABLE Carengine modify assembleDays int NOT NULL;