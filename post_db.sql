create database post_db;

use post_db;

create table post(
	id int primary key auto_increment,
    title nvarchar(250),
    content nvarchar(10000)
)