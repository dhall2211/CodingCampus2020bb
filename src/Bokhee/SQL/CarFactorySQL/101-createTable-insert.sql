drop table if exists users;

CREATE TABLE users(
Id int auto_increment primary key,
name varchar(20) NOT NULL,
gender char(2) NOT NULL,
department varchar(10) NOT NULL
);

insert into users(id,name,gender,department) values (1,Park, M, IT),
(2, Hong, M, HR),
(3, Kim, M, Sales);



DROP TABLE IF EXISTS NotesUsers;
CREATE TABLE NotesUsers(
id int,
userID int,
primary key(id, usersID),

foreign key(userID) references users(Id)
);

CREATE INDEX NotesUsers_I1
on Notesusers (userId);

