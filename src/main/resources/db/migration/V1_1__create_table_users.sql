create table USER (
     id bigint generated by default as identity,
     username varchar(100) not null,
     password varchar(100) not null,
     primary key (id)
)