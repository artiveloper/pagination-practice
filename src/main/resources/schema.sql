create table posts
(
	postno int auto_increment primary key,
	subject varchar(200) not null,
	content text null,
	writer varchar(50) not null,
	regdate timestamp default CURRENT_TIMESTAMP not null
);