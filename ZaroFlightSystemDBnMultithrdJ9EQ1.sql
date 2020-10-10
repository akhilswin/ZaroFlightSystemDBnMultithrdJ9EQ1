create database ZaroFlightSystem ;
use ZaroFlightSystem;

create table flight
(
flightId int,
source char(30),
destination char(30),
noofseats int,
flightfare decimal(8,2)
);

insert into flight
values(18221,'Malaysia','Singapore',50,5000);

insert into flight
values(18222,'Dubai','Kochi',25,50000);

insert into flight
values(18223,'Malaysia','Singapore',150,6000);

insert into flight
values(18224,'Malaysia','Singapore',100,7000);
