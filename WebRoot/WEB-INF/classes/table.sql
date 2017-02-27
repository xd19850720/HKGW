CREATE TABLE T_FunctionPosition(
	functionPositionId int PRIMARY KEY auto_increment,
	functionId int,
	positionId int,
	isDel char(10)
)

CREATE TABLE T_Function(
	functionId int PRIMARY KEY auto_increment,
	functionCode varchar(50),
	functionName varchar(50),
	isDel char(10)
)

CREATE TABLE T_Department(
	deptID int PRIMARY KEY auto_increment,
	companyId int,
	companyName varchar(50),
	departmentName varchar(50),
	departmentCode varchar(50),
	isDel char(10)
)

CREATE TABLE T_Position(
	positionId int PRIMARY KEY auto_increment,
	positionCode varchar(50),
	positionName varchar(50),
	deptID int,
	isDel char(10)
)

CREATE TABLE T_Employee(
	employeeId int PRIMARY KEY auto_increment,
	employeeCode varchar(50),
	employeeName varchar(50),
	age int,
	sex int,//0 女  1 男
	tel varchar(20),
	mail varchar(20),
	positionId int,
	roleId int,
	isDel char(10)
)
#alter table t_employee drop column createtime
#alter table t_employee add createtime timestamp(6) not null DEFAULT CURRENT_TIMESTAMP();
#alter table t_employee add column roleId int not null default 0
#权限表
create table t_privilege
(
	privilegeId int PRIMARY KEY auto_increment,
	privilegeName varchar(100) not null unique,
	description varchar(255),
	isDel char(10) default "1"
);
#资源表
create table t_resource
(
	resourceId int PRIMARY KEY auto_increment,
	uri varchar(255) not null unique,
	description varchar(255),
	privilege_id varchar(40),
	isDel char(10) default "1"
);
#角色表
create table t_role
(
	roleId int PRIMARY KEY auto_increment,
	name varchar(100) not null unique,
	description varchar(255),
	isDel char(10) default "1"
);
#角色权限表
create table t_role_privilege
(
	id int PRIMARY KEY auto_increment,
	role_id int not null,
	privilege_id int not null,
	isDel char(10) default "1"
);
#职位角色表
create table t_employee_role
(
	id int PRIMARY KEY auto_increment,
	positionId int not null,
	role_id int not null,
	isDel char(10) default "1"
);






