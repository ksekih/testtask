CREATE TABLE IF NOT EXISTS users (
	id INT PRIMARY KEY,
	username VARCHAR (20) NOT NULL,
	fio VARCHAR (100),
	email VARCHAR (255) NOT NULL,
	birth DATE,
	sex BOOLEAN,
	photo BYTEA
);

create sequence IF NOT EXISTS user_seq increment by 1 start with 1;