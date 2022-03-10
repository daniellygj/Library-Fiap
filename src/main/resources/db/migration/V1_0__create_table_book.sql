CREATE TABLE book (
    id integer not null auto_increment,
    title varchar(500) not null,
    page_qty integer default null,
    isbn varchar(50) default null,
    release_date timestamp default null,
    creation_date timestamp default null,
    update_date timestamp default null,
    primary key (id)
)