CREATE DATABASE airport_db;
USE airport_db;

CREATE TABLE pilots (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    rank VARCHAR(50) NOT NULL,
    unique_code VARCHAR(255) NOT NULL UNIQUE,
    email VARCHAR(255) UNIQUE
);

CREATE TABLE planes (
	id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(100) NOT NULL,
    model VARCHAR(50) NOT NULL,
    passenger_amount INT NOT NULL,
    bort_number INT UNIQUE
);

CREATE TABLE flights (
	id INT AUTO_INCREMENT PRIMARY KEY,
    plane_id INT NOT NULL,
    pilot_id INT NOT NULL,
    date_f DATE NOT NULL,
    time_f TIME NOT NULL UNIQUE,
    FOREIGN KEY (plane_id) REFERENCES planes (id),
    FOREIGN KEY (pilot_id) REFERENCES pilots (id)
);