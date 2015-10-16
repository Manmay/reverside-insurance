/*login*/
insert into login (user_name, password, enabled, image, role) values('Elias', 'password01', true, '/img/reverside/elias.png', 'ASSOCIATE');
insert into login (user_name, password, enabled, image, role) values('Christy', 'password02', true, '/img/reverside/christy.jpg', 'ASSOCIATE');
insert into login (user_name, password, enabled, image, role) values('Nkosiathi', 'password03', true, '/img/reverside/nkosiathi.jpg', 'ASSOCIATE');
insert into login (user_name, password, enabled, image, role) values('Rhulani', 'password04', true, '/img/reverside/rhulani.jpg', 'ASSOCIATE');


insert into client (policy_id, claim_id, first_name, last_name, identity_no, contact_no, email, title, agent,
    company_name, physical_address, postal_address) values(100, 10, 'Easy E','#Bozza', 30, '011047089', 'eliasmaluleka.ellis@gmail.com',
    'Mr', 'myAgent', 'myCompany', '1223 Home Street', 'Same');

insert into policy(client_id, claim_id, policy_type, policy_no, start_date, end_date) values(1, 10, 'Vehicle',125, 'last Week', 'this Week');

insert into claims(policy_id,client_id, title, first_name, last_name, identity_no, contact_no, email, company_name, agent, 
    physical_address, postal_address, incident_date, incident_loc, location, occupation, loss_type, incident_desription, third_party_name, 
    third_party_contact, insurer_name, police_station_name, report_date, case_no) values(1, 1, 'Mr', 'Me','Last', 123, '011413256', 'me@gmail.com',
    'myCompany', 'MyAgent','1256 Marabi', '1452 Durban', 'today', 'Cape Town', 'Around', 'no', 'damage', 'bad', 'none', '0001', 
    'ABSA', 'SAPS', 'last Week', '012356h');

