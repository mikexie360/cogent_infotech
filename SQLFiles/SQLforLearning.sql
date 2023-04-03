show databases;
use sakila;
show tables;


select 1+1;
select now();
select curdate();
select curtime();
select PI();
select mod(45,7);
select sqrt(25);

select * from actor;
----- order by
select * from actor order by first_name;
select * from actor order by last_name;
select * from actor order by first_name desc;
---- retrieving select columns from table
select first_name, last_name from actor;
select first_name, last_name from actor order by first_name desc;
---- Retreiving the data with filter condition and ordered by column;
select * from actor where first_name = "nick";
select actor_id, first_name, last_name from actor where first_name="nick" order by actor_id desc;
select actor_id, first_name, last_name from actor where actor_id>100 order by first_name, last_name desc;
---- retrieve empty result set
select * from actor where 1=2;
---- retrieve column name using aliases
select rental_date, inventory_id, return_date from rental;
select rental_date as RentalDate, Inventory_id as Filelistid, return_date as ReturnDate from rental;

select * from film;
select replacement_cost-rental_rate, film_id as FilmID, length/60 from film;
select replacement_cost-rental_rate as CostDiff, film_id as FilmId, length/60 as TimeInHour from film;
select rental_rate as RentalRate, rental_rate+3*4-1 as Result, (rental_rate + 3)*4-1 as Result2 from film;
---- retrieve result based on function
select * from actor;
---- can use as if you want
select amount, round(amount) Amnt, round(amount,1), floor(amount) FloorAmnt, ceiling(amount) CeilingAmnt from payment;
---- string operations
select * from actor;
select concat(first_name, " ",last_name) as FullName from actor;
select concat(first_name, " ",last_name) as FullName, concat(left(first_name,1))as FirstInitial from actor;
select concat(first_name, " ",last_name) as FullName, length(concat(first_name, " ", last_name)) as length from actor;
select concat(first_name, " ",last_name) as FullName,
reverse(concat(first_name," ",last_name)) as ReverseFullName,
replace(concat(first_name," ",last_name), "S","$") as ReplaceExample from actor;

--- date operations
--- date format functions
select concat(first_name," ",last_name) as FullName,
date_format(last_update,get_format(date,"EUR")) as LastUpdated1,
date_format(last_update,get_format(date,"ISO")) as LastUpdated2,
date_format(last_update,get_format(date,"USA")) as LastUpdated3 from actor;
select * from actor;
select rental_date,
dayofweek(rental_date) as DayOfWeek,
quarter(rental_date) as Quarter,
week(rental_date) as week,
monthname(rental_date) as MonthName from rental;

--- Distinct Operations
select * from actor;
select distinct first_name from actor;
select last_name from actor;
select distinct last_name from actor;
--- where clause comparison operators
select actor_id, first_name, last_name from actor where actor_id = 100;
select actor_id, first_name, last_name from actor where not actor_id=5;
--- IN
select * from actor where first_name not IN("nick","johnny","joe","vivien");
--- Subqueries
select * from actor where first_name in("nick","johnny","joe","vivien") or actor_id in(select actor_id from actor where last_name="degeneres");

Create Database test;
use test;
create table employee(
	emp_no int,
	emp_name varchar(40),
	emp_salary int
);
insert into employee values(10002,"Nick", 20000);
select * from employee;

create database cogentdb;
use cogentdb;
create table person(
id int,
first_name varchar(20),
last_name varchar(20)
);
select * from person;
insert into person values(1001, 'mike','xie');
DELIMITER $$
USE `cogentdb`$$
CREATE PROCEDURE `retreive_persons` ()
BEGIN
 select * from person;
END$$
DELIMITER ;







