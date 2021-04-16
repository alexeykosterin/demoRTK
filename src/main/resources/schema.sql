DROP TABLE IF EXISTS todo;
CREATE TABLE todo
(
    id number(38) not null primary key,
    description varchar(255) not null,
    created timestamp,
    modified timestamp,
    completed boolean
);

DROP TABLE IF EXISTS rateplans;
CREATE TABLE rateplans
(
    id number(38) not null primary key,
    name varchar(255) not null,
    deleted boolean,
    created timestamp,
    modified timestamp
);

insert into rateplans(id,name,created,modified,deleted)
values('1','Webstream 50',systimestamp,systimestamp,false);
insert into rateplans(id,name,created,modified,deleted)
values('2','Webstream 100',systimestamp,systimestamp,false);

insert into todo(id,description,created,modified,completed)
values('1','Webstream 50',systimestamp,systimestamp,false);
insert into todo(id,description,created,modified,completed)
values('2','Webstream 100',systimestamp,systimestamp,false);
insert into todo(id,description,created,modified,completed)
values('3','Webstream 150',systimestamp,systimestamp,false);
insert into todo(id,description,created,modified,completed)
values('4','Webstream 200',systimestamp,systimestamp,false);
insert into todo(id,description,created,modified,completed)
values('5','Webstream 250',systimestamp,systimestamp,false);
insert into todo(id,description,created,modified,completed)
values('6','Webstream 300',systimestamp,systimestamp,false);
insert into todo(id,description,created,modified,completed)
values('7','Webstream 350',systimestamp,systimestamp,false);
insert into todo(id,description,created,modified,completed)
values('8','Webstream 400',systimestamp,systimestamp,false);
insert into todo(id,description,created,modified,completed)
values('9','Webstream 450',systimestamp,systimestamp,false);
insert into todo(id,description,created,modified,completed)
values('10','Webstream 500',systimestamp,systimestamp,false);
insert into todo(id,description,created,modified,completed)
values('11','Webstream 550',systimestamp,systimestamp,false);
insert into todo(id,description,created,modified,completed)
values('12','Webstream 600',systimestamp,systimestamp,false);


