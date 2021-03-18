SET SQL_SAFE_UPDATES = 0;
use notes;

drop table if exists users;
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

alter table notes add column userId int;

insert into users (name)
values ("Tick"), ("Trick"), ("Track");

update notes set userId = 1;

alter table notes add foreign key notes (userId) references users(id);
create index notes_i1 on notes(userId);