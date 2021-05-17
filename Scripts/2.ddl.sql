create table MEMBER (
	ID 		 int auto_increment primary key,
	EMAIL 	 varchar(255),
	PASSWORD varchar(100),
	NAME 	 varchar(100),
	REGDATE  datetime,
	unique key (EMAIL) /*동일한 이메일은 들어갈수 없기에 unique 적용*/
);