drop table users;

create table users (
	userId varchar2(12) primary key,
	password varchar2(12) not null,
	name varchar2(12) not null,
	email varchar2(50)
)

insert into users values('javajigi', 'password', '자바지기', 'javajigi@slipp.net');