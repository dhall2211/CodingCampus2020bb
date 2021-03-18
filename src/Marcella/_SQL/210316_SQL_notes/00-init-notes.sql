DROP DATABASE IF EXISTS notes;
CREATE DATABASE notes;
USE notes;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
    userId int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30) NOT NULL);  -- NOT NULL bedeutet dieses Feld muss einen Wert haben
    
DROP TABLE IF EXISTS notes;
CREATE TABLE notes (
    notesId int AUTO_INCREMENT,
    text VARCHAR(500) NOT NULL, 
    created TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    userId int,
	PRIMARY KEY (notesId),
	FOREIGN KEY (userId) REFERENCES users(userId));
	

INSERT INTO users (name)
VALUES 
("Marcella"),
("Thomas"),
("Johanna"),
("Jos");

INSERT INTO notes (text, userId)
VALUES 
("My first commit.", 2);

INSERT INTO notes (text, userId)
VALUE
("Wow, it works!", 1);

