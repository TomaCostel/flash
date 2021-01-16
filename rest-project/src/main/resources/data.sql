DROP TABLE IF EXISTS persoane;

CREATE TABLE 	persoane(
	id INT AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(250) NOT NULL,
	last_name VARCHAR(250) NOT NULL,	
	varsta INT,
	nationalitate VARCHAR(250)

);
INSERT INTO persoane(first_name,last_name,varsta,nationalitate) VALUES
	('Costel','Gica',17,'ROM');
INSERT INTO persoane(first_name,last_name,varsta,nationalitate) VALUES
	('Mihai','Geroge',18,'ROM');
INSERT INTO persoane(first_name,last_name,varsta,nationalitate) VALUES
	('Gigel','Ionica',21,'ROM');			