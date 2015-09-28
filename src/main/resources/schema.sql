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


/* table : claims */
create table claims(
id integer auto_increment not null primary key,
policyNo integer(3),
policy_type varchar(10),
incident_type varchar(20),
title varchar(3) not null,
fName varchar(32) not null,
lName varchar(32) not null,
identityNo varchar(13) not null,
contactNo varchar(10) not null,
email varchar(30) not null,
incident_location varchar(32),
incident_date Date,
incident_description varchar(32),
passanger_status varchar(3),
noOfPassangers integer(3),
damage_description varchar(32),
police_report varchar(3)
);


