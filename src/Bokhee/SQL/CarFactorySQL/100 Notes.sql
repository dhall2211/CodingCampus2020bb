
drop database if exists Notes;
Create database notes;
use Notes;

drop table if exists Notes;
CREATE TABLE Notes(
id int auto_increment primary key,
created timestamp(6) not null default current_timestamp(6),
text varchar(500) NOT NULL 
);

insert into Notes(text)
values ("my first comment");

insert into Notes(text)
values ("wow it works!");

select *
from Notes
order by created desc;


