create database emp_dept;
use emp_dept;
drop table dept;
create table dept(
deptNumber int,
deptName varchar(50)
);
drop table employee;
create table employee(
empid int,
empName varchar(50),
empSalary double,
deptNumber int
);


select * from dept;
select * from employee;
insert into dept values(30, "Analyst");
insert into employee values(1, "Mike",50,1);
insert into employee values(30, "john",100,30);
insert into employee values(31, "Light",50,30);
insert into employee values(32, "ford", 50, 30);
select distinct employee.empName from employee where employee.deptNumber = 30 order by employee.empSalary desc limit 1;

drop table manager;
create table manager(
managerid int,
managerName varchar(50),
empid int
);
insert into manager values(1, "joe",30);
select * from manager;
select managerName, employee.empName from manager, employee where manager.empid = employee.empid;

select avg(empSalary) as averageSalary, dept.deptNumber as DepartmentNumber from employee, dept;

select e.empid, e.empname, e.deptNumber
from employee e
where e.empSalary >  
(select avg(empSalary) as averageSalary 
from employee e1, dept where e.deptNumber = e1.deptNumber
Group by e.deptNumber)
Group by e.deptNumber;

select e.empid, e.empname 
from employee e
where e.empName != "Ford" and e.empSalary =
(
select e1.empSalary
from employee e1
where e1.empName = "Ford"
);

Select e.*
from employee e, dept d
where d.deptName = "Analyst" and d.deptNumber = e.deptNumber;

select distinct e.*, d.deptName
from employee e, dept d
where d.deptNumber = e.deptNumber;

select e.*
from employee e, dept d
where e.deptNumber = d.deptNumber and (d.deptNumber = 10 or d.deptNumber = 30);

drop procedure proc_empname;
DELIMITER $$
USE `emp_dept`$$
CREATE PROCEDURE `proc_empname` (in empno int)
BEGIN
 select * from employee e where e.empid = empno;
END$$
DELIMITER ;
call proc_empname (1);

drop procedure proc_dname;
DELIMITER $$
USE `emp_dept`$$
CREATE PROCEDURE `proc_dname` (in empno int)
BEGIN
 select d.deptName from employee e, dept d 
 where e.empid = empno and d.deptNumber = e.deptNumber;
END$$
DELIMITER ;
call proc_dname(30);
create database mydb;
use mydb;
create table employee(id int,firstname varchar(20),lastname varchar(20));
insert into employee values(1001, "John", "Doe"); 
select * from employee;
Select Distinct * from employee e where e.id = 1001 ;
Delete  from employee where employee.id = 1001;

use mydb;
create table book(
id int,
title varchar(50),
author varchar(50),
price float
);
select * from book;
Select distinct * from book b where b.id = 1; 
Update book set book.title="cpp", book.author="tom",book.price=100 where book.id = 1;

select * from movie;
select * from user;
select * from user_role;
select * from user_movie;

CREATE TABLE SPRING_SESSION (
  PRIMARY_ID CHAR(36) NOT NULL,
  SESSION_ID CHAR(36) NOT NULL,
  CREATION_TIME BIGINT NOT NULL,
  LAST_ACCESS_TIME BIGINT NOT NULL,
  MAX_INACTIVE_INTERVAL INT NOT NULL,
  EXPIRY_TIME BIGINT NOT NULL,
  PRINCIPAL_NAME VARCHAR(100),
  CONSTRAINT SPRING_SESSION_PK PRIMARY KEY (PRIMARY_ID)
);
 
CREATE UNIQUE INDEX SPRING_SESSION_IX1 ON SPRING_SESSION (SESSION_ID);
CREATE INDEX SPRING_SESSION_IX2 ON SPRING_SESSION (EXPIRY_TIME);
CREATE INDEX SPRING_SESSION_IX3 ON SPRING_SESSION (PRINCIPAL_NAME);
 
CREATE TABLE SPRING_SESSION_ATTRIBUTES (
  SESSION_PRIMARY_ID CHAR(36) NOT NULL,
  ATTRIBUTE_NAME VARCHAR(200) NOT NULL,
  ATTRIBUTE_BYTES LONGVARBINARY NOT NULL,
  CONSTRAINT SPRING_SESSION_ATTRIBUTES_PK PRIMARY KEY (SESSION_PRIMARY_ID, ATTRIBUTE_NAME),
  CONSTRAINT SPRING_SESSION_ATTRIBUTES_FK FOREIGN KEY (SESSION_PRIMARY_ID) REFERENCES SPRING_SESSION(PRIMARY_ID) ON DELETE CASCADE
);
 
CREATE INDEX SPRING_SESSION_ATTRIBUTES_IX1 ON SPRING_SESSION_ATTRIBUTES (SESSION_PRIMARY_ID);



select * from book_seq;
show tables;
drop table book;
drop table book_seq;
select * from person;
select * from passport;
select * from post;
select * from comment;

select * from student;
select * from course;
select * from user_tbl;