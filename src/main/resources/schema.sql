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
claim_no integer auto_increment not null primary key,
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






