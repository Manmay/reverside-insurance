/* table : login */
create table login (
    id integer auto_increment not null primary key,
    user_name varchar(32) not null, 
    password varchar(32) not null, 
    enabled boolean not null,
    image varchar(128) not null,
    role varchar(16) not null
);
<<<<<<< HEAD
=======


>>>>>>> eabe72196c95320bfe66d85f74c46d5d62024b7a
/* table : user_details */
create table user_details (
    id integer auto_increment not null primary key,
    username varchar(32) not null, 
    surname varchar(32) not null, 
    email varchar(32) not null,
    phone_no varchar(32) not null
);
<<<<<<< HEAD
/* Client table*/
create table client(
    id integer auto_increment not null primary key,
    policy_id integer null,
    claim_id integer null,
    first_name varchar(32)  not null,
    last_name varchar(32) not null,
    identity_no integer not null,
    contact_no varchar(32) not null,
    email varchar(256) not null,
    title varchar(32) not null,
    agent varchar(32) null,
    company_name varchar(64) null,
    physical_address varchar(256) not null,
    postal_address varchar(256) not null
);
/* Policy table*/
create table policy (
    id integer auto_increment not null primary key,
    client_id integer null,
    claim_id integer null,
    policy_type varchar(32) not null,
    policy_no integer null,     
    start_date varchar(32) not null,
    end_date varchar(32) not null,
    /*constraint policy_client_fk foreign key (client_id) references client(id)*/
);
/*table claims*/
create table claims(
    id integer auto_increment not null primary key,
    policy_id integer null,
    client_id integer null,
    title varchar(32) null,
    first_name varchar(16) null,
    last_name varchar(32) null,
    identity_no integer null,
    contact_no varchar(32) null,
    email varchar(256) not null,
    company_name varchar(32) null,
    agent varchar(32) null,
    physical_address varchar(256) null,
    postal_address varchar(256) null,
    incident_date varchar(32) null,   
    incident_loc varchar(32) null,   
    location varchar(32) null,
    occupation varchar(32) null,
    loss_type varchar(32) null,
    incident_desription varchar(256) null,
    third_party_name varchar(32) null,
    third_party_contact varchar(16) null,
    insurer_name varchar(32) null null,
    police_station_name varchar(32) null,
    report_date varchar(32) null,
    case_no varchar(32) null,
    images blob,
    additional_documents blob
    /*constraint claim_client_fk foreign key (client_id) references client(id),
    constraint claim_policy_fk foreign key (policy_id) references policy(id)*/
);
=======


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


>>>>>>> eabe72196c95320bfe66d85f74c46d5d62024b7a
