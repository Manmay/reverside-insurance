/* table : login */
create table login (
    id integer auto_increment not null primary key,
    user_name varchar(32) not null, 
    password varchar(32) not null, 
    enabled boolean not null,
    image varchar(128) not null,
    role varchar(16) not null
);

/* table : user_details */
create table user_details (
    id integer auto_increment not null primary key,
    username varchar(32) not null, 
    surname varchar(32) not null, 
    email varchar(32) not null,
    phone_no varchar(32) not null
);





