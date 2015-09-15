/* table : login */
create table login (
    id integer auto_increment not null primary key,
    user_name varchar(32) not null, 
    password varchar(32) not null, 
    enabled boolean not null,
    image varchar(128) not null,
    role varchar(16) not null
);
create table claims(
policyNo integer auto_increment not null primary key,
title varchar(3) not null,
name varchar(32) not null,
surname varchar(32) not null,
identityNo varchar(13) not null,
contactNo varchar(10) not null,
email varchar(30) not null
);
create table claimInformation(
claim_id
);





