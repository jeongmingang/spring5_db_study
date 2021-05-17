drop database if exists spring5;
create database spring5;

drop user if exists 'user_spring5'@'localhost';

grant all privileges 
	on spring5.* 
	to 'user_spring5' @'localhost' identified by 'rootroot';